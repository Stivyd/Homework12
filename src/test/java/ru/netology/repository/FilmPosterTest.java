package ru.netology.repository;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.domain.FilmItem;

import java.util.Arrays;

public class FilmPosterTest {
    FilmItem film1 = new FilmItem(1, "Film_1");
    FilmItem film2 = new FilmItem(2, "Film_2");
    FilmItem film3 = new FilmItem(3, "Film_3");
    FilmItem film4 = new FilmItem(4, "Film_4");
    FilmItem film5 = new FilmItem(5, "Film_5");
    FilmItem film6 = new FilmItem(6, "Film_6");
    FilmItem film7 = new FilmItem(7, "Film_7");


    @Test
    public void addAndRemoveFilms() {
        FilmPoster poster = new FilmPoster();
        poster.addNewFilm(film1);
        poster.addNewFilm(film2);
        poster.addNewFilm(film3);
        poster.addNewFilm(film4);
        poster.addNewFilm(film5);
        poster.addNewFilm(film6);
        poster.addNewFilm(film7);
        poster.removeById(film2.getFilmId());
        poster.removeById(film5.getFilmId());
        poster.removeByName(film4.getFilmName());

        FilmItem[] expected = {film1, film3, film6, film7};
        FilmItem[] actual = poster.getFilms();

        Assertions.assertArrayEquals(expected, actual);
        System.out.print("Тест_афиши_1 - выводим список фильмов: ");
        System.out.println(Arrays.toString(actual));
    }
}