package com.mycompany.dvdstore.repository;

import com.mycompany.dvdstore.entity.Movie;

import java.io.*;

public class FileMovieRepository implements MovieRepositoryInterface {
    private File file;

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public void add(Movie movie) {
        try {
            Writer output;
            output = new BufferedWriter(new FileWriter(file, true));
            output.append(movie.getTitle() + ";" + movie.getGenre() + "\n");
            output.flush();
            output.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}