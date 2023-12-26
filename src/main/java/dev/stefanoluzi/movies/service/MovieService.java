package dev.stefanoluzi.movies.service;

import dev.stefanoluzi.movies.Repository.MovieRepository;
import dev.stefanoluzi.movies.model.Movie;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;
    public List<Movie> allMovies(){
        return movieRepository.findAll();
    }
    public Optional<Movie> singleMovie(String imdbId){
        return movieRepository.findMovieByimdbId(imdbId);
    }



}
