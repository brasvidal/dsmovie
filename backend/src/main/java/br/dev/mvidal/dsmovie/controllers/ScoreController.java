package br.dev.mvidal.dsmovie.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.dev.mvidal.dsmovie.dto.MovieDTO;
import br.dev.mvidal.dsmovie.dto.ScoreDTO;
import br.dev.mvidal.dsmovie.services.ScoreService;

@RestController
@RequestMapping(value="/scores")
public class ScoreController {

	@Autowired
	private ScoreService service;
	
	
	@PutMapping
	public MovieDTO saveScore(@RequestBody ScoreDTO dto){

		MovieDTO movieDTO = service.saveScore(dto);
	return movieDTO;
	}
}
