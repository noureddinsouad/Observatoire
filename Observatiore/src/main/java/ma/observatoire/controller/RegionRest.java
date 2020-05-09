package ma.observatoire.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import ma.observatoire.dao.IRegionDao;
import ma.observatoire.entitie.Region;

@RestController
@RequestMapping("/regions")
public class RegionRest {
	
	@Autowired(required=false)
	private IRegionDao region;
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public List<Region> listRegions()
	{System.out.println(region==null);
		return region.findAll();
	}
	

}
