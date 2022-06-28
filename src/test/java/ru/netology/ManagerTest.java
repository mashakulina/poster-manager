package ru.netology;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class ManagerTest {
    Manager manager = new Manager();
    String film1 = new String("Бладшот");
    String film2 = new String("Вперёд");
    String film3 = new String("Отель <<Белград>>");
    String film4 = new String("Джентельмены");
    String film5 = new String("Номер один");
    String film6 = new String("Человек-невидимка");
    String film7 = new String("Тролли. Мировой тур");
    String film8 = new String("Человек-паук");
    String film9 = new String("Достать ножи");
    String film10 = new String("Крик");
    String film11 = new String("Звонок");
    String film12 = new String("Пропущенный звонок");
    String film13 = new String("Один дома");

    @Test
    public void TestAdd() {
        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);

        String[] actual = manager.findAll();
        String[] expected = {film1, film2, film3, film4, film5};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void TestFindLast() {
        Manager manager = new Manager();
        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);
        manager.add(film6);
        manager.add(film7);
        manager.add(film8);
        manager.add(film9);
        manager.add(film10);
        manager.add(film11);

        String[] actual = manager.findLast();
        String[] expected = {film11, film10, film9, film8, film7, film6, film5, film4, film3, film2};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void TestFindLastWithLimit() {
        Manager manager = new Manager(5);
        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);
        manager.add(film6);
        manager.add(film7);
        manager.add(film8);
        manager.add(film9);
        manager.add(film10);
        manager.add(film11);


        String[] actual = manager.findLast();
        String[] expected = {film11, film10, film9, film8, film7};
        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void TestFindLastMin() {
        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);

        String[] actual = manager.findLast();
        String[] expected = {film4, film3, film2, film1};
        Assertions.assertArrayEquals(expected, actual);
    }
}
