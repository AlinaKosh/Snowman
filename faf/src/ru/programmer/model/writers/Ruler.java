package ru.programmer.model.writers;

import ru.programmer.model.writers.WritingMaterials;

public final class Ruler extends WritingMaterials {

    private double length;
    private boolean wood;

    {
        setDraw(false);
        setName("РУЛЬКА");
        setColor("Фукси");
    }

    @Override
    public void setLength(double length) {
        this.length = length;
    }

    public void setWood(boolean wood) {
        this.wood = wood;
    }

    @Override
    public double getLength() {
        return length;
    }

    public boolean isWood() {
        return wood;
    }
    public void measure(){
        System.out.println("Сейчас померим длину");
    }
    public void display(){
        System.out.println("This is "+this.getClass().getSimpleName()+", Название: "+getName()+", Цвет: "+
                getColor()+", Длина: "+getLength()+", Цена: "+getPrice()+", Умеет рисовать: "+
                (isDraw()?("Да"):("Нет"))+", Из дерева: "+ (isWood()?"Да":"Нет"));
    }
}
