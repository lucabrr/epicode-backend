package com.epicode.incendio.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/alert")
public class IncendioController {

	@PostMapping
	public ResponseEntity<String> sendAlert(@RequestParam int idSonda,
											@RequestParam int lat ,
											@RequestParam int lon,
											@RequestParam int smokeLevel){
		try {
			System.out.println("allarme incendio " +"sonda:"+idSonda +" lat:"+ lat+ " lon:"+lon + " intensita fumo:" + smokeLevel);
			return new ResponseEntity<String>("allarme inviato", HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.BAD_REQUEST);
		}
		
		
	}
}
