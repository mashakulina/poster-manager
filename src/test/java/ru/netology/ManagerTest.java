package ru.netology;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.domain.NameFilm;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ManagerTest {
    NameFilm film1 = new NameFilm("Бладшот");
    NameFilm film2 = new NameFilm("Вперёд");
    NameFilm film3 = new NameFilm("Отель <<Белград>>");
    NameFilm film4 = new NameFilm("Джентельмены");
    NameFilm film5 = new NameFilm("Номер один");
    NameFilm film6 = new NameFilm("Человек-невидимка");
    NameFilm film7 = new NameFilm("Тролли. Мировой тур");
    NameFilm film8 = new NameFilm("Человек-паук");
    NameFilm film9 = new NameFilm("Достать ножи");
    NameFilm film10 = new NameFilm("Крик");
    NameFilm film11 = new NameFilm("Звонок");
    NameFilm film12 = new NameFilm("Пропущенный звонок");
    NameFilm film13 = new NameFilm("Один дома");

    @Test
    public void TestSave() {
        Manager manager = new Manager();
        manager.save(film1);
        manager.save(film2);
        manager.save(film3);
        manager.save(film4);
        manager.save(film5);

        NameFilm[] actual = manager.findAll();
        NameFilm[] expected = {film1, film2, film3, film4, film5};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void TestGetAll() {
        Manager manager = new Manager();
        manager.save(film1);
        manager.save(film2);
        manager.save(film3);
        manager.save(film4);
        manager.save(film5);

        NameFilm[] actual = manager.getAll();
        NameFilm[] expected = {film5, film4, film3, film2, film1};
    }

    @Test
    public void TestFindLast() {
        Manager manager = new Manager();
        manager.save(film1);
        manager.save(film2);
        manager.save(film3);
        manager.save(film4);
        manager.save(film5);
        manager.save(film6);
        manager.save(film7);
        manager.save(film8);
        manager.save(film9);
        manager.save(film10);
        manager.save(film11);

        NameFilm[] actual = manager.findLast();
        NameFilm[] expected = {film11, film10, film9, film8, film7, film6, film5, film4, film3, film2};

    }

    @Test
    public void TestFindLastmin() {
        Manager manager = new Manager();
        manager.save(film1);
        manager.save(film2);
        manager.save(film3);
        manager.save(film4);
        manager.save(film5);
        manager.save(film6);


        NameFilm[] actual = manager.findLast();
        NameFilm[] expected = {film6, film5, film4, film3, film2, film1};

    }
}
