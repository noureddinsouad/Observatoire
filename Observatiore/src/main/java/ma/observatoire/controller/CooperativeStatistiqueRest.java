package ma.observatoire.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ma.observatoire.entitie.Cooperative;
import ma.observatoire.model.NombreParSectuer;
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
	public ArrayList<Object[]> parSecteur() {
		System.out.println(cooperativeService==null);
		return cooperativeService.CooperativeParSecteur();
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
	@RequestMapping(value="/adherents/region",method=RequestMethod.GET)
	public  ArrayList<Object[]> adherentRegion() {
		System.out.println(cooperativeService==null);
		return (ArrayList<Object[]>) cooperativeService.NombreAdherentsParRegion();
	}
	@RequestMapping(value="/adherents/branche",method=RequestMethod.GET)
	public  ArrayList<Object[]> adherentBranche() {
		System.out.println(cooperativeService==null);
		return (ArrayList<Object[]>) cooperativeService.NombreAdherentsParBranche();
	}
	@RequestMapping(value="/capitalParSecteur",method=RequestMethod.GET)
	public  ArrayList<Object[]> capitalParSecteur() {
		System.out.println(cooperativeService==null);
		return (ArrayList<Object[]>) cooperativeService.CapitalParSecteur();
	}
	@RequestMapping(value="/CapitalParRegion",method=RequestMethod.GET)
	public  ArrayList<Object[]> CapitalParRegion() {
		System.out.println(cooperativeService==null);
		return (ArrayList<Object[]>) cooperativeService.CapitalParRegion();
	}
	@RequestMapping(value="/evolutionCreationParRegion",method=RequestMethod.GET)
	public  ArrayList<Object[]> evolutionCreationParRegion(@RequestParam(name="year",defaultValue="2020") int year) {
		System.out.println(cooperativeService==null);
		return (ArrayList<Object[]>) cooperativeService.EvolutionCreationParRegion(year);
	}
	@RequestMapping(value="/evolutionCreationParSecteur",method=RequestMethod.GET)
	public  ArrayList<Object[]> evolutionCreationParSecteur(@RequestParam(name="year",defaultValue="2020") int year) {
		System.out.println(cooperativeService==null);
		return (ArrayList<Object[]>) cooperativeService.EvolutionCreationParSecteur(year);
	}
	@RequestMapping(value="/evolutionCreationParRegionParmois",method=RequestMethod.GET)
	public  ArrayList<Object[]> evolutionCreationParRegion(@RequestParam(name="year",defaultValue="2020") int year,@RequestParam(name="month",defaultValue="2") int month) {
		System.out.println(cooperativeService==null);
		return (ArrayList<Object[]>) cooperativeService.EvolutionCreationParRegion(year,month);
	}
	@RequestMapping(value="/evolutionCreationParSecteurParmois",method=RequestMethod.GET)
	public  ArrayList<Object[]> evolutionCreationParSecteur(@RequestParam(name="year",defaultValue="2020") int year,@RequestParam(name="month",defaultValue="2") int month) {
		System.out.println(cooperativeService==null);
		return (ArrayList<Object[]>) cooperativeService.EvolutionCreationParSecteur(year,month);
	}
	
	
}
