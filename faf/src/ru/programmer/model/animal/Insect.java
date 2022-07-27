package ru.programmer.model.animal;

import ru.programmer.model.animal.Animal;

public class Insect extends Animal {
    private int wingCount;
    private boolean likeJesus;

    {
        setWalk(true);
        setType("Жук");
        setName("Жук Жукыч");
    }

    @Override
    public void display() {
        System.out.print("I am " + this.getClass().getSimpleName() + ". ");
        super.display();
    }

    public Insect(String type, String name, int age, double weight, boolean isFly, boolean isWalk, boolean isSwim) {
        super(type, name, age, weight, isFly, isWalk, isSwim);
    }

    public void setWingCount(int wingCount) {
        this.wingCount = wingCount;
    }

    public void setLikeJesus(boolean likeJesus) {
        this.likeJesus = likeJesus;
    }

    public int getWingCount() {
        return wingCount;
    }

    public boolean isLikeJesus() {
        return likeJesus;
    }

    public void ggggg() {
        System.out.println("Ggggg");
    }

}
