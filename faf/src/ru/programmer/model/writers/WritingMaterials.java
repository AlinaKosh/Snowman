package ru.programmer.model.writers;

public class WritingMaterials {

    private String name;
    private String color;
    private int price;
    private double length;
    private boolean draw;

    private static String description = WritingMaterials.class.getSimpleName();

    //для подсчёта кол-ва созданных предметов и их нумерация создания
    private static int count = 0;
    private int number = 0;

    {
        count+=1;
        number = count;
    }
    public void intCount(){
        System.out.println(WritingMaterials.count);
    }
    public void iNumber(){
        System.out.println(number);
    }

    public WritingMaterials() {
    }

    public WritingMaterials(String name, String color, int price, double length, boolean draw) {
        this.name = name;
        this.color = color;
        this.price = price;
        this.length = length;
        this.draw = draw;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setDraw(boolean draw) {
        this.draw = draw;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

    public double getLength() {
        return length;
    }

    public boolean isDraw() {
        return draw;
    }
    /*
    public void draw(){
        System.out.println(draw?(name+" провёл линий: 1. Их цвет - "+color):(name+" не может ничего нарисовать."));
    }
    public void draw(int n){
        System.out.println(draw?(name+" провёл линий: "+n+". Их цвет - "+color):(name+" не может ничего нарисовать."));
    }
    public void draw(String color){
        System.out.println(draw?(name+" провёл линий: 1. Их цвет - "+color):(name+" не может ничего нарисовать."));
    }
    public void draw(String color, int n){
        System.out.println(draw?(name+" провёл линий: "+n+". Их цвет - "+color):(name+" не может ничего нарисовать."));
    }
     */
    public void display(){
        System.out.println("Название: "+name+", Цвет: "+color+", Длина: "+length+", Цена: "+price+", Умеет рисовать: "+
                (draw?("Да"):("Нет")));
    }
    public static void staticMethod(){
        System.out.println("Static Method!!!");
    }
    public void anyStaticMethod(){
        WritingMaterials.staticMethod();
    }
    public String getDescription(){
        return description;
    }
    public String toString(){
        return name+" "+color+" "+price+" "+length+" "+((draw)?"Yes":"No");
    }
}
