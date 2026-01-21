package com.simplemovie.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.simplemovie.entity.Movie;
import com.simplemovie.entity.Show;
import com.simplemovie.repository.MovieRepository;
import com.simplemovie.repository.ShowRepository;

@Service
public class ShowServiceImpl  implements ShowService{
	
	private final ShowRepository showRepo;
	private final MovieRepository movieRepo;
	public ShowServiceImpl(ShowRepository showRepo, MovieRepository movieRepo) {
		this.showRepo=showRepo;
		this.movieRepo=movieRepo;
	}
	@Override
	public Show createShow(Show show) {
		Long movieId = show.getMovie().getMovieId();

        Movie movie = movieRepo.findById(movieId)
                .orElseThrow(() -> new RuntimeException("Movie not found"));

        show.setMovie(movie);
		return showRepo.save(show);
	}
	@Override
	public List<Show> getAllShows() {
		return showRepo.findAll();
	}
	@Override
	public List<Show> getShowsByMovie(Long movieId) {
		return showRepo.findByMovieMovieId(movieId);
	}
}