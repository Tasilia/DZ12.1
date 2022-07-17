package ru.netology.PosterManager;

public class PosterManager {
    private String[] movieTitle = new String[0];
    private int limit = 10;

    public PosterManager() {

    }

    public PosterManager(int limit) {
        this.limit = limit;
    }

    public void add(String title) {
        String[] tmp = new String[movieTitle.length + 1];
        for (int i = 0; i < movieTitle.length; i++) {
            tmp[i] = movieTitle[i];
        }
        tmp[tmp.length - 1] = title;
        movieTitle = tmp;
    }

    public String[] findAll() {
        return movieTitle;
    }

    public String[] findLast() {
        int resultLength;
        if (movieTitle.length >= limit) {
            resultLength = limit;
        } else {
            resultLength = movieTitle.length;
        }
        String[] reversed = new String[resultLength];
        for (int i = 0; i < reversed.length; i++) {
            reversed[i] = movieTitle[movieTitle.length - 1 - i];
        }
        return reversed;
    }
}
