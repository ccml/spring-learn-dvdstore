package com.mycompany.dvdstore.service;

import com.mycompany.dvdstore.entity.Movie;

import java.util.List;

public interface MovieServiceInterface {
    List<Movie> getMovieList();
    void registerMovie(Movie movie);
}
