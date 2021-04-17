package capitulo07AccesoDatos.jpa.controladores;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import capitulo07AccesoDatos.jpa.entities.Concesionario;
import capitulo07AccesoDatos.jpa.entities.Fabricante;

;


public class ControladorConcesionario {

	private static ControladorConcesionario instance = null;
	public EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("1DAWProgramacion");

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
	
	}
	
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	public Concesionario find(int id) {
		Concesionario f = null;
		EntityManager em = entityManagerFactory.createEntityManager();
		f = (Concesionario) em.find(Concesionario.class, id);
		em.close();
		return f;
		
	}
	
	
	/**
	 * 
	 * @return
	 */
	public Concesionario findPrimero () {
		Concesionario c = null;
		EntityManager em = entityManagerFactory.createEntityManager();

		Query q = em.createNativeQuery("select * from tutorialjavacoches.concesionario order by id limit 1", Concesionario.class); 

		c = (Concesionario) q.getSingleResult();
		
		em.close();
		return c;
	}
	
	
	/**
	 * 
	 * @return
	 */
	public Concesionario findUltimo () {
		Concesionario c = null;
		EntityManager em = entityManagerFactory.createEntityManager();

		Query q = em.createNativeQuery("select * from tutorialjavacoches.concesionario order by id desc limit 1", Concesionario.class); 

		c = (Concesionario) q.getSingleResult();
		
		em.close();
		return c;
	}


	/**
	 * 
	 * @param idActual
	 * @return
	 */
	public Concesionario findSiguiente (int idActual) {
		Concesionario c = null;
		EntityManager em = entityManagerFactory.createEntityManager();

		Query q = em.createNativeQuery("select * from tutorialjavacoches.concesionario where id > ? order by id limit 1", Concesionario.class);
		q.setParameter(1, idActual);

		c = (Concesionario) q.getSingleResult();
		
		em.close();
		return c;
	}

	/**
	 * 
	 * @param idActual
	 * @return
	 */
	public Concesionario findAnterior (int idActual) {
		Concesionario c = null;
		EntityManager em = entityManagerFactory.createEntityManager();

		Query q = em.createNativeQuery("select * from tutorialjavacoches.concesionario where id < ? order by desc id limit 1", Concesionario.class);
		q.setParameter(1, idActual);

		c = (Concesionario) q.getSingleResult();
		
		em.close();
		return c;
	}

	/**
	 * 
	 * @param f
	 * @return
	 */
	public boolean guardar (Concesionario f) {
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
	 * @return
	 */
	public List<Concesionario> findAll () {
		EntityManager em = entityManagerFactory.createEntityManager();
		
		Query q = em.createNativeQuery("SELECT * FROM Concesionario;", Concesionario.class);
		
		List<Concesionario> listf = (List<Concesionario>) q.getResultList();
		
		em.close();
		
		return listf;
	}

	
	

	/**
	 * 
	 * @param id
	 * @return
	 */
	public void eliminar(Concesionario c) {
		EntityManager em = entityManagerFactory.createEntityManager();
		em.getTransaction().begin();
		c = em.merge(c);
		em.remove(c);
		em.getTransaction().commit();
		em.close();
	}

	

	

}
