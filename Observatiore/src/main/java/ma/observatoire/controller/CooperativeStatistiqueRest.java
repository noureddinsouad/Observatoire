package ma.observatoire.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ma.observatoire.entitie.Cooperative;
import ma.observatoire.service.CooperativeService;

@RestController
@RequestMapping("/statistiques")
public class CooperativeStatistiqueRest {
	private CooperativeService cooperativeService;
	@Autowired
	public CooperativeStatistiqueRest(CooperativeService cooperativeService) {
		this.cooperativeService = cooperativeService;
	}

	@RequestMapping(value="/",method=RequestMethod.GET)
	public  List<Object[]> listCooperatives() {
		System.out.println(cooperativeService==null);
		return (List<Object[]>) cooperativeService.tets();
	}
	@RequestMapping(value="/copperatives/secteur",method=RequestMethod.GET)
	public  ArrayList<Object[]> parSecteur() {
		System.out.println(cooperativeService==null);
		return (ArrayList<Object[]>) cooperativeService.CooperativeParSecteur();
	}
	@RequestMapping(value="/copperatives/region",method=RequestMethod.GET)
	public  ArrayList<Object[]> parRegion() {
		System.out.println(cooperativeService==null);
		return (ArrayList<Object[]>) cooperativeService.CooperativeParRegion();
	}
	@RequestMapping(value="/copperatives/branche",method=RequestMethod.GET)
	public  ArrayList<Object[]> parBrancehe() {
		System.out.println(cooperativeService==null);
		return (ArrayList<Object[]>) cooperativeService.CooperativeParBranche();
	}
	@RequestMapping(value="/adherents/secteur",method=RequestMethod.GET)
	public  ArrayList<Object[]> adherentSecteur() {
		System.out.println(cooperativeService==null);
		return (ArrayList<Object[]>) cooperativeService.NombreAdherentsParSecteur();
	}
}
