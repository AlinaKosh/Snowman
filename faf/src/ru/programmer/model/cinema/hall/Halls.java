package ru.programmer.model.cinema.hall;

public abstract class Halls {

    private boolean bigHall;
    private boolean cleanOrDirty;
    private boolean opinion;
    private int workingTime;

    public Halls(boolean bigHall, boolean cleanOrDirty, boolean opinion, int workingTime) {
        this.bigHall = bigHall;
        this.cleanOrDirty = cleanOrDirty;
        this.opinion = opinion;
        this.workingTime = workingTime;
    }
    public abstract String opinionPerson();
    public void displayHall(){
        System.out.println("Вы находились в большом зале: "+(isBigHall()?"Да, в большом":"Нет, в маленьком")+"\n"+
                "Вам понравилась чистота в зале: "+(isCleanOrDirty()?"Да, было достаточно чисто":"Нет, было очень грязно")+"\n"+
                "Сколько времени был свободен зал: "+getWorkingTime()+" минут");
    }

    public boolean isBigHall() {
        return bigHall;
    }

    public boolean isCleanOrDirty() {
        return cleanOrDirty;
    }

    public boolean isOpinion() {
        return opinion;
    }

    public int getWorkingTime() {
        return workingTime;
    }
}
