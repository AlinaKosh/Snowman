package ru.programmer.model.animal;

public class Animal {

    private String type;
    private String name;
    private int age;
    private double weight;
    private boolean isFly;
    private boolean isWalk;
    private boolean isSwim;

    private static final String description = Animal.class.getSimpleName();

    public static int count;
    private int number;

    public Animal(String type, String name, int age, double weight, boolean isFly, boolean isWalk, boolean isSwim) {
        this.type = type;
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.isFly = isFly;
        this.isWalk = isWalk;
        this.isSwim = isSwim;
    }

    public Animal() {

    }


    public void display() {
        System.out.println("Тип: " + type + ", Имя: " + name + ", Возраст: " + age + ", Вес: " + Math.round(weight * 100) / 100.0 +
                ", Умеет летать: " + (isFly ? "Yes" : "No") + ", Умеет ходить: " + (isWalk ? "Yes" : "No") +
                ", Умеет плавать: " + (isSwim ? "Yes" : "No"));
    }

    {
        count += 1;
        number = count;
    }

    public String toString() {
        return type + " " + name + " " + age + " " + weight + " " + (isFly ? "Yes" : "No") + " " + (isWalk ? "Yes" : "No") + " " + (isSwim ? "Yes" : "No");
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setFly(boolean fly) {
        isFly = fly;
    }

    public void setWalk(boolean walk) {
        isWalk = walk;
    }

    public void setSwim(boolean swim) {
        isSwim = swim;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public boolean isFly() {
        return isFly;
    }

    public boolean isWalk() {
        return isWalk;
    }

    public boolean isSwim() {
        return isSwim;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public final void rename(String Name) {
        this.name = Name;
        System.out.print("Новое имя: " + Name);
    }
    public static String getDescription() {
        return description;
    }
}
