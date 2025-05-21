package com.giovannyenes.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.giovannyenes.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{
	
	

}
