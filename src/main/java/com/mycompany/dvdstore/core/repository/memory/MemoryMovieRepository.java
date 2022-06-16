package com.mycompany.dvdstore.core.repository.memory;

import com.mycompany.dvdstore.core.repository.MovieRepositoryInterface;
import com.mycompany.dvdstore.core.entity.Movie;

import java.util.ArrayList;
import java.util.List;

//@Repository
public class MemoryMovieRepository implements MovieRepositoryInterface {

    private static long lastNumber = 0L;

    private List<Movie> movies = new ArrayList<>();

    public Movie add(Movie movie) {
        movie.setId(++lastNumber);
        movies.add(movie);
        System.out.println("The movie " + movie.getTitle() + " has been added.");
        return movie;
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
