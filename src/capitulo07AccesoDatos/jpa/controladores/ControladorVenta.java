package capitulo07AccesoDatos.jpa.controladores;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import capitulo07AccesoDatos.jpa.entities.Fabricante;
import capitulo07AccesoDatos.jpa.entities.Venta;




public class ControladorVenta {

	private static ControladorVenta instance = null;
	public EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("1DAWProgramacion");


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
	
	}
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	public Venta find(int id) {
		Venta f = null;
		EntityManager em = entityManagerFactory.createEntityManager();
		f = (Venta) em.find(Venta.class, id);
		em.close();
		return f;
		
	}
	
	/**
	 * 
	 * @return
	 */
	public Venta findPrimero () {
		Venta v = null;
		EntityManager em = entityManagerFactory.createEntityManager();

		Query q = em.createNativeQuery("select * from tutorialjavacoches.venta order by id limit 1", Venta.class); 

		v = (Venta) q.getSingleResult();
		
		em.close();
		
		return v;
	}
	
	/**
	 * 
	 * @return
	 */
	public Venta findUltimo () {
		Venta v = null;
		EntityManager em = entityManagerFactory.createEntityManager();

		Query q = em.createNativeQuery("select * from tutorialjavacoches.venta order by id desc limit 1", Venta.class); 

		v = (Venta) q.getSingleResult();
		
		em.close();
		
		return v;
	}
	
	
	public Venta findSiguiente (int idActual) {
		Venta v = null;
		EntityManager em = entityManagerFactory.createEntityManager();

		Query q = em.createNativeQuery("select * from tutorialjavacoches.venta where id > ? order by id limit 1", Venta.class);
		q.setParameter(1, idActual);

		v = (Venta) q.getSingleResult();
		
		em.close();
		
		return v;
	}
	
	
	public Venta findAnterior (int idActual) {
		Venta v = null;
		EntityManager em = entityManagerFactory.createEntityManager();

		Query q = em.createNativeQuery("select * from tutorialjavacoches.venta where id < ? order by desc id limit 1", Venta.class);
		q.setParameter(1, idActual);

		v = (Venta) q.getSingleResult();
		
		em.close();
		
		return v;
	}
	

	/**
	 * 
	 * @param f
	 * @return
	 */
	public boolean guardar (Venta v) {
		try {
			EntityManager em = entityManagerFactory.createEntityManager();
			em.getTransaction().begin();
			if (v.getId() == 0) {
				em.persist(v);
			}
			else {
				em.merge(v);
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
	 * @param id
	 * @return
	 */
	public void eliminar(Venta v) {
		EntityManager em = entityManagerFactory.createEntityManager();
		em.getTransaction().begin();
		v = em.merge(v);
		em.remove(v);
		em.getTransaction().commit();
		em.close();
	}

	
	
	public List<Venta> findAll () {
		EntityManager em = entityManagerFactory.createEntityManager();
		
		Query q = em.createNativeQuery("SELECT * FROM Venta;", Venta.class);
		
		List<Venta> listf = (List<Venta>) q.getResultList();
		
		em.close();
		
		return listf;
	}
	

	

}
