package ru.programmer.model.writers;

public class Divider extends WritingMaterials{

    private String dividerType;
    private boolean metal;

    {
        setDraw(true);
        setName("ЦИРКУЛЬКА");
        setColor("Коньячный");
    }

    public void setDividerType(String dividerType) {
        this.dividerType = dividerType;
    }

    public void setMetal(boolean metal) {
        this.metal = metal;
    }

    public String getDividerType() {
        return dividerType;
    }

    public boolean isMetal() {
        return metal;
    }
    public final void draw_circle(){
        System.out.println("Нарисован круг");
    }
    public void display(){
        System.out.println("This is "+this.getClass().getSimpleName()+", Название: "+getName()+", Цвет: "+
                getColor()+", Длина: "+getLength()+", Цена: "+getPrice()+", Умеет рисовать: "+
                (isDraw()?("Да"):("Нет"))+", Из метала: "+ (isMetal()?"Да":"Нет")+", Тип: "+getDividerType());
    }
}
