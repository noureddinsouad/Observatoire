package ma.observatoire.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.observatoire.dao.EvenementDao;
import ma.observatoire.entitie.Evenement;
@Service
public class EvenementServiceImpl implements EvenementService {
	@PersistenceContext
	private EntityManager em;
   @Autowired
   private EvenementDao dao;
   public Evenement getEvenment(Integer id) {
	    return dao.findById(id)
	   .orElse(null);
   }
   public List<Object[]> getEvenmentList() {
		TypedQuery<Object[]> query = em.createQuery(
				"select p.id ,p.name,p.date,p.description from Evenement p ", Object[].class);
		List<Object[]> results = query.getResultList();
		return results;
	}
   
   
}
