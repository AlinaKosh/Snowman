package ru.programmer.model.cinema.products;

public final class Popcorn extends Products{

    private boolean grilledPortion;

    public Popcorn(String eat1, boolean likeIt, int cookingTime, boolean bigPortion) {
        super(eat1, likeIt, cookingTime, bigPortion);
    }

    @Override
    public void displayEating(){
        System.out.println("Эта информация взята из "+this.getClass().getSimpleName());
        super.displayEating();
    }

    public void popcornPortion(){
        System.out.println("Зажаренная порция попкорна: "+(isGrilledPortion()?"Да, это так вкусно":"Нет и это печально"));
    }

    public void setGrilledPortion(boolean grilledPortion) {
        this.grilledPortion = grilledPortion;
    }

    public boolean isGrilledPortion() {
        return grilledPortion;
    }
}
