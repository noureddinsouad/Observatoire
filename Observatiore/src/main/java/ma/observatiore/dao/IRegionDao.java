package ma.observatiore.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.observatiore.entity.Region;

public interface IRegionDao extends JpaRepository<Region, Double>{
	
}