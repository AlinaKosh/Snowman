package ru.programmer.model.abstraction;

public abstract class Building {

    private String name;
    private String address;
    private int year;
    private String arhName;
    private boolean monument;

    private String city;
    private int numbersOfFloors;

    //свои переменные для методов
    private boolean opinionAboutLife;
    private int numberOfApartments;

    //для интерфейса
    private boolean enterRoom;
    private int countPrRoom;
    private boolean greenCorner;
    private int numberOfStores;

    public abstract String name();
    public abstract String address();
    public abstract int yearOfConstruction();
    public abstract String architectName();
    public abstract boolean culturalMonument();

    //свои свойства
    public abstract String city();
    public abstract int numbersOfFloors();

    public String toString(){
        return "Перечисление того, что есть: "+getName()+", "+ getAddress()+", "+getYear()+", "+getArhName()+", "+
                getCity()+", "+getNumbersOfFloors()+", "+(isMonument()?"Да":"Нет");
    }

    public void opinion(){
        System.out.println("Нравится ли жить/учиться в этом месте: "+(isOpinionAboutLife()?"нравится":"не нравится"));
    }

    public void apartments(){
        System.out.println("Кол-во квартир/комнат на этаже: "+getNumberOfApartments());
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setArhName(String arhName) {
        this.arhName = arhName;
    }

    public void setMonument(boolean monument) {
        this.monument = monument;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setNumbersOfFloors(int numbersOfFloors) {
        this.numbersOfFloors = numbersOfFloors;
    }

    public void setOpinionAboutLife(boolean opinionAboutLife) {
        this.opinionAboutLife = opinionAboutLife;
    }

    public void setNumberOfApartments(int numberOfApartments) {
        this.numberOfApartments = numberOfApartments;
    }

    public void setEnterRoom(boolean enterRoom) {
        this.enterRoom = enterRoom;
    }

    public void setCountPrRoom(int countPrRoom) {
        this.countPrRoom = countPrRoom;
    }

    public void setGreenCorner(boolean greenCorner) {
        this.greenCorner = greenCorner;
    }

    public void setNumberOfStores(int numberOfStores) {
        this.numberOfStores = numberOfStores;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getYear() {
        return year;
    }

    public String getArhName() {
        return arhName;
    }

    public boolean isMonument() {
        return monument;
    }

    public String getCity() {
        return city;
    }

    public int getNumbersOfFloors() {
        return numbersOfFloors;
    }

    public boolean isOpinionAboutLife() {
        return opinionAboutLife;
    }

    public int getNumberOfApartments() {
        return numberOfApartments;
    }

    public boolean isEnterRoom() {
        return enterRoom;
    }

    public int getCountPrRoom() {
        return countPrRoom;
    }

    public boolean isGreenCorner() {
        return greenCorner;
    }

    public int getNumberOfStores() {
        return numberOfStores;
    }
}
