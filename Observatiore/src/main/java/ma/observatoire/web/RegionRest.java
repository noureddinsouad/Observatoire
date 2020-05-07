package ma.observatoire.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ma.observatiore.dao.IRegionDao;
import ma.observatiore.dao.RegionImplDao;
import ma.observatiore.entity.Region;

@RestController

public class RegionRest {
	
	@Autowired(required=false)
	public RegionImplDao region;
	
	@RequestMapping(value="/regions",method=RequestMethod.GET)
	public List<Region> listRegions()
	{System.out.println(region==null);
		return region.listRegion();
	}

}
