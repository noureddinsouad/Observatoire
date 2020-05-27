package ma.observatoire.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.observatoire.config.JwtRequestFilter;
import ma.observatoire.dao.DonneesGeneralesDao;
import ma.observatoire.dao.ICooperativeDao;
import ma.observatoire.dao.UserDao;
import ma.observatoire.entitie.Donneesgenerales;
@Service
public class DonneeesGeneralesImpl implements DonneesGeneral{
	private DonneesGeneralesDao donneesDao;
	private ICooperativeDao cooperativeDao;
	private JwtRequestFilter jwtRequestFilter;
	private UserDao userDao;
	@Autowired
	public DonneeesGeneralesImpl(DonneesGeneralesDao donneesDao, ICooperativeDao cooperativeDao,
			JwtRequestFilter jwtRequestFilter, UserDao userDao) {
		this.donneesDao = donneesDao;
		this.cooperativeDao = cooperativeDao;
		this.jwtRequestFilter = jwtRequestFilter;
		this.userDao = userDao;
	}
	@Override
	public Donneesgenerales addDonnees(Donneesgenerales donnees) {
		donnees.setIdCooperative(cooperativeDao.findByidPresident(userDao.findByuserName(jwtRequestFilter.getUsername())));
		return donneesDao.save(donnees);
	}



}
