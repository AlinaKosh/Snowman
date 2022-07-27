package ru.programmer.model.abstraction;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n--------------------------------------------\n");
        HighRiseBuilding highRiseBuilding = new HighRiseBuilding();
        highRiseBuilding.setName("Высотка");
        highRiseBuilding.setAddress("Малиновская 78 д.5");
        highRiseBuilding.setYear(10);
        highRiseBuilding.setArhName("Пупкин А.А.");
        highRiseBuilding.setMonument(false);
        highRiseBuilding.setCity("Москва");
        highRiseBuilding.setNumbersOfFloors(56);
        highRiseBuilding.setOpinionAboutLife(true);
        highRiseBuilding.setNumberOfApartments(5);
        System.out.println("Имя сооружения: " + highRiseBuilding.name() + ", Адрес: " + highRiseBuilding.address() +
                ", Год: " + highRiseBuilding.yearOfConstruction() + ", Имя архитектора: " +
                highRiseBuilding.architectName() + ", Историческое место: " +
                (highRiseBuilding.culturalMonument() ? "Да" : "Нет")+ ", Город: " +highRiseBuilding.city()+
                ", Кол-во этажей: "+highRiseBuilding.numbersOfFloors());
        System.out.println(highRiseBuilding);
        highRiseBuilding.opinion();
        highRiseBuilding.apartments();
        highRiseBuilding.setEnterRoom(false);
        highRiseBuilding.setCountPrRoom(1);
        highRiseBuilding.entertainmentRoom();
        highRiseBuilding.countOfPrivatRoom();
        System.out.println("\n--------------------------------------------\n");

        Library library = new Library();
        library.setName("Библиотека");
        library.setAddress("Пушкинская 45 д.3");
        library.setYear(90);
        library.setArhName("Дудкин В.Б.");
        library.setMonument(true);
        library.setCity("Краснодар");
        library.setNumbersOfFloors(4);
        library.setOpinionAboutLife(true);
        library.setNumberOfApartments(1);
        library.setGreenCorner(true);
        library.setNumberOfStores(23);
        System.out.println("Имя сооружения: " + library.name() + ", Адрес: " + library.address() +
                ", Год: " + library.yearOfConstruction() + ", Имя архитектора: " +
                library.architectName() + ", Историческое место: " +
                (library.culturalMonument() ? "Да" : "Нет")+ ", Город: " +library.city()+
                ", Кол-во этажей: "+library.numbersOfFloors());
        System.out.println(library);
        library.opinion();
        library.apartments();
        library.greenCorner();
        library.numberOfStores();
        System.out.println("\n--------------------------------------------\n");

        House house = new House();
        house.setName("Дом");
        house.setAddress("Меркина А.Ф. д.22");
        house.setYear(4);
        house.setArhName("Радик А.У.");
        house.setMonument(false);
        house.setCity("Саратов");
        house.setNumbersOfFloors(2);
        house.setOpinionAboutLife(true);
        house.setNumberOfApartments(6);
        house.setEnterRoom(true);
        house.setCountPrRoom(2);
        System.out.println("Имя сооружения: " + house.name() + ", Адрес: " + house.address() +
                ", Год: " + house.yearOfConstruction() + ", Имя архитектора: " +
                house.architectName() + ", Историческое место: " +
                (house.culturalMonument() ? "Да" : "Нет")+ ", Город: " +house.city()+
                ", Кол-во этажей: "+house.numbersOfFloors());
        System.out.println(house);
        house.opinion();
        house.apartments();
        house.entertainmentRoom();
        house.countOfPrivatRoom();
        System.out.println("\n--------------------------------------------\n");

        PoliceDepartment policeDepartment = new PoliceDepartment();
        policeDepartment.setName("Департамент");
        policeDepartment.setAddress("Грузинская 45 д.6");
        policeDepartment.setYear(35);
        policeDepartment.setArhName("Морж Т.Ы.");
        policeDepartment.setMonument(false);
        policeDepartment.setCity("Чебоксары");
        policeDepartment.setNumberOfApartments(3);
        policeDepartment.setOpinionAboutLife(false);
        policeDepartment.setNumberOfApartments(8);
        System.out.println("Имя сооружения: " + policeDepartment.name() + ", Адрес: " + policeDepartment.address() +
                ", Год: " + policeDepartment.yearOfConstruction() + ", Имя архитектора: " +
                policeDepartment.architectName() + ", Историческое место: " +
                (policeDepartment.culturalMonument() ? "Да" : "Нет")+ ", Город: " +policeDepartment.city()+
                ", Кол-во этажей: "+policeDepartment.numbersOfFloors());
        System.out.println(policeDepartment);
        policeDepartment.opinion();
        policeDepartment.apartments();
        System.out.println("\n--------------------------------------------\n");

        University university = new University();
        university.setName("Университет");
        university.setAddress("Ручкина д.23");
        university.setYear(150);
        university.setArhName("Крикун Л.И.");
        university.setMonument(true);
        university.setCity("Маркс");
        university.setNumbersOfFloors(6);
        university.setOpinionAboutLife(true);
        university.setNumberOfApartments(23);
        System.out.println("Имя сооружения: " + university.name() + ", Адрес: " + university.address() +
                ", Год: " + university.yearOfConstruction() + ", Имя архитектора: " +
                university.architectName() + ", Историческое место: " +
                (university.culturalMonument() ? "Да" : "Нет")+ ", Город: " +university.city()+
                ", Кол-во этажей: "+university.numbersOfFloors());
        System.out.println(university);
        university.opinion();
        university.apartments();
        System.out.println("\n--------------------------------------------\n");

        ShoppingCenter shoppingCenter = new ShoppingCenter();
        shoppingCenter.setName("Шоппинг");
        shoppingCenter.setAddress("Шопинговская д.89");
        shoppingCenter.setYear(20);
        shoppingCenter.setArhName("Живун Я.Я.");
        shoppingCenter.setMonument(false);
        shoppingCenter.setCity("Ярославль");
        shoppingCenter.setNumbersOfFloors(4);
        shoppingCenter.setOpinionAboutLife(true);
        shoppingCenter.setNumberOfApartments(15);
        shoppingCenter.setGreenCorner(true);
        shoppingCenter.setNumberOfStores(50);
        System.out.println("Имя сооружения: " + shoppingCenter.name() + ", Адрес: " + shoppingCenter.address() +
                ", Год: " + shoppingCenter.yearOfConstruction() + ", Имя архитектора: " +
                shoppingCenter.architectName() + ", Историческое место: " +
                (shoppingCenter.culturalMonument() ? "Да" : "Нет")+ ", Город: " +shoppingCenter.city()+
                ", Кол-во этажей: "+shoppingCenter.numbersOfFloors());
        System.out.println(shoppingCenter);
        shoppingCenter.opinion();
        shoppingCenter.apartments();
        shoppingCenter.greenCorner();
        shoppingCenter.numberOfStores();
        System.out.println("\n--------------------------------------------\n");
    }
}
