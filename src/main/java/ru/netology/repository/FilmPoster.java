package ru.netology.repository;

import ru.netology.domain.FilmItem;

public class FilmPoster {
    private FilmItem[] films = new FilmItem[0];

    public void addNewFilm(FilmItem film) {
        FilmItem[] tmp = new FilmItem[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;
    }

    public void removeById(int FilmId) {
        FilmItem[] tmp = new FilmItem[films.length - 1];
        int copyToIndex = 0;
        for (FilmItem film : films) {
            if (film.getFilmId() != FilmId) {
                tmp[copyToIndex] = film;
                copyToIndex++;
            }
        }
        films = tmp;
    }

    public void removeByName(String filmName) {
        FilmItem[] tmp = new FilmItem[films.length - 1];
        int copyToIndex = 0;
        for (FilmItem film : films) {
            if (film.getFilmName() != "Film_4") {
                tmp[copyToIndex] = film;
                copyToIndex++;
            }
        }
        films = tmp;
    }

    public FilmItem[] getFilms() {
        return films;
    }
}