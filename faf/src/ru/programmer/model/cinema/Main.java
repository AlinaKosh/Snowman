package ru.programmer.model.cinema;

import ru.programmer.model.cinema.hall.Busy;
import ru.programmer.model.cinema.hall.Free;
import ru.programmer.model.cinema.movie.Fantasy;
import ru.programmer.model.cinema.movie.Fiction;
import ru.programmer.model.cinema.movie.Horror;
import ru.programmer.model.cinema.person.Janitors;
import ru.programmer.model.cinema.person.Security;
import ru.programmer.model.cinema.person.Sellers;
import ru.programmer.model.cinema.products.Candy;
import ru.programmer.model.cinema.products.Popcorn;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n-------------------------------------------------------------\n");
        Horror horror = new Horror("Сияние","Чужой","Челюсти","Кэрри","Оно",144,
                116,124,98,190,true,false,false,true,true);
        horror.display();
        horror.setScare(true);
        horror.scareMove();
        horror.setCelebrities(true);
        horror.setCountCelebrities(3);
        horror.setScoreOnAllFilms(4.3);
        horror.score();
        horror.celebrities();
        System.out.println("\n-------------------------------------------------------------\n");

        Fantasy fantasy = new Fantasy("Малефисента","Сумерки","Валли","Гарри Поттер","Университет Монстров",
                115,122,97,130,110,true,false,true,true,true);
        fantasy.display();
        fantasy.setCaptured(true);
        fantasy.captured();
        fantasy.setScoreOnAllFilms(4.9);
        fantasy.score();
        fantasy.setCelebrities(false);
        fantasy.setCountCelebrities(0);
        fantasy.celebrities();
        System.out.println("\n-------------------------------------------------------------\n");

        Fiction fiction = new Fiction("Аватар","Начало","Интерстеллар","Мстители","Доктор Стрэндж",
                162,148,169,181,115,true,true,true,true,true);
        fiction.display();
        fiction.setBlewYourMind(true);
        fiction.bumMind();
        fiction.setScoreOnAllFilms(5.0);
        fiction.score();
        fiction.setCelebrities(true);
        fiction.setCountCelebrities(15);
        fiction.celebrities();
        System.out.println("\n-------------------------------------------------------------\n");

        Busy busy = new Busy(true,false,false,190);
        busy.displayHall();
        System.out.println(busy.opinionPerson());
        System.out.println("\n-------------------------------------------------------------\n");

        Free free = new Free(false,true,true,180);
        free.displayHall();
        System.out.println(free.opinionPerson());
        System.out.println("\n-------------------------------------------------------------\n");

        Sellers sellers = new Sellers("Мария А.А.","Гриша В.А.","Дарья А.Б.","Леонид А.Ф.","Дмитрий Ф.Ф.",
                8,6,7,4,8,true,true,false,true,false);
        sellers.displayForPerson();
        System.out.println("\n-------------------------------------------------------------\n");

        Security security = new Security("Фёдр А.Д.","Михаил Л.Б.","Кирилл Т.В.",8,9,8,false,true,true);
        security.displayForPerson();
        System.out.println("\n-------------------------------------------------------------\n");

        Janitors janitors = new Janitors("Виктор В.А.","Мария О.А.",8,7,false,false);
        janitors.displayForPerson();
        System.out.println("\n-------------------------------------------------------------\n");

        int k = Integer.parseInt(String.valueOf(Sellers.countPerson1))+Integer.parseInt(String.valueOf(Security.countPerson2))+Integer.parseInt(String.valueOf(Janitors.countPerson3));
        System.out.println("Общее кол-во созданных переменных sellers,security,janitors: "+k);
        System.out.println("\n-------------------------------------------------------------\n");

        Popcorn popcorn = new Popcorn("Попкорн",true,5,true);
        popcorn.displayEating();
        popcorn.setGrilledPortion(true);
        popcorn.popcornPortion();
        System.out.println("\n-------------------------------------------------------------\n");

        Candy candy = new Candy("Сахарная вата",true,8,false);
        candy.displayEating();
        candy.setColoredAbsorbentCotton(false);
        candy.cottonCandy();
        System.out.println("\n-------------------------------------------------------------\n");
    }
}
