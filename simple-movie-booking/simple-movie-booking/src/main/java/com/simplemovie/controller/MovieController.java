package com.simplemovie.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simplemovie.entity.Movie;
import com.simplemovie.service.MovieService;

	//	http:localhost:8080/
@RestController
@RequestMapping("/api/movies")
public class MovieController {
	
	private final MovieService service;
	public MovieController(MovieService service) {
		this.service=service;
	}
	
	@PostMapping
	public Movie addMovie(@RequestBody Movie movie) {
		return service.addMovie(movie);
	}
	
	@GetMapping
	public List<Movie> getAllMovies(){
		return service.getAllMovies();
	}
}