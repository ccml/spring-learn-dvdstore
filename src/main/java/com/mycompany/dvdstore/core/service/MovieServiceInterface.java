package com.mycompany.dvdstore.core.service;

import com.mycompany.dvdstore.core.entity.Movie;

import java.util.List;

public interface MovieServiceInterface {
    List<Movie> getMovieList();
    void registerMovie(Movie movie);
}
