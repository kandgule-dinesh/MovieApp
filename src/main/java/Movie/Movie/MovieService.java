package Movie.Movie;

// package com.movieapp.service;

// import com.movieapp.model.Movie;
// import com.movieapp.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    public Optional<Movie> getMovieById(Long id) {
        return movieRepository.findById(id);
    }

    public Movie saveMovie(Movie movie) {
        return movieRepository.save(movie);
    }

    public void deleteMovie(Long id) {
        movieRepository.deleteById(id);
    }
}
