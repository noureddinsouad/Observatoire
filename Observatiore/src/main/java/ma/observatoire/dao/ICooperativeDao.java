package ma.observatoire.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import ma.observatoire.entitie.Branche;
import ma.observatoire.entitie.Cooperative;
import ma.observatoire.entitie.Province;
import ma.observatoire.entitie.Region;
import ma.observatoire.entitie.Secteur;
public interface ICooperativeDao extends JpaRepository<Cooperative, Double> {
	/* List<Cooperative> findByRegion(Region region); 
	 List<Cooperative> findByProvince(Province province);
	 List<Cooperative> findBySecteur(Secteur secteur);
	 List<Cooperative> findByBranche(Branche branche);
	 List*/
}
