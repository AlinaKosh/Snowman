package ru.programmer.model.writers;

import ru.programmer.model.writers.WritingMaterials;

public class Pen extends WritingMaterials {

    private int countColor;
    private boolean auto;

    {
        setCountColor(1);
        setName("РУЧКА)");
        setColor("Серобурмалиновый");
    }

    public void setCountColor(int countColor) {
        this.countColor = countColor;
    }

    public void setAuto(boolean auto) {
        this.auto = auto;
    }

    public int getCountColor() {
        return countColor;
    }

    public boolean isAuto() {
        return auto;
    }
    public void writeMyName(){
        System.out.println("My name is Alina");
    }
    public void display(){
        System.out.println("This is "+this.getClass().getSimpleName()+", Название: "+getName()+", Цвет: "+
                getColor()+", Длина: "+getLength()+", Цена: "+getPrice()+", Умеет рисовать: "+
                (isDraw()?("Да"):("Нет"))+", Количество цветов: "+getCountColor()+", Автоматическая: "+
                (isAuto()?"Да":"Нет"));
    }
}
