package ru.programmer.model.abstraction;

public class ShoppingCenter extends Building implements SocialHouse{
    @Override
    public String name() {
        return getName();
    }

    @Override
    public String address() {
        return getAddress();
    }

    @Override
    public int yearOfConstruction() {
        return getYear();
    }

    @Override
    public String architectName() {
        return getArhName();
    }

    @Override
    public boolean culturalMonument() {
        return isMonument();
    }

    @Override
    public String city() {
        return getCity();
    }

    @Override
    public int numbersOfFloors() {
        return getNumbersOfFloors();
    }

    @Override
    public void greenCorner() {
        System.out.println("Есть ли зелёный уголок: " + (isGreenCorner()?"Да":"Нет"));
    }

    @Override
    public void numberOfStores() {
        System.out.println("Кол-во магазинов/прилавок: "+getNumberOfStores());
    }
}
