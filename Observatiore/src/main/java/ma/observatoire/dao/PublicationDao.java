package ma.observatoire.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ma.observatoire.entitie.Publication;
@Repository
public interface PublicationDao extends CrudRepository<Publication, Integer> {
	
}
