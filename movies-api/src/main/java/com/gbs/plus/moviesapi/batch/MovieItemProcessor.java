package com.gbs.plus.moviesapi.batch;

import com.gbs.plus.moviesapi.model.entities.Movie;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

public class MovieItemProcessor implements ItemProcessor<MovieInput, Movie> {

    private static final Logger log = LoggerFactory.getLogger(MovieItemProcessor.class);
    private static long id = 0;
    @Override
    public Movie process(MovieInput item) throws Exception {

        // log.info("Being processed: {}", item);
        Movie movie = new Movie();

        movie.setId(++id);
        movie.setPosterLink(item.getPoster_Link());
        movie.setSeriesTitle(item.getSeries_Title());
        movie.setCertificate(item.getCertificate());
        movie.setGenre(item.getGenre());
        movie.setOverview(item.getOverview());
        movie.setDirector(item.getDirector());
        movie.setStar1(item.getStar1());
        movie.setStar2(item.getStar2());
        movie.setStar3(item.getStar3());
        movie.setStar4(item.getStar4());

        if (!item.getReleased_Year().isEmpty()) {
            try {
                movie.setReleasedYear(Integer.parseInt(item.getReleased_Year()));
            } catch (Exception e) {
                log.error("Error while parsing released year {}", e.getMessage());
            }
        }

        if (!item.getRuntime().isEmpty()) {
            try {
                movie.setRuntime(Integer.parseInt(item.getRuntime().trim().replace("min", "").trim()));
            } catch (Exception e) {
                log.error("Error while parsing runtime {}", e.getMessage());
                
            }
        }

        if (!item.getIMDB_Rating().isEmpty()) {
            try {
                movie.setImdbRating(Double.parseDouble(item.getIMDB_Rating().trim()));
            } catch (Exception e) {
                log.error("Error while parsing imdb rating {}", e.getMessage());
                
            }
        }

        if (!item.getMeta_score().isEmpty()) {
            try {
                movie.setMetaScore(Double.parseDouble(item.getMeta_score().trim()));
            } catch (Exception e) {
                log.error("Error while parsing meta score {}", e.getMessage());
                
                
            }
        }

        if (!item.getNo_of_Votes().isEmpty()) {
            try {
                movie.setNoOfVotes(Long.parseLong(item.getNo_of_Votes().trim()));
            } catch (Exception e) {
                log.error("Error while parsing no of votes {}", e.getMessage());
                
            }
        }

        if (!item.getGross().isEmpty()) {
            try {
                movie.setGross(Long.parseLong(item.getGross().trim().replace(",", "").trim()));
            } catch (Exception e) {
                log.error("Error while parsing gross {}", e.getMessage());
                
            }
        }

        log.info("Processed: {}", movie);

        return movie;
    }

}
