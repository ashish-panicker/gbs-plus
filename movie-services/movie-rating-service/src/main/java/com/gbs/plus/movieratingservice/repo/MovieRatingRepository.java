package com.gbs.plus.movieratingservice.repo;

import java.util.List;

import com.gbs.plus.movieratingservice.model.Movie;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRatingRepository extends JpaRepository<Movie, Long> {

    List<Movie> findByImdbRatingBetween(Double min, Double max);

    List<Movie> findByImdbRating(Double rating);
}
