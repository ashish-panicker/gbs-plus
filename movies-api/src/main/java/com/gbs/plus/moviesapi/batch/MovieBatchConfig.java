package com.gbs.plus.moviesapi.batch;

import javax.sql.DataSource;

import com.fasterxml.jackson.databind.deser.DataFormatReaders.Match;
import com.gbs.plus.moviesapi.model.entities.Movie;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.item.database.BeanPropertyItemSqlParameterSourceProvider;
import org.springframework.batch.item.database.JdbcBatchItemWriter;
import org.springframework.batch.item.database.builder.JdbcBatchItemWriterBuilder;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.builder.FlatFileItemReaderBuilder;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;


@Configuration
@EnableBatchProcessing
public class MovieBatchConfig {

    // 89039 01742

    private final String[] FIELD_NAMES = new String[] { "Poster_Link",
            "Series_Title",
            "Released_Year",
            "Certificate",
            "Runtime",
            "Genre",
            "IMDB_Rating",
            "Overview",
            "Meta_score",
            "Director",
            "Star1",
            "Star2",
            "Star3",
            "Star4",
            "No_of_Votes",
            "Gross" };

    @Autowired
    private JobBuilderFactory jobBuilderFactory;

    @Autowired
    private StepBuilderFactory stepBuilderFactory;

    @Bean
    public MovieItemProcessor getMovieItemProcessor() {
        return new MovieItemProcessor();
    }

    @Bean
    public FlatFileItemReader<MovieInput> reader() {

        BeanWrapperFieldSetMapper<MovieInput> mapper = new BeanWrapperFieldSetMapper<>();
        mapper.setTargetType(MovieInput.class);

        return new FlatFileItemReaderBuilder<MovieInput>()
                .name("movieItemReader")
                .resource(new ClassPathResource("movies.csv"))
                .delimited()
                .names(FIELD_NAMES)
                .fieldSetMapper(mapper)
                .build();

    }

    @Bean
    public JdbcBatchItemWriter<Movie> writer(DataSource dataSource) {

        return new JdbcBatchItemWriterBuilder<Movie>()
                .itemSqlParameterSourceProvider(new BeanPropertyItemSqlParameterSourceProvider<>())
                .sql("  INSERT INTO movie_details ( id, poster_link, series_title, released_year, certificate, " +
                        "runtime, genre, imdb_rating, overview, meta_score, director, star1, star2, star3, " +
                        "star4, no_of_votes, gross) " +
                        "VALUES (:id, :posterLink, :seriesTitle, :releasedYear, :certificate, +" +
                        ":runtime, :genre, :imdbRating, :overview, :metaScore, :director, :star1, :star2, " +
                        ":star3, :star4, :noOfVotes, :gross)")
                .dataSource(dataSource)
                .build();
    }

    @Bean
    public Job importMovieJob(JobCompletionNotificationListener listener, Step step){
        return jobBuilderFactory.get("importMovieJob")
                .incrementer(new RunIdIncrementer())
                .listener(listener)
                .flow(step)
                .end()
                .build();
    }

    @Bean
    public Step step1(JdbcBatchItemWriter<Movie> writer){
        return stepBuilderFactory.get("step")
                .<MovieInput, Movie> chunk(1000)
                .reader(reader())
                .processor(getMovieItemProcessor())
                .writer(writer)
                .build();
    }

}
