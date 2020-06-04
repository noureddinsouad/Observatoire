package ma.observatoire.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TemporalType;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ma.observatoire.config.JwtRequestFilter;
import ma.observatoire.dao.BrancheDao;
import ma.observatoire.dao.ICooperativeDao;
import ma.observatoire.dao.ProvinceDao;
import ma.observatoire.dao.RegionDao;
import ma.observatoire.dao.SecteurDao;
import ma.observatoire.dao.UserDao;
import ma.observatoire.entitie.Cooperative;
import ma.observatoire.entitie.Region;
import ma.observatoire.model.CooperativeDTO;

@Repository
public class CooperativeServiceImpl implements CooperativeService {
	@PersistenceContext
	private EntityManager em;
	private ICooperativeDao cooperativeDao;
	private RegionDao regionDao;
	private ProvinceDao provinceDao;
	private BrancheDao brancheDao;
	private SecteurDao secteurDao;
	private UserDao userDao;
	private JwtRequestFilter jwtRequestFilter;

	@Autowired
	public CooperativeServiceImpl(ICooperativeDao cooperativeDao, RegionDao regionDao, ProvinceDao provinceDao,
			BrancheDao brancheDao, SecteurDao secteurDao, UserDao userDao,JwtRequestFilter jwtRequestFilter) {
		this.cooperativeDao = cooperativeDao;
		this.regionDao = regionDao;
		this.provinceDao = provinceDao;
		this.brancheDao = brancheDao;
		this.secteurDao = secteurDao;
		this.userDao = userDao;
		this.jwtRequestFilter=jwtRequestFilter;
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
	public Cooperative create(CooperativeDTO cooperative) {
        Cooperative newCooperative=new Cooperative();
        newCooperative.setAdresseActuelle(cooperative.getAdresseActuelle());
        newCooperative.setIdSecteur(secteurDao.findBySecteur(cooperative.getSecteur()));
        newCooperative.setBranche(brancheDao.findByBranche(cooperative.getBranche()));
        java.util.Date date =new java.util.Date();
        newCooperative.setDateCreation(cooperative.getDateCreation());
        newCooperative.setDatedeclaration(date);
        newCooperative.setFax(cooperative.getFax());
        newCooperative.setIdPresident(userDao.findByuserName(jwtRequestFilter.getUsername()));
        newCooperative.setTelephone(cooperative.getTelephone());
        newCooperative.setNom(cooperative.getNom());
        newCooperative.setNombreAdherents(cooperative.getNombreAdherents());
        newCooperative.setProvince(provinceDao.findByProvince(cooperative.getProvince()));
        newCooperative.setRegion(regionDao.findByRegion(cooperative.getRegion()));
        newCooperative.setNumerotpi(cooperative.getNumerotpi());
       //newCooperative.setIdCooperative(56555);
        
		return cooperativeDao.save(newCooperative);
	}

	public CooperativeDTO read() {
		Cooperative cooperative=cooperativeDao.findByidPresident(userDao.findByuserName(jwtRequestFilter.getUsername()));
		cooperative.setIdCooperative(null);
		CooperativeDTO newCooperative=new CooperativeDTO();
		newCooperative.setAdresseActuelle(cooperative.getAdresseActuelle());
        newCooperative.setSecteur(cooperative.getIdSecteur().getSecteur());
        newCooperative.setBranche(cooperative.getBranche().getBranche());
        java.util.Date date =new java.util.Date();
        newCooperative.setDateCreation(cooperative.getDateCreation());
        newCooperative.setDatedeclaration(date);
        newCooperative.setFax(cooperative.getFax());
        //newCooperative.setIdPresident(userDao.findByuserName(jwtRequestFilter.getUsername()));
        newCooperative.setTelephone(cooperative.getTelephone());
        newCooperative.setNom(cooperative.getNom());
        newCooperative.setNombreAdherents(cooperative.getNombreAdherents());
        newCooperative.setProvince(cooperative.getProvince().getProvince());
        newCooperative.setRegion(cooperative.getRegion().getRegion());
        newCooperative.setNumerotpi(cooperative.getNumerotpi());
		return newCooperative;
	}

	public void delete(long id) {
		// TODO Auto-generated method stub

	}

	@Override


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
				"select count(c), c.region.region from Cooperative c WHERE YEAR(c.dateCreation)<= ?1 GROUP BY c.region",
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
		TypedQuery<Object[]> query = em.createQuery(
				"select count(c), c.region.region from Cooperative c WHERE c.dateCreation<= ?1 GROUP BY c.region",
				Object[].class);
		Date d=null;
		try {
			d=new SimpleDateFormat("yyyy-MM-dd").parse(year+"-"+month+"-05");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		query.setParameter(1,d, TemporalType.DATE);
		List<Object[]> results = query.getResultList();
		return results;
	}

	public List<Object[]> NombreCooperativesParSecteur(int year, int month) {
		TypedQuery<Object[]> query = em.createQuery(
				"select count(c), c.idSecteur.secteur from Cooperative c WHERE c.dateCreation<= ?1 GROUP BY c.idSecteur",
				Object[].class);
		Date d=null;
		try {
			d=new SimpleDateFormat("yyyy-MM-dd").parse(year+"-"+month+"-05");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		query.setParameter(1,d, TemporalType.DATE);
		List<Object[]> results = query.getResultList();
		return results;
	}

}
