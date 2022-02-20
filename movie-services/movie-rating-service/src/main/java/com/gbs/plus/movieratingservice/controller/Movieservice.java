package com.gbs.plus.movieratingservice.controller;

import java.util.List;

import com.gbs.plus.movieratingservice.model.Movie;
import com.gbs.plus.movieratingservice.service.MovieRatingService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movies")
public class Movieservice {

    @Autowired
    private MovieRatingService movieRatingService;

    @GetMapping("/rating/{min}/{max}")
    public List<Movie> findByImdbRatingBetween(@PathVariable("min") Double min, @PathVariable("max") Double max) {
        return movieRatingService.findByImdbRatingBetween(min, max);
    }

    @GetMapping("/rating/{rating}")
    public List<Movie> findByImdbRating(@PathVariable("rating") Double rating) {
        return movieRatingService.findByImdbRating(rating);
    }

}
