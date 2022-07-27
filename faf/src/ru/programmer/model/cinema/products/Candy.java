package ru.programmer.model.cinema.products;

public final class Candy extends Products{

    private boolean coloredAbsorbentCotton;

    public Candy(String eat1, boolean likeIt, int cookingTime, boolean bigPortion) {
        super(eat1, likeIt, cookingTime, bigPortion);
    }
    @Override
    public void displayEating(){
        System.out.println("Эта информация взята из "+this.getClass().getSimpleName());
        super.displayEating();
    }

    public void cottonCandy(){
        System.out.println("Ваша вата разноцветная: "+(isColoredAbsorbentCotton()?"Да и это круто!":"Нет, очень жаль("));
    }

    public void setColoredAbsorbentCotton(boolean coloredAbsorbentCotton) {
        this.coloredAbsorbentCotton = coloredAbsorbentCotton;
    }

    public boolean isColoredAbsorbentCotton() {
        return coloredAbsorbentCotton;
    }
}
