package ru.programmer.model.abstraction;

public class HighRiseBuilding extends Building implements LivingHouse{
    public HighRiseBuilding() {
    }

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
        return false;
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
    public void entertainmentRoom() {
        System.out.println("Есть ли комната для развлечения: "+(isEnterRoom()?"Да":"Нет"));
    }

    @Override
    public void countOfPrivatRoom() {
        System.out.println("Кол-во личных комнат: "+ getCountPrRoom());
    }
}
