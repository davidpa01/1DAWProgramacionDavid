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

import capitulo07AccesoDatos.jpa.entities.Coche;
import capitulo07AccesoDatos.jpa.entities.Fabricante;




public class ControladorCoche {

	private static ControladorCoche instance = null;

	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("1DAWProgramacion"); 

	/**
	 * 
	 * @return
	 */
	public static ControladorCoche getInstance () {
		if (instance == null) {
			instance = new ControladorCoche();
		}
		return instance;
	}
	
	
	/**
	 * 
	 */
	public ControladorCoche() {
	}
	
	
	
	/**
	 * 
	 * @return
	 */
	public Coche findPrimero () {
Coche c = null;
		
		EntityManager em = factory.createEntityManager();
		Query q = em.createNativeQuery("select * from tutorialjavacoches.coche order by id limit 1", Coche.class);
		c = (Coche) q.getSingleResult();
		em.close();
		
		return c;
	}
	
	/**
	 * 
	 * @return
	 */
	public Coche findUltimo () {
		Coche c = null;
		
		EntityManager em = factory.createEntityManager();
		Query q = em.createNativeQuery("select * from tutorialjavacoches.coche order by id desc limit 1", Coche.class);
		c = (Coche) q.getSingleResult();
		em.close();
		
		return c;
	}
	
	
	public Coche findSiguiente (int idActual) {
		Coche c = null;
		
		EntityManager em = factory.createEntityManager();
		Query q = em.createNativeQuery("select * from tutorialjavacoches.coche where id > ? order by id limit 1", Coche.class);
		q.setParameter(1, idActual);
		c = (Coche) q.getSingleResult();
		em.close();
		
		return c;
	}
	
	
	public Coche findAnterior (int idActual) {
		Coche c = null;
		
		EntityManager em = factory.createEntityManager();
		Query q = em.createNativeQuery("select * from tutorialjavacoches.coche where id < ? order by id desc limit 1", Coche.class);
		q.setParameter(1, idActual);
		c = (Coche) q.getSingleResult();
		em.close();
		
		return c;		
	}
	

	/**
	 * 
	 * @param f
	 * @return
	 */
	public boolean guardar (Coche c) {
		try {
			EntityManager em = factory.createEntityManager();
			em.getTransaction().begin();
			if (c.getId() == 0) {
				em.persist(c);
			}
			else {
				em.merge(c);
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
	public void eliminar(Coche c) {
		EntityManager em = factory.createEntityManager();
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
	public List<Coche> findAll () {
		EntityManager em = factory.createEntityManager();
		
		Query q = em.createNativeQuery("SELECT * FROM Coche;", Coche.class);
		
		List<Coche> listc = (List<Coche>) q.getResultList();
		
		em.close();
		
		return listc;
	}

	

}
