package com.simplemovie.service;

import java.util.List;
import com.simplemovie.entity.Movie;

public interface MovieService {
	Movie addMovie(Movie movie);
	List<Movie> getAllMovies();
}
