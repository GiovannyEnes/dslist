package com.giovannyenes.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.giovannyenes.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{
	
	

}
