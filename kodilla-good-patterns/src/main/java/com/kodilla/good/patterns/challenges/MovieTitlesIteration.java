package com.kodilla.good.patterns.challenges;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MovieTitlesIteration {

    public String getMovieTitle() {
        MovieStore movieStore = new MovieStore();
        Map<String, List<String>> movieTitles = movieStore.getMovies();

        return movieTitles.entrySet().stream()
                .map(mv -> mv.getValue())
                .flatMap(mv -> mv.stream())
                .collect(Collectors.joining("!","",""));
    }

    public static void main(String[] args) {
        MovieTitlesIteration movieTitlesIteration = new MovieTitlesIteration();
        System.out.println(movieTitlesIteration.getMovieTitle());
    }
}
