package ru.programmer.model.cinema.hall;

public final class Free extends Halls{
    public Free(boolean bigHall, boolean cleanOrDirty, boolean opinion, int workingTime) {
        super(bigHall, cleanOrDirty, opinion, workingTime);
    }

    @Override
    public String opinionPerson() {
        return "Ваше мнение о нахождение в маленьком зале, всё ли вас устроило: "+(isOpinion()?"Всё было хорошо!!!":"Мне не понравилось(");
    }

    @Override
    public void displayHall(){
        System.out.println("Эта информация взята из "+this.getClass().getSimpleName());
        super.displayHall();
    }
}
