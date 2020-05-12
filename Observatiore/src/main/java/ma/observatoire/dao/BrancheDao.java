package ma.observatoire.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.observatoire.entitie.Branche;

public interface BrancheDao extends JpaRepository<Branche, Integer> {
	Branche findByBranche(String branche);
}
