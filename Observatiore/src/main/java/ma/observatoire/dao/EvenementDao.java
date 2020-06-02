package ma.observatoire.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.observatoire.entitie.Evenement;

public interface EvenementDao extends JpaRepository<Evenement, Integer> {

}
