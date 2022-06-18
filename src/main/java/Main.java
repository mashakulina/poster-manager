import ru.netology.Manager;
import ru.netology.domain.NameFilm;

public class Main {
    public static void main(String[] args) {

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
        manager.save(film12);
        manager.save(film13);

        NameFilm[] findAll = manager.findAll();

        NameFilm[] getAll = manager.getAll();

        NameFilm[] findLast = manager.findLast();

    }


}
