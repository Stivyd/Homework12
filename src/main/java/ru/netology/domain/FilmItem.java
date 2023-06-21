package ru.netology.domain;

public class FilmItem {

    private int filmId;
    private String filmName;

    public FilmItem(int filmId, String filmName) {
        this.filmId = filmId;
        this.filmName = filmName;
    }

    public int getFilmId() {
        return filmId;
    }

    public String getFilmName() {
        return filmName;
    }

    public void setFilmId(int filmId) {
        this.filmId = filmId;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }
}

