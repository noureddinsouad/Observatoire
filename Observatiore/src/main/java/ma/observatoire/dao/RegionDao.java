package ma.observatoire.dao;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.observatoire.entitie.Region;


public interface RegionDao extends JpaRepository<Region, Double>{
	Region findByRegion(String region);
}
