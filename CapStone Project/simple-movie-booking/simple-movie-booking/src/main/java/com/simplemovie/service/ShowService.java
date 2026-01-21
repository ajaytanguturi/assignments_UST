package com.simplemovie.service;

import java.util.List;
import com.simplemovie.entity.Show;
public interface ShowService {
	Show createShow(Show show);
	List<Show> getAllShows();
	List<Show> getShowsByMovie(Long movieId);
}
