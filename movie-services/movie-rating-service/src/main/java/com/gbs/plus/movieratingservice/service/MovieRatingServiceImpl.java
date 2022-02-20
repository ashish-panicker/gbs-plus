package com.gbs.plus.movieratingservice.service;

import java.util.List;

import com.gbs.plus.movieratingservice.model.Movie;
import com.gbs.plus.movieratingservice.repo.MovieRatingRepository;

import org.springframework.stereotype.Service;

@Service
public class MovieRatingServiceImpl implements MovieRatingService{


    private MovieRatingRepository movieRatingRepository;

    public MovieRatingServiceImpl(MovieRatingRepository movieRatingRepository) {
        this.movieRatingRepository = movieRatingRepository;
    }

    @Override
    public List<Movie> findByImdbRatingBetween(Double min, Double max) {
        return movieRatingRepository.findByImdbRatingBetween(min, max);
    }

    @Override
    public List<Movie> findByImdbRating(Double rating) {
        return movieRatingRepository.findByImdbRating(rating);
    }
    
}
