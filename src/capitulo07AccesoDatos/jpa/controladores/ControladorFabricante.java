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
import javax.persistence.TypedQuery;

import capitulo07AccesoDatos.jpa.entities.Fabricante;

public class ControladorFabricante {

	private static ControladorFabricante instance = null;
	public EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("1DAWProgramacion");


	/**
	 * 
	 * @return
	 */
	public static ControladorFabricante getInstance () {
		if (instance == null) {
			instance = new ControladorFabricante();
		}
		return instance;
	}
	
	
	/**
	 * 
	 */
	public ControladorFabricante() {
		
	}
	
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	public Fabricante find(int id) {
		Fabricante f = null;
		EntityManager em = entityManagerFactory.createEntityManager();
		f = (Fabricante) em.find(Fabricante.class, id);
		em.close();
		return f;
		
	}
	
	
	/**
	 * 
	 * @return
	 */
	public Fabricante findPrimero () {
		Fabricante f = null;
		
		EntityManager em = entityManagerFactory.createEntityManager();

		Query q = em.createNativeQuery("select * from tutorialjavacoches.fabricante order by id limit 1", Fabricante.class); 

		f = (Fabricante) q.getSingleResult();
		
		em.close();
		
		return f;
	}
	
	
	/**
	 * 
	 * @return
	 */
	public Fabricante findUltimo () {
		Fabricante f = null;
		
		EntityManager em = entityManagerFactory.createEntityManager();

		Query q = em.createNativeQuery("select * from tutorialjavacoches.fabricante order by id desc limit 1", Fabricante.class); 

		f = (Fabricante) q.getSingleResult();
		
		em.close();
		
		return f;
	}


	/**
	 * 
	 * @param idActual
	 * @return
	 */
	public Fabricante findSiguiente (int idActual) {
		Fabricante f = null;
		
		EntityManager em = entityManagerFactory.createEntityManager();

		Query q = em.createNativeQuery("select * from tutorialjavacoches.fabricante where id > ? order by id limit 1", Fabricante.class);
		q.setParameter(1, idActual);

		f = (Fabricante) q.getSingleResult();
		
		em.close();
		
		return f;
	}

	
	
	/**
	 * 
	 * @param idActual
	 * @return
	 */
	public Fabricante findAnterior (int idActual) {
		Fabricante f = null;
		
		EntityManager em = entityManagerFactory.createEntityManager();

		Query q = em.createNativeQuery("select * from tutorialjavacoches.fabricante where id < ? order by desc id limit 1", Fabricante.class);
		q.setParameter(1, idActual);

		f = (Fabricante) q.getSingleResult();
		
		em.close();
		
		return f;
	}

	/**
	 * 
	 * @param f
	 * @return
	 */
	public boolean guardar (Fabricante f) {
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
	 * @return
	 */
	public List<Fabricante> findAll () {
		EntityManager em = entityManagerFactory.createEntityManager();
		
		Query q = em.createNativeQuery("SELECT * FROM Fabricante;", Fabricante.class);
		
		List<Fabricante> listf = (List<Fabricante>) q.getResultList();
		
		em.close();
		
		return listf;
	}
	


	/**
	 * 
	 * @param id
	 * @return
	 */
	public void borrar(Fabricante f) {
		EntityManager em = entityManagerFactory.createEntityManager();
		em.getTransaction().begin();
		f = em.merge(f);
		em.remove(f);
		em.getTransaction().commit();
		em.close();
	}

	

	

}
