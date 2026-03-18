package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MoviesManagerTest {

    MoviesManager manager = new MoviesManager();

    MoviesTitles movie1 = new MoviesTitles("Полночь в Париже");
    MoviesTitles movie2 = new MoviesTitles("Оппенгеймер");
    MoviesTitles movie3 = new MoviesTitles("Начало");
    MoviesTitles movie4 = new MoviesTitles("Дождливый день в Нью-Йорке");
    MoviesTitles movie5 = new MoviesTitles("Игра в имитацию");
    MoviesTitles movie6 = new MoviesTitles("Дюнкерк");
    MoviesTitles movie7 = new MoviesTitles("Великий Гэтсби");
    MoviesTitles movie8 = new MoviesTitles("Мстители");

    @BeforeEach
    public void setup() {
        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);
        manager.add(movie6);
        manager.add(movie7);
        manager.add(movie8);
    }

    @Test
    public void shouldFindAll() {
        manager.findAll();

        MoviesTitles[] expected = {movie1, movie2, movie3, movie4, movie5, movie6, movie7, movie8};
        MoviesTitles[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLMoviesReversed() {
        manager.findAllReversed();

        MoviesTitles[] expected = {movie8, movie7, movie6, movie5, movie4, movie3, movie2, movie1};
        MoviesTitles[] actual = manager.findAllReversed();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastFiveMovies() {
        manager.findLast();

        MoviesTitles[] expected = {movie8, movie7, movie6, movie5, movie4};
        MoviesTitles[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastThreeMovies() {
        MoviesManager manager = new MoviesManager(3);
        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);
        manager.add(movie6);
        manager.add(movie7);
        manager.add(movie8);
        manager.findLast();

        MoviesTitles[] expected = {movie8, movie7, movie6};
        MoviesTitles[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastMoviesWhenValueBiggerThanArray() {
        MoviesManager manager = new MoviesManager(7);
        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);
        manager.findLast();

        MoviesTitles[] expected = {movie5, movie4, movie3, movie2, movie1};
        MoviesTitles[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}