package com.mycompany.dvdstore.core.repository.memory;

import com.mycompany.dvdstore.core.repository.MovieRepositoryInterface;
import com.mycompany.dvdstore.core.entity.Movie;

import java.util.ArrayList;
import java.util.List;

//@Repository
public class MemoryMovieRepository implements MovieRepositoryInterface {

    private List<Movie> movies = new ArrayList<>();

    public void add(Movie movie) {
        movies.add(movie);
        System.out.println("The movie " + movie.getTitle() + " has been added.");
    }

    @Override
    public List<Movie> list() {
        return movies;
    }

    @Override
    public Movie getById(Long id) {
        return movies.stream().
                filter(m -> m.getId()==id).
                findFirst().get();
    }
}
