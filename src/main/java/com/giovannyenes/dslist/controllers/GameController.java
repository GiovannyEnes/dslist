package com.giovannyenes.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.giovannyenes.dslist.dto.GameDTO;
import com.giovannyenes.dslist.dto.GameMinDTO;
import com.giovannyenes.dslist.services.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameController {
	
	@Autowired
	private GameService gameService;
	
	
	@GetMapping
	public List<GameMinDTO> findAll() {
		
		List<GameMinDTO> result = gameService.findAll();
		return result;
		
	}
	
	@GetMapping(value ="/{id}")
	public GameDTO findByID(@PathVariable Long id){
		return gameService.findById(id);
		
	}
	

}
