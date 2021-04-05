package capitulo08Build.controladores;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import capitulo08Build.clases.Cliente;
import capitulo08Build.clases.Coche;
import capitulo08Build.clases.Fabricante;


public class ControladorCliente {

	private static ControladorCliente instance = null;
	public Connection conn = null;
	
	private SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy/MM/dd");


	/**
	 * 
	 * @return
	 */
	public static ControladorCliente getInstance () {
		if (instance == null) {
			instance = new ControladorCliente();
		}
		return instance;
	}
	
	
	/**
	 * 
	 */
	public ControladorCliente() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = (Connection) DriverManager.getConnection ("jdbc:mysql://localhost/tutorialjavacoches?serverTimezone=UTC","java", "1234");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	/**
	 * 
	 * @return
	 */
	public Cliente findPrimero () {
		Cliente c = null;
		try {
			Statement s = this.conn.createStatement();
			ResultSet rs =  s.executeQuery("select * from tutorialjavacoches.cliente order by id limit 1");
			if (rs.next()) {
				c = new Cliente();
				c.setId(rs.getInt("id"));
				c.setNombre(rs.getString("nombre"));
				c.setApellido(rs.getString("apellidos"));
				c.setLocalidad(rs.getString("localidad"));
				c.setDniNIe(rs.getString("dniNie"));
				c.setFecha(rs.getDate("fechaNac"));
				c.setActivo(rs.getBoolean("activo"));

			}
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		return c;
	}
	
	/**
	 * 
	 * @return
	 */
	public Cliente findUltimo () {
		Cliente c = null;
		try {
			Statement s = this.conn.createStatement();
			ResultSet rs =  s.executeQuery("select * from tutorialjavacoches.cliente order by id desc limit 1");
			if (rs.next()) {
				c = new Cliente();
				c.setId(rs.getInt("id"));
				c.setNombre(rs.getString("nombre"));
				c.setApellido(rs.getString("apellidos"));
				c.setLocalidad(rs.getString("localidad"));
				c.setDniNIe(rs.getString("dniNie"));
				c.setFecha(rs.getDate("fechaNac"));
				c.setActivo(rs.getBoolean("activo"));

			}
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		return c;
	}
	
	
	public Cliente findSiguiente (int idActual) {
		Cliente c = null;
		try {
			Statement s = this.conn.createStatement();
			ResultSet rs =  s.executeQuery("select * from tutorialjavacoches.cliente where id > " + idActual + " order by id limit 1");
			if (rs.next()) {
				c = new Cliente();
				c.setId(rs.getInt("id"));
				c.setNombre(rs.getString("nombre"));
				c.setApellido(rs.getString("apellidos"));
				c.setLocalidad(rs.getString("localidad"));
				c.setDniNIe(rs.getString("dniNie"));
				c.setFecha(rs.getDate("fechaNac"));
				c.setActivo(rs.getBoolean("activo"));

			}
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		return c;
	}
	
	
	public Cliente findAnterior (int idActual) {
		Cliente c = null;
		try {
			Statement s = this.conn.createStatement();
			ResultSet rs =  s.executeQuery("select * from tutorialjavacoches.cliente where id < " + idActual + " order by id desc limit 1");
			if (rs.next()) {
				c = new Cliente();
				c.setId(rs.getInt("id"));
				c.setNombre(rs.getString("nombre"));
				c.setApellido(rs.getString("apellidos"));
				c.setLocalidad(rs.getString("localidad"));
				c.setDniNIe(rs.getString("dniNie"));
				c.setFecha(rs.getDate("fechaNac"));
				c.setActivo(rs.getBoolean("activo"));

			}
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		return c;
	}
	

	
	/**
	 * 
	 * @param cl
	 * @return
	 */
	public int modificar (Cliente cl) {
		int regsAfectados = 0;
		try {
			Statement s = this.conn.createStatement();
			
			regsAfectados = s.executeUpdate("update tutorialjavacoches.cliente set nombre='" + cl.getNombre() + 
					"', apellidos='" + cl.getApellido() + "', localidad='" + cl.getLocalidad() + "', dniNie='" + cl.getDniNIe() + 
					"', fechaNac='" + this.formatoFecha.format(cl.getFecha()) + "', activo=" + cl.isActivo() + " where id=" + cl.getId() + ";");
			
			s.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return regsAfectados;
	}
	
	/**
	 * 
	 * @param f
	 * @return
	 */
	public int nuevo (Cliente cl) {
		int regsAfectados = 0;
		int idNuevoReg = 0;
		try {
			Statement s = this.conn.createStatement();
			
			idNuevoReg = nextId();
			
			regsAfectados = s.executeUpdate("insert into tutorialjavacoches.cliente values(" + idNuevoReg + ", '" + cl.getNombre() + 
					"', '" + cl.getApellido() + "', '" + cl.getLocalidad() + "', '" + cl.getDniNIe() + 
					"', '" + this.formatoFecha.format(cl.getFecha()) + "', " + cl.isActivo() + ");");
			
			s.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return idNuevoReg;
	}
	
	/**
	 * 
	 * @return
	 * @throws SQLException
	 */
	public int nextId () throws SQLException {
		Statement s = this.conn.createStatement();
		ResultSet rs = s.executeQuery("select MAX(id) from tutorialjavacoches.cliente");
		int max = 1;
		if (rs.next()) {
			max = rs.getInt(1);
		}
		rs.close();
		s.close();
		return max + 1;
	}
	
	/**
	 * 
	 * @param f
	 * @return
	 */
	public int eliminar (int id) {
		int regsAfectados = 0;
		try {
			Statement s = this.conn.createStatement();
			
			regsAfectados = s.executeUpdate("delete from tutorialjavacoches.cliente where id=" + id + ";");
			
			s.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return regsAfectados;
	}
	
	
	
	
	public List<Cliente> findAll () {
		List<Cliente> clientes = new ArrayList<Cliente>();
		try {
			Statement s = this.conn.createStatement();
			ResultSet rs = s.executeQuery("select * from tutorialjavacoches.cliente");
			while (rs.next()) {
				Cliente cl = new Cliente();
				cl.setId(rs.getInt("id"));
				cl.setNombre(rs.getString("nombre"));
				cl.setApellido(rs.getString("apellidos"));
				cl.setLocalidad(rs.getString("localidad"));
				cl.setDniNIe(rs.getString("dniNie"));
				cl.setFecha(rs.getDate("fechaNac"));
				cl.setActivo(rs.getBoolean("activo"));
				clientes.add(cl);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return clientes;
	}

	

	

}
