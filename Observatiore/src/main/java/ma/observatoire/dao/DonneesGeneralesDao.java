package ma.observatoire.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.observatoire.entitie.Donneesgenerales;

public interface DonneesGeneralesDao extends JpaRepository<Donneesgenerales, Integer> {
  
}
