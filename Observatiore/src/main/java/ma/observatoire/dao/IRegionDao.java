package ma.observatoire.dao;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.observatoire.entitie.Region;


public interface IRegionDao extends JpaRepository<Region, Double>{
	public List<Region> findByRegion(String region);
}
