package ma.observatoire.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ma.observatoire.config.JwtRequestFilter;
import ma.observatoire.entitie.Bilan;
import ma.observatoire.entitie.Cooperative;
import ma.observatoire.entitie.Donneesgenerales;
import ma.observatoire.model.CooperativeDTO;
import ma.observatoire.service.BilanService;
import ma.observatoire.service.CooperativeService;
import ma.observatoire.service.DonneesGeneral;

@RestController
@RequestMapping("/Cooperatives")
public class CooperativeController {
	
	private CooperativeService cooperativeService;
	private BilanService bilanService;
	private DonneesGeneral donneesGeneral;
	@Autowired
	public CooperativeController(CooperativeService cooperativeService, BilanService bilanService,
			DonneesGeneral donneesGeneral) {
		this.cooperativeService = cooperativeService;
		this.bilanService = bilanService;
		this.donneesGeneral = donneesGeneral;
	}
	
	//private String username=jwtRequestFilter.getUsername();
	@RequestMapping( value = "/", method = RequestMethod.POST )
	public Cooperative create(@RequestBody CooperativeDTO cooperative){
		//System.out.println(username);
		return cooperativeService.create(cooperative);
	}
	
	
	






	@RequestMapping( value = "/bilan", method = RequestMethod.POST )
	public Bilan addBilan(@RequestBody Bilan bilan) {
		
		
		return bilanService.addBilan(bilan);
	}
	
	@RequestMapping( value = "/Donnees", method = RequestMethod.POST )
	public Donneesgenerales addDonnees(@RequestBody Donneesgenerales donnees) {
		return donneesGeneral.addDonnees(donnees);
	}
	
	
	
	
	@RequestMapping( value = "/afficher", method = RequestMethod.GET )
	
	public CooperativeDTO Afficher() {
		return cooperativeService.read();
	}
	
	
	
	
	
	/*@RequestMapping( value = "/{id}", method = RequestMethod.PUT )
	public Post update(@PathVariable(value="id") long id, @RequestBody Post post){
		return postService.update(id,post);	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public ResponseEntity<?> saveUser(@RequestBody UserDTO user) throws Exception {
		return ResponseEntity.ok(userDetailsService.save(user));
	}
	}*/
	
	
	
	
	
	
}
