package com.simplemovie.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.simplemovie.entity.Movie;
import com.simplemovie.repository.MovieRepository;

@Service
public class MovieServiceImpl implements MovieService {
	private final MovieRepository repo;
	
	public MovieServiceImpl(MovieRepository repo) {
		this.repo=repo;
	}
	@Override
	public Movie addMovie(Movie movie) {
		return repo.save(movie);
	}

	@Override
	public List<Movie> getAllMovies() {
		return repo.findAll();
	}
}