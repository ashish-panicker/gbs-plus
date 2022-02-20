package com.gbs.plus.moviesapi.batch;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class MovieInput {
    private String Poster_Link;
    private String Series_Title;
    private String Released_Year;
    private String Certificate;
    private String Runtime;
    private String Genre;
    private String IMDB_Rating;
    private String Overview;
    private String Meta_score;
    private String Director;
    private String Star1;
    private String Star2;
    private String Star3;
    private String Star4;
    private String No_of_Votes;
    private String Gross;
}
