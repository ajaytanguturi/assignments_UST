package com.simplemovie.controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.simplemovie.entity.Show;
import com.simplemovie.service.ShowService;

@RestController
@RequestMapping("/api/shows")
public class ShowController {
	private final ShowService service;
	public ShowController(ShowService service) {
		this.service=service;
	}
	
	@PostMapping
	public Show createShow(@RequestBody Show show) {
		return service.createShow(show);
	}
	
	@GetMapping
	public List<Show> getAllShows(){
		return service.getAllShows();
	}
	
	@GetMapping("/movie/{movieId}")
	public List<Show> getShowsByMovie(@PathVariable Long movieId){
		return service.getShowsByMovie(movieId);
	}

}
