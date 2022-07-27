package ru.programmer.model.abstraction;

public class PoliceDepartment extends Building{
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
}
