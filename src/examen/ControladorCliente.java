package examen;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class ControladorCliente {
	
	private static ControladorCliente instance = null;
	public Connection conn = null;
	
	
	
	/**
	 * 
	 * @return
	 */
	public static ControladorCliente getInstance() {
		
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
			conn = (Connection) DriverManager.getConnection ("jdbc:mysql://localhost/examenclientes?serverTimezone=UTC","root", "1234");
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
	
	
	/**
	 * 
	 * @return
	 */
	public Cliente findPrimero() {
		Cliente c = null;
		
		try {
			Statement s = this.conn.createStatement();
			ResultSet rs =  s.executeQuery("select * from examenclientes.cliente order by id limit 1");
			if (rs.next()) {
				c = new Cliente();
				c.setId(rs.getInt("id"));
				c.setNombre(rs.getString("nombre"));
				c.setApellidos(rs.getString("apellidos"));
				c.setLocalidad(rs.getString("localidad"));
				c.setDniNie(rs.getString("dniNie"));
				c.setEmail(rs.getString("email"));

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
			ResultSet rs =  s.executeQuery("select * from examenclientes.cliente order by id desc limit 1");
			if (rs.next()) {
				c = new Cliente();
				c.setId(rs.getInt("id"));
				c.setNombre(rs.getString("nombre"));
				c.setApellidos(rs.getString("apellidos"));
				c.setLocalidad(rs.getString("localidad"));
				c.setDniNie(rs.getString("dniNie"));
				c.setEmail(rs.getString("email"));

			}
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		return c;
	}
	
	
	/**
	 * 
	 * @param idActual
	 * @return
	 */
	public Cliente findSiguiente (int idActual) {
		Cliente c = null;
		try {
			Statement s = this.conn.createStatement();
			ResultSet rs =  s.executeQuery("select * from examenclientes.cliente where id > " + idActual + " order by id limit 1");
			if (rs.next()) {
				c = new Cliente();
				c.setId(rs.getInt("id"));
				c.setNombre(rs.getString("nombre"));
				c.setApellidos(rs.getString("apellidos"));
				c.setLocalidad(rs.getString("localidad"));
				c.setDniNie(rs.getString("dniNie"));
				c.setEmail(rs.getString("email"));
			}
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		return c;
	}

	
	/**
	 * 
	 * @param idActual
	 * @return
	 */
	public Cliente findAnterior (int idActual) {
		Cliente c = null;
		try {
			Statement s = this.conn.createStatement();
			ResultSet rs =  s.executeQuery("select * from examenclientes.cliente where id < " + idActual + " order by id desc limit 1");
			if (rs.next()) {
				c = new Cliente();
				c.setId(rs.getInt("id"));
				c.setNombre(rs.getString("nombre"));
				c.setApellidos(rs.getString("apellidos"));
				c.setLocalidad(rs.getString("localidad"));
				c.setDniNie(rs.getString("dniNie"));
				c.setEmail(rs.getString("email"));
			}
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		return c;
	}
	
	/**
	 * 
	 * @param c
	 * @return
	 */
	public int modificar (Cliente c) {
		int registrosAfectados = 0;
		try {
			Statement s = (Statement) this.conn.createStatement(); 

			registrosAfectados = s.executeUpdate ("update examenclientes.cliente set nombre='" + c.getNombre() + "', " +
					" apellidos='" + c.getApellidos() + "', " + " localidad='" + c.getLocalidad() + "', " +
					" dniNie='" + c.getDniNie() + "', " +
					" email='" + c.getEmail() +"' where id=" + c.getId() + ";");
		   	
			s.close();
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		return registrosAfectados;
		
	}
	
	/**
	 * 
	 * @param f
	 * @return
	 */
	public int nuevo (Cliente c) {
		int registrosAfectados = 0;
		int idNuevoRegistro = 0;
		try {
			Statement s = (Statement) this.conn.createStatement(); 

			idNuevoRegistro = nextId();
			registrosAfectados = s.executeUpdate ("insert into examenclientes.cliente values(" + idNuevoRegistro + ", " +
			"'" + c.getNombre() + "', '" + c.getApellidos() + "', '" + c.getLocalidad() + "', '" + c.getDniNie() + "', '" + c.getEmail() + "');");
		   	
			// Cierre de los elementos
			s.close();
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		return idNuevoRegistro;

	}
	
	/**
	 * 
	 * @return
	 * @throws SQLException
	 */
	private int nextId () throws SQLException {
		Statement s = (Statement) this.conn.createStatement();

		String sql = "select max(id) from examenclientes.cliente";
		ResultSet rs = s.executeQuery(sql);
		int max = 1; 
		if (rs.next() ) {
			max = rs.getInt(1);
		}
		rs.close();
		s.close();
		return max + 1;
	}
	
	
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	public int borrar(int id) {
		int registrosAfectados = 0;
		try {
			Statement s = (Statement) this.conn.createStatement(); 

			registrosAfectados = s.executeUpdate ("delete from examenclientes.cliente where id=" + id + ";");
			
			// Cierre de los elementos
			s.close();
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		return registrosAfectados;
	}



	
	
	

}
