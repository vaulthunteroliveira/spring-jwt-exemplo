package com.example.auth.resource;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/teste")
public class TesteResource {
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<String>> findAll() {
		List<String> list = Arrays.asList("Laranja", "Maçã", "Pêra");
		return ResponseEntity.ok().body(list);
	}

}
