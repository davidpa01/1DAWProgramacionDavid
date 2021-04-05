package capitulo08Build.controladores;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import capitulo08Build.clases.Concesionario;
import capitulo08Build.clases.Fabricante;


public class ControladorConcesionario {

	private static ControladorConcesionario instance = null;
	public Connection conn = null;

	/**
	 * 
	 * @return
	 */
	public static ControladorConcesionario getInstance () {
		if (instance == null) {
			instance = new ControladorConcesionario();
		}
		return instance;
	}
	
	
	/**
	 * 
	 */
	public ControladorConcesionario() {
		
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
	public Concesionario findPrimero () {
		Concesionario c = null;
		try {
			Statement s = this.conn.createStatement();
			ResultSet rs =  s.executeQuery("select * from tutorialjavacoches.concesionario order by id limit 1");
			if (rs.next()) {
				c = new Concesionario();
				c.setId(rs.getInt("id"));
				c.setCif(rs.getString("cif"));
				c.setNombre(rs.getString("nombre"));
				c.setLocalidad(rs.getString("localidad"));

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
	public Concesionario findUltimo () {
		Concesionario c = null;
		try {
			Statement s = this.conn.createStatement();
			ResultSet rs =  s.executeQuery("select * from tutorialjavacoches.concesionario order by id desc limit 1");
			if (rs.next()) {
				c = new Concesionario();
				c.setId(rs.getInt("id"));
				c.setCif(rs.getString("cif"));
				c.setNombre(rs.getString("nombre"));
				c.setLocalidad(rs.getString("localidad"));
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
	public Concesionario findSiguiente (int idActual) {
		Concesionario c = null;
		try {
			Statement s = this.conn.createStatement();
			ResultSet rs =  s.executeQuery("select * from tutorialjavacoches.concesionario where id > " + idActual + " order by id limit 1");
			if (rs.next()) {
				c = new Concesionario();
				c.setId(rs.getInt("id"));
				c.setCif(rs.getString("cif"));
				c.setNombre(rs.getString("nombre"));
				c.setLocalidad(rs.getString("localidad"));
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
	public Concesionario findAnterior (int idActual) {
		Concesionario c = null;
		try {
			Statement s = this.conn.createStatement();
			ResultSet rs =  s.executeQuery("select * from tutorialjavacoches.concesionario where id < " + idActual + " order by id desc limit 1");
			if (rs.next()) {
				c = new Concesionario();
				c.setId(rs.getInt("id"));
				c.setCif(rs.getString("cif"));
				c.setNombre(rs.getString("nombre"));
				c.setLocalidad(rs.getString("localidad"));
			}
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		return c;
	}

	/**
	 * 
	 * @param f
	 * @return
	 */
	public int modificar (Concesionario c) {
		int registrosAfectados = 0;
		try {
			Statement s = (Statement) this.conn.createStatement(); 

			registrosAfectados = s.executeUpdate ("update concesionario set cif='" + c.getCif() + "', " +
					" nombre='" + c.getNombre() + "', localidad='" + c.getLocalidad() + "' where id=" + c.getId() + ";");
		   	
			// Cierre de los elementos
			s.close();
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		return registrosAfectados;
		
	}
	
	
	/**
	 * 
	 * @return
	 */
	public List<Concesionario> findAll () {
		List<Concesionario> concesionario = new ArrayList<Concesionario>();
		try {
			Statement s = this.conn.createStatement();
			ResultSet rs =  s.executeQuery("select * from tutorialjavacoches.concesionario");
			while (rs.next()) {
				Concesionario c = new Concesionario();
				c.setId(rs.getInt("id"));
				c.setCif(rs.getString("cif"));
				c.setNombre(rs.getString("nombre"));
				c.setLocalidad(rs.getString("localidad"));

				concesionario.add(c);
			}
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		return concesionario;
	}

	/**
	 * 
	 * @param f
	 * @return
	 */
	public int nuevo (Concesionario c) {
		int registrosAfectados = 0;
		int idNuevoRegistro = 0;
		try {
			Statement s = (Statement) this.conn.createStatement(); 

			idNuevoRegistro = nextId();
			registrosAfectados = s.executeUpdate ("insert into concesionario values(" + idNuevoRegistro + ", " +
			"'" + c.getCif() + "', '" + c.getNombre() + "', '" + c.getLocalidad() + "');");
		   	
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

		String sql = "select max(id) from tutorialjavacoches.concesionario";
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
	public int eliminar(int id) {
		int registrosAfectados = 0;
		try {
			Statement s = (Statement) this.conn.createStatement(); 

			registrosAfectados = s.executeUpdate ("delete from concesionario where id=" + id + ";");
			
			// Cierre de los elementos
			s.close();
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		return registrosAfectados;
	}

	

	

}
