package ru.programmer.model.animal;

import ru.programmer.model.animal.Animal;

public class Bird extends Animal {

    private String area;
    private boolean winterFly;

    {
        setFly(true);
        setType("Птица");
        setName("Bob");
    }


    @Override
    public void display() {
        System.out.print("I am " + this.getClass().getSimpleName() + ". ");
        super.display();
    }


    public Bird(String type, String name, int age, double weight, boolean isFly, boolean isWalk, boolean isSwim) {
        super(type, name, age, weight, isFly, isWalk, isSwim);
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getArea() {
        return area;
    }

    public void setWinterFly(boolean winterFly) {
        this.winterFly = winterFly;
    }

    public String isWinterFly() {
        return (winterFly ? "Да" : "Нет");
    }

    public void chirick_chirick() {
        System.out.println("Чирик-Чирик");
    }

}
