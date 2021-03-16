package capitulo07AccesoDatos.ejercicios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;


public class Ejercicio01 {
	
	private static Connection conn = null;
	
	
	public static Connection getConexion () throws SQLException {
		// Si es la primera vez que accedemos a la conexi�n, debemos instanciarla
		if (conn == null) {
			conectar();
		}
		// Compruebo si la conexi�n sigue estando activa
		while (!conn.isValid(5)) {
			conectar();
		}
		
		return conn;
	}
	
	
	private static void conectar () throws SQLException {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		   
			conn = (Connection) DriverManager.getConnection ("jdbc:mysql://localhost/tutorialjavacoches?serverTimezone=UTC","java", "1234");			   
		}
		catch (ClassNotFoundException ex) {
			System.out.println("Imposible acceder al driver Mysql");
		}
	}
	
	

	public static void main(String[] args) {
		
		int op = menu();
		
		try {
			conn = getConexion();
			
			do {
				switch (op) {
				case 1://mostrar listado 
					listado();
					break;
				case 2://añadir un registro 
					nuevo();
					break;
				case 3://eliminar un registro
					eliminar();
					break;
				case 4://modificar un registro
					modificar();
					break;
			
				default:
					System.out.println("Opción incorrecta, intentelo de nuevo.");
					break;
				}
				op = menu();
				System.out.println("");
			}while(op != 0);
			
			conn.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}
	
	/**
	 * 
	 * @return
	 */
	public static int menu() {
		System.out.println("");
		System.out.println("Menu");
		System.out.println("--------");
		System.out.println("");
		System.out.println("0.-Salir del programa.");
		System.out.println("1.-Listado.");
		System.out.println("2.-Nuevo.");
		System.out.println("3.-Eliminar.");
		System.out.println("4.-Editar.\n");
		System.out.println();
		int opcion = Integer.parseInt(JOptionPane.showInputDialog("Elija una opción"));
		return opcion;
	}

	
	
	/**
	 * 
	 */
	private static void listado() {
		
		try {
						
			Statement s = (Statement) conn.createStatement(); 
			
			ResultSet rs = s.executeQuery ("select * from fabricante");
		   
			while (rs.next()) { 
				System.out.println (rs.getInt("id") + " " + rs.getString (2)+ 
						" " + rs.getString(3)); 
			}
			
			rs.close();
			s.close();
			
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	private static void nuevo() {

		try {
			
			String nombre = JOptionPane.showInputDialog("Introduce un nombre: ");
			
			String cif = JOptionPane.showInputDialog("Introduce el cif: ");
			
			Statement s = (Statement) conn.createStatement(); 
			
			int rs = s.executeUpdate("insert into fabricante values(" + nextIdEnTabla(conn, "Fabricante") + ",'" + cif + "','" + nombre + "')");
			
			s.close();
			
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
	/**
	 * 
	 */
	private static void eliminar() {
		
		try {
			
			String nombre = JOptionPane.showInputDialog("Introduce el nombre que desea eliminar: ");
			
			Statement s = (Statement) conn.createStatement(); 
						
			int rs = s.executeUpdate("delete from fabricante where nombre = '" + nombre + "'");
			
			s.close();
			
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	private static void modificar() {
		try {
			
			String nombre = JOptionPane.showInputDialog("Introduce el nombre que desea Modificar: ");

			String nuevoNombre = JOptionPane.showInputDialog("Introduce el nuevo nombre: ");

			String cif = JOptionPane.showInputDialog("Introduce el nuevo cifc: ");

			Statement s = (Statement) conn.createStatement(); 
						
			int rs = s.executeUpdate("update fabricante set cif = '" + cif + "', nombre = '" + nuevoNombre + "' where nombre = '" + nombre + "'");
			
			s.close();
			
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	private static int nextIdEnTabla (Connection conn, String tabla) throws SQLException {
		return maxIdEnTabla(conn, tabla) + 1;
	}
	
	
	
	
	private static int maxIdEnTabla (Connection conn, String tabla) throws SQLException {
		Statement s = (Statement) conn.createStatement();

		String sql = "select max(id) from tutorialjavacoches." + tabla;
		ResultSet rs = s.executeQuery(sql);
		int max = 1; 
		if (rs.next() ) {
			max = rs.getInt(1);
		}
		rs.close();
		s.close();
		return max;
	}
	
	
	
	
}
