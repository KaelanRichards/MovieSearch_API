package com.apicapstone.APICapstone.daorepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apicapstone.APICapstone.entity.FavoriteMovie;

public interface FavoriteMovieRepository extends JpaRepository<FavoriteMovie,Integer>{

}
