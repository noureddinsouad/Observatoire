package ma.observatoire.service;

import java.util.List;

import ma.observatoire.entitie.Evenement;

public interface EvenementService {
	public Evenement getEvenment(Integer id);
	public List<Object[]> getEvenmentList();
}
