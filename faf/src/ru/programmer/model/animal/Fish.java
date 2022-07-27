package ru.programmer.model.animal;

import ru.programmer.model.animal.Animal;

public final class Fish extends Animal {

    //чтобы запретить наследование от какого-нибудь класса, нужно его пометить словом final

    private String squama;
    private boolean upStreamSwim;

    {
        setSwim(true);
        setType("Рыба");
        setName("Сельдь");
    }

    @Override
    public void display() {
        System.out.print("I am " + this.getClass().getSimpleName() + ". ");
        super.display();
    }

    public Fish(String type, String name, int age, double weight, boolean isFly, boolean isWalk, boolean isSwim) {
        super(type, name, age, weight, isFly, isWalk, isSwim);
    }

    public void setSquama(String squama) {
        this.squama = squama;
    }

    public void setUpStreamSwim(boolean upStreamSwim) {
        this.upStreamSwim = upStreamSwim;
    }

    public String getSquama() {
        return squama;
    }

    public boolean isUpStreamSwim() {
        return upStreamSwim;
    }

    public void bul_bul() {
        System.out.println("Буль-буль");
    }

}
