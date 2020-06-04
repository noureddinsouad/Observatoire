package ma.observatoire.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ma.observatoire.entitie.Evenement;
import ma.observatoire.service.EvenementService;

@RestController

@RequestMapping("/evenement")
public class EvenementController {
private EvenementService evenementService;

@Autowired
public EvenementController(EvenementService evenementService) {
	this.evenementService = evenementService;
}

@RequestMapping(value="/{id}",method=RequestMethod.GET)
 public Evenement getEvenement(@PathVariable Integer id) {
	return evenementService.getEvenment(id);
}
@RequestMapping(value="/",method=RequestMethod.GET)
public List<Object[]> getEvenements(){
	return evenementService.getEvenmentList();
}


}
