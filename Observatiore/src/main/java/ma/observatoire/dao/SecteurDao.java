package ma.observatoire.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.observatoire.entitie.Secteur;

public interface SecteurDao extends JpaRepository<Secteur, Integer>{
	Secteur  findBySecteur(String secteur);

}
