package ru.netology.domain;

public class MoviesManager {
    private MoviesTitles[] movies = new MoviesTitles[0];
    private int lastMovies;

    public MoviesManager() {
        this.lastMovies = 5;
    }

    public MoviesManager(int lastMovies) {
        this.lastMovies = lastMovies;
    }

    public void add(MoviesTitles movie) {
        MoviesTitles[] tmp = new MoviesTitles[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];

        }
        tmp[tmp.length - 1] = movie;
        movies = tmp;
    }

    public MoviesTitles[] findAll() {
        return movies;
    }

    public MoviesTitles[] findAllReversed() {
        MoviesTitles[] reversed = new MoviesTitles[movies.length];
        for (int i = 0; i < reversed.length; i++) {
            reversed[i] = movies[movies.length - 1 - i];
        }
        return reversed;
    }

    public MoviesTitles[] findLast() {
        int resultLength;
        if (movies.length >= lastMovies) {
            resultLength = lastMovies;
        } else {
            resultLength = movies.length;
        }
        MoviesTitles[] result = new MoviesTitles[resultLength];
        for (int i = 0; i < result.length; i++) {
            result[i] = movies[movies.length - 1 - i];
        }
        return result;
    }
}
