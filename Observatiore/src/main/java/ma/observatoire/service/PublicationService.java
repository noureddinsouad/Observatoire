package ma.observatoire.service;

import java.util.List;

import ma.observatoire.entitie.Publication;

public interface PublicationService {
	 public Publication getPublication(Integer id);
	 public List<Object[]> getPublicationsList();
}
