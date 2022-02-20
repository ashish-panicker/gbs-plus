package com.gbs.plus.movieratingservice.service;

import java.util.List;

import com.gbs.plus.movieratingservice.model.Movie;

public interface MovieRatingService {
    List<Movie> findByImdbRatingBetween(Double min, Double max);

    List<Movie> findByImdbRating(Double rating);
}
