package capitulo07AccesoDatos.jpa.controladores;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import capitulo07AccesoDatos.jpa.entities.Cliente;
import capitulo07AccesoDatos.jpa.entities.Fabricante;


public class ControladorCliente {

	private static ControladorCliente instance = null;
	public EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("1DAWProgramacion");
	


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
	}
	
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	public Cliente find(int id) {
		Cliente f = null;
		EntityManager em = entityManagerFactory.createEntityManager();
		f = (Cliente) em.find(Cliente.class, id);
		em.close();
		return f;
		
	}
	
	
	
	/**
	 * 
	 * @return
	 */
	public Cliente findPrimero () {
		Cliente c = null;
		EntityManager em = entityManagerFactory.createEntityManager();

		Query q = em.createNativeQuery("select * from tutorialjavacoches.cliente order by id limit 1", Cliente.class); 

		c = (Cliente) q.getSingleResult();
		
		em.close();
		
		return c;
	}
	
	/**
	 * 
	 * @return
	 */
	public Cliente findUltimo () {
		Cliente c = null;
		EntityManager em = entityManagerFactory.createEntityManager();

		Query q = em.createNativeQuery("select * from tutorialjavacoches.cliente order by id desc limit 1", Cliente.class); 

		c = (Cliente) q.getSingleResult();
		
		em.close();
		
		return c;
	}
	
	
	public Cliente findSiguiente (int idActual) {
		Cliente c = null;
		EntityManager em = entityManagerFactory.createEntityManager();

		Query q = em.createNativeQuery("select * from tutorialjavacoches.cliente where id > ? order by id limit 1", Cliente.class);
		q.setParameter(1, idActual);

		c = (Cliente) q.getSingleResult();
		
		em.close();
		
		return c;
	}
	
	
	public Cliente findAnterior (int idActual) {
		Cliente c = null;

		EntityManager em = entityManagerFactory.createEntityManager();

		Query q = em.createNativeQuery("select * from tutorialjavacoches.cliente where id < ? order by desc id limit 1", Cliente.class);
		q.setParameter(1, idActual);

		c = (Cliente) q.getSingleResult();
		
		em.close();
		
		return c;
	}
	

	
	/**
	 * 
	 * @param f
	 * @return
	 */
	public boolean guardar (Cliente f) {
		try {
			EntityManager em = entityManagerFactory.createEntityManager();
			em.getTransaction().begin();
			if (f.getId() == 0) {
				em.persist(f);
			}
			else {
				em.merge(f);
			}
			em.getTransaction().commit();
			em.close();
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}
	
	
	
	/**
	 * 
	 * @param f
	 * @return
	 */
	public void eliminar (Cliente c) {
		EntityManager em = entityManagerFactory.createEntityManager();
		em.getTransaction().begin();
		c = em.merge(c);
		em.remove(c);
		em.getTransaction().commit();
		em.close();
	}
	
	
	
	/**
	 * 
	 * @return
	 */
	public List<Cliente> findAll () {
		EntityManager em = entityManagerFactory.createEntityManager();
		
		Query q = em.createNativeQuery("SELECT * FROM Cliente;", Cliente.class);
		
		List<Cliente> listf = (List<Cliente>) q.getResultList();
		
		em.close();
		
		return listf;
	}

	

	

}
