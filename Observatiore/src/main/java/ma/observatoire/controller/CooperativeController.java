package ma.observatoire.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ma.observatoire.entitie.Cooperative;
import ma.observatoire.service.CooperativeService;

@RestController
@RequestMapping("/Cooperatives")
public class CooperativeController {
	private CooperativeService cooperativeService;
	@Autowired
	public CooperativeController(CooperativeService cooperativeService) {
		this.cooperativeService = cooperativeService;
	}
	@RequestMapping( value = "/", method = RequestMethod.POST )
	public Cooperative create(@RequestBody Cooperative cooperative){
		return cooperativeService.create(cooperative);
	}
	/*@RequestMapping( value = "/{id}", method = RequestMethod.PUT )
	public Post update(@PathVariable(value="id") long id, @RequestBody Post post){
		return postService.update(id,post);
	}*/
	
	
	
	
	
	
}
