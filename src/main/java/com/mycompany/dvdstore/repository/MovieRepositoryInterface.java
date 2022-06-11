package com.mycompany.dvdstore.repository;

import com.mycompany.dvdstore.entity.Movie;

import java.util.List;

public interface MovieRepositoryInterface {
    List<Movie> list();
    void add(Movie movie);
}
