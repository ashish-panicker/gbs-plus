package com.gbs.plus.moviesapi.model.entities;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "movie_details")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String posterLink;

    private String seriesTitle;

    private Integer releasedYear;

    private String Certificate;

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
