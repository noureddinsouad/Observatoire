package ma.observatoire.dao;



import org.springframework.data.jpa.repository.JpaRepository;

import ma.observatoire.entitie.Region;


public interface IRegionDao extends JpaRepository<Region, Double>{
	
}