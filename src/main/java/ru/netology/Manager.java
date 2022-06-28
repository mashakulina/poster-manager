package ru.netology;


public class Manager {
    private String[] films = new String[0];
    private int limit;

    public Manager() {
        limit = 10;
    }

    public Manager(int limit) {
        this.limit = limit;
    }

    public void add(String film) {
        String[] tmp = new String[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;
    }
    public String[] findAll() {
        return films;
    }
    public String[] findLast() {
        String[] result;
        if (limit < films.length) {
            result = new String[limit];
        } else {
            result = new String[films.length];
        }
        for (int i = 0; i < result.length; i++) {
            int index = films.length - i - 1;
            result[i] = films[index];
        }
        return result;
    }
}