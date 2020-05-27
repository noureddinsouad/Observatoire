package ma.observatoire.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.observatoire.config.JwtRequestFilter;
import ma.observatoire.dao.BilanDao;
import ma.observatoire.dao.ICooperativeDao;
import ma.observatoire.dao.UserDao;
import ma.observatoire.entitie.Bilan;
@Service
public class BilanServiceImpl implements BilanService {
private BilanDao bilanDao;
private ICooperativeDao cooperativeDao;
private JwtRequestFilter jwtRequestFilter;
private UserDao userDao;
 @Autowired
 public BilanServiceImpl(BilanDao bilanDao, ICooperativeDao cooperativeDao, JwtRequestFilter jwtRequestFilter,
		UserDao userDao) {
	this.bilanDao = bilanDao;
	this.cooperativeDao = cooperativeDao;
	this.jwtRequestFilter = jwtRequestFilter;
	this.userDao = userDao;
}



	public Bilan addBilan(Bilan bilan) {
		bilan.setIdCooperative(cooperativeDao.findByidPresident(userDao.findByuserName(jwtRequestFilter.getUsername()))); 
		return bilanDao.save(bilan);
	}
	


}
