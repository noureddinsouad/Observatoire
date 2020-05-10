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
		TypedQuery<Object[]> query = em.createQuery(
				"select COUNT(c) ,c.idSecteur.secteur from Cooperative c group by c.idSecteur", Object[].class);

		return (ArrayList<Object[]>) query.getResultList();
	}

	public List<Object[]> CooperativeParRegion() {
		TypedQuery<Object[]> query = em
				.createQuery("select count(c), c.region.region from Cooperative c GROUP BY c.region", Object[].class);
		List<Object[]> results = query.getResultList();
		return results;
	}

	public List<Object[]> CooperativeParBranche() {
		TypedQuery<Object[]> query = em.createQuery(
				"select count(c), c.branche.branche from Cooperative c GROUP BY c.branche", Object[].class);
		List<Object[]> results = query.getResultList();
		return results;
	}

	public List<Object[]> NombreAdherentsParSecteur() {
		TypedQuery<Object[]> query = em.createQuery(
				"select SUM(c.nombreAdherents), c.idSecteur.secteur from Cooperative c GROUP BY c.idSecteur",
				Object[].class);
		List<Object[]> results = query.getResultList();
		return results;
	}

	public List<Object[]> NombreAdherentsParRegion() {
		TypedQuery<Object[]> query = em.createQuery(
				"select SUM(c.nombreAdherents), c.region.region from Cooperative c GROUP BY c.region", Object[].class);
		List<Object[]> results = query.getResultList();
		return results;
	}

	public List<Object[]> NombreAdherentsParBranche() {
		TypedQuery<Object[]> query = em.createQuery(
				"select SUM(c.nombreAdherents), c.branche.branche from Cooperative c GROUP BY c.branche",
				Object[].class);
		List<Object[]> results = query.getResultList();
		return results;
	}

	public List<Object[]> CapitalParSecteur() {
		TypedQuery<Object[]> query = em.createQuery(
				"select SUM(b.capitalActuel), b.idCooperative.idSecteur.secteur from Bilan b GROUP BY b.idCooperative.idSecteur",
				Object[].class);
		List<Object[]> results = query.getResultList();
		return results;
	}

	public List<Object[]> CapitalParRegion() {
		TypedQuery<Object[]> query = em.createQuery(
				"select SUM(b.capitalActuel), b.idCooperative.region.region from  Bilan b GROUP BY b.idCooperative.region",
				Object[].class);
		List<Object[]> results = query.getResultList();
		return results;
	}

	public List<Object[]> EvolutionCreationParRegion(int year) {
		TypedQuery<Object[]> query = em.createQuery(
				"select count(c), c.region.region from Cooperative c WHERE YEAR(c.dateCreation) = ?1 GROUP BY c.region",
				Object[].class);
		query.setParameter(1, year);
		List<Object[]> results = query.getResultList();
		return results;
	}

	public List<Object[]> EvolutionCreationParSecteur(int year) {
		TypedQuery<Object[]> query = em.createQuery(
				"select count(c), c.idSecteur.secteur from Cooperative c WHERE YEAR(c.dateCreation) = ?1 GROUP BY c.idSecteur",
				Object[].class);
		query.setParameter(1, year);
		List<Object[]> results = query.getResultList();
		return results;
	}

	public List<Object[]> EvolutionCreationParRegion(int year, int month) {
		TypedQuery<Object[]> query = em.createQuery(
				"select count(c), c.region.region from Cooperative c WHERE YEAR(c.dateCreation) = ?1 AND MONTH(c.dateCreation)= ?2 GROUP BY c.region",
				Object[].class);
		query.setParameter(1, year);
		query.setParameter(2,month);
		List<Object[]> results = query.getResultList();
		return results;
	}

	public List<Object[]> EvolutionCreationParSecteur(int year, int month) {
		TypedQuery<Object[]> query = em.createQuery(
				"select count(c), c.idSecteur.secteur from Cooperative c WHERE YEAR(c.dateCreation) = ?1 AND MONTH(c.dateCreation)= ?2 GROUP BY c.idSecteur",
				Object[].class);
		query.setParameter(1, year);
		query.setParameter(2,month);
		List<Object[]> results = query.getResultList();
		return results;
	}

	public List<Object[]> NombreCooperativesParRegion(int year) {
		TypedQuery<Object[]> query = em.createQuery(
				"select count(c), c.region.region from Cooperative c WHERE YEAR(c.dateCreation)<= ?1 GROUP BY c.Region",
				Object[].class);
		query.setParameter(1, year);
		List<Object[]> results = query.getResultList();
		return results;
	}

	public List<Object[]> NombreCooperativesParSecteur(int year) {
		TypedQuery<Object[]> query = em.createQuery(
				"select count(c), c.idSecteur.secteur from Cooperative c WHERE YEAR(c.dateCreation)<= ?1 GROUP BY c.idSecteur",
				Object[].class);
		query.setParameter(1, year);
		List<Object[]> results = query.getResultList();
		return results;
	}

	public List<Object[]> NombreCooperativesParRegion(int year, int month) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Object[]> NombreCooperativesParSecteur(int year, int month) {
		// TODO Auto-generated method stub
		return null;
	}

}
