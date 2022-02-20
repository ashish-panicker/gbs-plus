package com.gbs.plus.movieartistservice.repository;

import com.gbs.plus.movieartistservice.model.Movie;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieArtistsRepository extends JpaRepository<Movie, Long>{

    
    
}
