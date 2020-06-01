package ma.observatoire.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.observatoire.dao.PublicationDao;
import ma.observatoire.entitie.Publication;
@Service
public class PublicationServiceImpl implements PublicationService {
	@PersistenceContext
	private EntityManager em;
   @Autowired
   private PublicationDao  publicationDao;
   public Publication getPublication(Integer id) {
	   return publicationDao.findById(id)
			   .orElseThrow();
   }
	public List<Object[]> getPublicationsList() {
		TypedQuery<Object[]> query = em.createQuery(
				"select p.id ,p.name,p.date from Publication p ", Object[].class);
		List<Object[]> results = query.getResultList();
		return results;
	}
   
}
