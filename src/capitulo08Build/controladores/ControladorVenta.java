package capitulo08Build.controladores;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;

import capitulo08Build.clases.Cliente;
import capitulo08Build.clases.Coche;
import capitulo08Build.clases.Fabricante;
import capitulo08Build.clases.Venta;


public class ControladorVenta {

	private static ControladorVenta instance = null;
	public Connection conn = null;
	
	private SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy/MM/dd");


	/**
	 * 
	 * @return
	 */
	public static ControladorVenta getInstance () {
		if (instance == null) {
			instance = new ControladorVenta();
		}
		return instance;
	}
	
	
	/**
	 * 
	 */
	public ControladorVenta() {
		
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
	public Venta findPrimero () {
		Venta v = null;
		try {
			Statement s = this.conn.createStatement();
			ResultSet rs =  s.executeQuery("select * from tutorialjavacoches.venta order by id limit 1");
			if (rs.next()) {
				v = new Venta();
				v.setId(rs.getInt("id"));
				v.setIdCliente(rs.getInt("idCliente"));
				v.setIdConcesionario(rs.getInt("idConcesionario"));
				v.setIdCoche(rs.getInt("idCoche"));
				v.setFecha(rs.getDate("fecha"));
				v.setPrecioVenta(rs.getDouble("precioVenta"));

			}
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		return v;
	}
	
	/**
	 * 
	 * @return
	 */
	public Venta findUltimo () {
		Venta v = null;
		try {
			Statement s = this.conn.createStatement();
			ResultSet rs =  s.executeQuery("select * from tutorialjavacoches.venta order by id desc limit 1");
			if (rs.next()) {
				v = new Venta();
				v.setId(rs.getInt("id"));
				v.setIdCliente(rs.getInt("idCliente"));
				v.setIdConcesionario(rs.getInt("idConcesionario"));
				v.setIdCoche(rs.getInt("idCoche"));
				v.setFecha(rs.getDate("fecha"));
				v.setPrecioVenta(rs.getDouble("precioVenta"));

			}
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		return v;
	}
	
	
	public Venta findSiguiente (int idActual) {
		Venta v = null;
		try {
			Statement s = this.conn.createStatement();
			ResultSet rs =  s.executeQuery("select * from tutorialjavacoches.venta where id > " + idActual + " order by id limit 1");
			if (rs.next()) {
				v = new Venta();
				v.setId(rs.getInt("id"));
				v.setIdCliente(rs.getInt("idCliente"));
				v.setIdConcesionario(rs.getInt("idConcesionario"));
				v.setIdCoche(rs.getInt("idCoche"));
				v.setFecha(rs.getDate("fecha"));
				v.setPrecioVenta(rs.getDouble("precioVenta"));

			}
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		return v;
	}
	
	
	public Venta findAnterior (int idActual) {
		Venta v = null;
		try {
			Statement s = this.conn.createStatement();
			ResultSet rs =  s.executeQuery("select * from tutorialjavacoches.venta where id < " + idActual + " order by id desc limit 1");
			if (rs.next()) {
				v = new Venta();
				v.setId(rs.getInt("id"));
				v.setIdCliente(rs.getInt("idCliente"));
				v.setIdConcesionario(rs.getInt("idConcesionario"));
				v.setIdCoche(rs.getInt("idCoche"));
				v.setFecha(rs.getDate("fecha"));
				v.setPrecioVenta(rs.getDouble("precioVenta"));

			}
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		return v;
	}
	

	/**
	 * 
	 * @param f
	 * @return
	 */
	public int modificar (Venta v) {
		int registrosAfectados = 0;
		try {
			Statement s = (Statement) this.conn.createStatement(); 

			registrosAfectados = s.executeUpdate ("update venta set idCliente=" + v.getIdCliente() + 
					", idConcesionario=" + v.getIdConcesionario() + ", idCoche=" + v.getIdCoche() + 
					", fecha='" + this.formatoFecha.format(v.getFecha()) + "', precioVenta='" + v.getPrecioVenta() + "' where id=" + v.getId() + ";");
		   	
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
	 * @param f
	 * @return
	 */
	public int nuevo (Venta v) {
		int registrosAfectados = 0;
		int idNuevoRegistro = 0;
		try {
			Statement s = (Statement) this.conn.createStatement(); 

			idNuevoRegistro = nextId();
			registrosAfectados = s.executeUpdate ("insert into venta values(" + idNuevoRegistro + ", " +
			v.getIdCliente() + ", " + v.getIdConcesionario() + ", " + v.getIdCoche() + ", '" +  this.formatoFecha.format(v.getFecha()) + 
			"', " + v.getPrecioVenta() + ");");
		   	
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

		String sql = "select max(id) from tutorialjavacoches.venta";
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

			registrosAfectados = s.executeUpdate ("delete from venta where id=" + id + ";");
			
			// Cierre de los elementos
			s.close();
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		return registrosAfectados;
	}

	

	

}
