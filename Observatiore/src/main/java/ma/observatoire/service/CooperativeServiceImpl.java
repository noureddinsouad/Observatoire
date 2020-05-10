package ma.observatoire.service;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TemporalType;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ma.observatoire.dao.ICooperativeDao;
import ma.observatoire.entitie.Cooperative;
import ma.observatoire.entitie.Region;

@Repository
public class CooperativeServiceImpl implements CooperativeService {
	@PersistenceContext
	private EntityManager em;
	private ICooperativeDao cooperativeDao;

	@Autowired
	public CooperativeServiceImpl(ICooperativeDao cooperativeDao) {
		this.cooperativeDao = cooperativeDao;
	}

	public ArrayList<Object[]> tets() {
		TypedQuery<Object[]> query = em.createQuery("select c.region, c.idRegion from Region c", Object[].class);

	
		return (ArrayList<Object[]>) query.getResultList();
	}

	public List<Cooperative> list() {
		// TODO Auto-generated method stub
		return cooperativeDao.findAll();
	}

	@Transactional
	public Cooperative create(Cooperative cooperative) {

		return cooperativeDao.save(cooperative);
	}

	public Cooperative read(Double id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void delete(long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public Cooperative read(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Cooperative update(long id, Cooperative cooperative) {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<Object[]> CooperativeParSecteur() {
		TypedQuery<Object[]> query = em.createQuery("select COUNT(c) ,c.idSecteur.secteur from Cooperative c group by c.idSecteur", Object[].class);
		
		return (ArrayList<Object[]>) query.getResultList();
	}


	

	@Override
	public List<Object[]> NombreAdherentsParRegion() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Object[]> NombreAdherentsParBranche() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Object[]> CapitalParSecteur() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Object[]> CapitalParRegion() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Object[]> EvolutionCreationParRegion(Date date, Date date2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Object[]> EvolutionCreationParSecteur(Date date, Date date2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Object[]> NombreCooperativesParRegion(Date date) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Object[]> NombreCooperativesParSecteur(Date date) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public List<Object[]> CooperativeParRegion() {
		TypedQuery<Object[]> query = em.createQuery("select count(c), c.region.region from Cooperative c GROUP BY c.region",
				Object[].class);
		List<Object[]> results = query.getResultList();
		return results;
	}

	public List<Object[]> CooperativeParBranche() {
		TypedQuery<Object[]> query = em.createQuery("select count(c), c.branche.branche from Cooperative c GROUP BY c.branche",
				Object[].class);
		List<Object[]> results = query.getResultList();
		return results;
	}

	public List<Object[]> NombreAdherentsParSecteur() {
		TypedQuery<Object[]> query = em.createQuery(
				"select SUM(c.nombreAdherents), c.idSecteur.secteur from Cooperative c GROUP BY c.idSecteur", Object[].class);
		List<Object[]> results = query.getResultList();
		return results;
	}
/*
	public List<Object[]> NombreAdherentsParRegion() {
		TypedQuery<Object[]> query = em.createQuery(
				"select SUM(c.nombreAdherents), c.region from Cooperative c GROUP BY c.region", Object[].class);
		List<Object[]> results = query.getResultList();
		return results;
	}

	public List<Object[]> NombreAdherentsParBranche() {
		TypedQuery<Object[]> query = em.createQuery(
				"select SUM(c.nombreAdherents), c.branche from Cooperative c GROUP BY c.branche", Object[].class);
		List<Object[]> results = query.getResultList();
		return results;
	}

	@Override
	public List<Object[]> CapitalParSecteur() {
		TypedQuery<Object[]> query = em.createQuery(
				"select SUM(b.capitalActuel), c.Secteur from Cooperative c,Bilan b WHERE b.Cooperative.idCooperative=c.idCooperative  GROUP BY c.Secteur",
				Object[].class);
		List<Object[]> results = query.getResultList();
		return results;
	}

	@Override
	public List<Object[]> CapitalParRegion() {
		TypedQuery<Object[]> query = em.createQuery(
				"select SUM(b.capitalActuel), c.Region from Cooperative c,Bilan b WHERE b.Cooperative.idCooperative=c.idCooperative  GROUP BY c.Region",
				Object[].class);
		List<Object[]> results = query.getResultList();
		return results;
	}

	@Override
	public List<Object[]> EvolutionCreationParRegion(Date date, Date date2) {
		TypedQuery<Object[]> query = em.createQuery(
				"select count(c), c.Region from Cooperative c WHERE c.dateCreation between ?1 and ?2 GROUP BY c.Region",
				Object[].class);
		query.setParameter(1, date, TemporalType.DATE);
		query.setParameter(2, date2, TemporalType.DATE);
		List<Object[]> results = query.getResultList();
		return results;
	}

	@Override
	public List<Object[]> EvolutionCreationParSecteur(Date date, Date date2) {
		TypedQuery<Object[]> query = em.createQuery(
				"select count(c), c.Secteur from Cooperative c WHERE c.dateCreation between ?1 and ?2 GROUP BY c.Secteur",
				Object[].class);
		query.setParameter(1, date, TemporalType.DATE);
		query.setParameter(2, date2, TemporalType.DATE);
		List<Object[]> results = query.getResultList();
		return results;
	}

	@Override
	public List<Object[]> NombreCooperativesParRegion(Date date) {
		TypedQuery<Object[]> query = em.createQuery(
				"select count(c), c.Region from Cooperative c WHERE c.dateCreation> ?1 GROUP BY c.Region",
				Object[].class);
		query.setParameter(1, date, TemporalType.DATE);
		List<Object[]> results = query.getResultList();
		return results;
	}

	@Override
	public List<Object[]> NombreCooperativesParSecteur(Date date) {
		TypedQuery<Object[]> query = em.createQuery(
				"select count(c), c.Secteur from Cooperative c WHERE c.dateCreation> ?1 GROUP BY c.Secteur",
				Object[].class);
		query.setParameter(1, date, TemporalType.DATE);
		List<Object[]> results = query.getResultList();
		return results;
	}*/

}
