package ma.observatoire.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ma.observatoire.entitie.Prsident;

@Repository
public interface UserDao extends CrudRepository<Prsident, Integer> {
	Prsident findByuserName(String userName);
}