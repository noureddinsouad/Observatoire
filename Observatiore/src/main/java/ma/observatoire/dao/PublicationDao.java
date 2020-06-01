package ma.observatoire.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.observatoire.entitie.Publication;
@Repository
public interface PublicationDao extends JpaRepository<Publication, Integer> {
	
}
