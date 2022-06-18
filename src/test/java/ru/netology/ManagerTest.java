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

}
