package com.mycompany.dvdstore.repository;

import com.mycompany.dvdstore.entity.Movie;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class GoLiveMovieRepository implements MovieRepositoryInterface {
    public void add(Movie movie) {
        try {
            Writer output;
            output = new BufferedWriter(new FileWriter("D:\\temp\\movie.txt", true));
            output.append(movie.getTitle() + ";" + movie.getGenre() + "\n");
            output.flush();
            output.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
