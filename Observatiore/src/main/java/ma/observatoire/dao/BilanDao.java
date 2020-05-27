package ma.observatoire.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.observatoire.entitie.Bilan;

public interface BilanDao extends JpaRepository<Bilan, Integer> {

}
