package com.codeclan.example.top10movies;

/**
 * Created by user on 23/02/2017.
 */

public class Movie {
    private int id;
    private String title;
    private String genre;
    private int currentranking;


    public Movie(String title, String genre, int currentranking) {
        this.title = title;
        this.genre = genre;
        this.currentranking = currentranking;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public int getCurrentranking() {
        return currentranking;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setCurrentranking(int currentranking) {
        this.currentranking = currentranking;
    }
}
