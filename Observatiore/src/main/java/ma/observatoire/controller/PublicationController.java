package ma.observatoire.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ma.observatoire.entitie.Publication;
import ma.observatoire.service.PublicationService;

@RestController
@RequestMapping("/publications")
public class PublicationController {
	private PublicationService publicationService;
	
	
	@Autowired
    public PublicationController(PublicationService publicationService) {
		this.publicationService = publicationService;
	}



	@RequestMapping(value="/{id}",method=RequestMethod.GET)
    public ResponseEntity<Resource> downloadFile(@PathVariable Integer id) {
        // Load file from database
         Publication dbFile = publicationService.getPublication(id);

        return ResponseEntity.ok()
                .contentType(MediaType.parseMediaType("application/pdf"))
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + dbFile.getName() +".pdf"+ "\"")
                .body(new ByteArrayResource(dbFile.getData()));
    }
	@RequestMapping(value="/",method=RequestMethod.GET)
	public List<Object[]> publicationList() {
		return publicationService.getPublicationsList();
	}
	

}
