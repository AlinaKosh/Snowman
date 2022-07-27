package ru.programmer.model.cinema.hall;

public final class Busy extends Halls{

    public Busy(boolean bigHall, boolean cleanOrDirty, boolean opinion, int workingTime) {
        super(bigHall, cleanOrDirty, opinion, workingTime);
    }

    @Override
    public String opinionPerson() {
        return "Ваше мнение о нахождение в большом зале, всё ли вас устроило: "+(isOpinion()?"Всё было хорошо!!!":"Мне не понравилось(");
    }

    @Override
    public void displayHall(){
        System.out.println("Эта информация взята из "+this.getClass().getSimpleName());
        super.displayHall();
    }
}
