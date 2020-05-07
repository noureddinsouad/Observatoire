package ma.observatiore.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Component;

import ma.observatiore.entity.Region;
@Component
public class RegionImplDao {
	@PersistenceContext(unitName = "observe")
	private static final EntityManagerFactory ENTITY_MANAGER_FACTORY = Persistence.createEntityManagerFactory("observe");

	
	public List<Region> listRegion() {
		// The EntityManager class allows operations such as create, read, update, delete
        EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
    	
    	// the lowercase c refers to the object
    	// :custID is a parameterized query thats value is set below
    	String strQuery = "SELECT c FROM Region c ";
    	
    	// Issue the query and get a matching Customer
    	TypedQuery<Region> tq = em.createQuery(strQuery, Region.class);
    	List<Region> custs =null;
    	try {
    		// Get matching customer object and output
    		custs = tq.getResultList();
    		return custs;
    	}
    	catch(NoResultException ex) {
    		ex.printStackTrace();
    		return custs;
    	}
    	finally {
    		em.close();
    	}
    }
	}

