package ma.observatoire.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import ma.observatoire.config.JwtRequestFilter;
import ma.observatoire.dao.UserDao;
import ma.observatoire.entitie.Prsident;
import ma.observatoire.model.UserDTO;

@Service
public class JwtUserDetailsService implements UserDetailsService {
	
	@Autowired
	private UserDao userDao;

	@Autowired
	private JwtRequestFilter jwtRequestFilter;
	
	@Autowired
	private PasswordEncoder bcryptEncoder;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Prsident user = userDao.findByuserName(username);
		if (user == null) {
			throw new UsernameNotFoundException("User not found with username: " + username);
		}
		return new org.springframework.security.core.userdetails.User(user.getUserName(), user.getPassword(),
				new ArrayList<>());
	}
	
	public Prsident save(UserDTO user) {
		Prsident newUser = new Prsident();
		newUser.setUserName(user.getUserName());
		newUser.setNomPresident(user.getNomPresident());
		newUser.setTelephonePresident(user.getTelephonePresident());
		//newUser.setIdUser(new Double(777));
		newUser.setPassword(bcryptEncoder.encode(user.getPassword()));
		return userDao.save(newUser);
	}
	public Prsident show() {
		
		Prsident User= userDao.findByuserName(jwtRequestFilter.getUsername());
		User.setPassword(null);
	    User.setIdUser(null);
		return User;
	}
	
	public Prsident modifierCompte(UserDTO user) {
		Prsident newUser =  userDao.findByuserName(jwtRequestFilter.getUsername());
		newUser.setUserName(user.getUserName());
		newUser.setNomPresident(user.getNomPresident());
		newUser.setTelephonePresident(user.getTelephonePresident());
		//newUser.setIdUser(new Double(777));
		newUser.setPassword(bcryptEncoder.encode(user.getPassword()));
		userDao.save(newUser);
		newUser.setPassword(null);
		newUser.setIdUser(null);
		return newUser;
	}
}