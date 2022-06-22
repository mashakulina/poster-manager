package ru.netology;

import ru.netology.domain.NameFilm;

public class Manager {

    private NameFilm[] names = new NameFilm[0];

    public void save(NameFilm name) {
        int length = names.length + 1;
        NameFilm[] tmp = new NameFilm[length];
        System.arraycopy(names, 0, tmp, 0, names.length);

        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = name;
        names = tmp;
    }

    public NameFilm[] findAll() {
        return names;
    }

    public NameFilm[] getAll() {
        NameFilm[] result = new NameFilm[names.length];
        for (int i = 0; i < result.length; i++) {
            int index = names.length - i - 1;
            result[i] = names[index];
        }
        return result;
    }

    public NameFilm[] findLast() {
        int resultLength = 10;
        if (names.length < resultLength) {
            resultLength = names.length;
        } else {
            resultLength = resultLength;
        }
        NameFilm[] result = new NameFilm[resultLength];
        for (int i = 0; i < resultLength; i++) {
            int index = names.length - i - 1;
            result[i] = names[index];
        }
        return result;
    }
}