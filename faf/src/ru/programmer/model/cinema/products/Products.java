package ru.programmer.model.cinema.products;

public class Products {

    private String eat1;
    private boolean likeIt;
    private int cookingTime;
    private boolean bigPortion;

    public void displayEating(){
        System.out.println("Какую еду вы выбрали: "+getEat1()+", Как быстро она готовилась: "+getCookingTime()+ " минут" +
                ", Большая порция: "+(isBigPortion()?"Да, большая порция":"Нет, не большая порция")+
                ", Вам понравилось: "+(isLikeIt()?"Очень вкусно, ещё возьму!":"Не очен, больше не буду брать..."));
    }

    public Products(String eat1, boolean likeIt, int cookingTime, boolean bigPortion) {
        this.eat1 = eat1;
        this.likeIt = likeIt;
        this.cookingTime = cookingTime;
        this.bigPortion = bigPortion;
    }

    public String getEat1() {
        return eat1;
    }

    public boolean isLikeIt() {
        return likeIt;
    }

    public int getCookingTime() {
        return cookingTime;
    }

    public boolean isBigPortion() {
        return bigPortion;
    }
}
