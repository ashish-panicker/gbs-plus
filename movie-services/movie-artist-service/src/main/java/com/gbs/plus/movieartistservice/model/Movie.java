package com.gbs.plus.movieartistservice.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "movie_details")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor


public class Movie{

    @Id
    private Long id;

    private String posterLink;

    private String seriesTitle;

    private Integer releasedYear;

    private String certificate;

    private Integer runtime;
    
    private String genre;

    private Double imdbRating;

    @Lob
    // @Column(name = "overview", columnDefinition = "TEXT", length = 512)
    private String overview;

    private Double metaScore;

    private String director;

    private String star1;

    private String star2;

    private String star3;

    private String star4;

    private Long noOfVotes;

    private Long gross;
}