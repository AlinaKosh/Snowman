package ru.programmer.model.cinema.movie;

public final class Fiction extends Movie implements Stars {

    private boolean blewYourMind;
    private double scoreOnAllFilms;

    public Fiction(String movie1, String movie2, String movie3, String movie4, String movie5, int time1, int time2, int time3, int time4, int time5, boolean likeIt1, boolean likeIt2, boolean likeIt3, boolean likeIt4, boolean likeIt5) {
        super(movie1, movie2, movie3, movie4, movie5, time1, time2, time3, time4, time5, likeIt1, likeIt2, likeIt3, likeIt4, likeIt5);
    }

    @Override
    public void display(){
        System.out.println("Это было взято из класса: "+this.getClass().getSimpleName()+"!");
        super.display();
    }

    public void score(){
        System.out.println("Ваш рейтинг по всем фильмам: "+getScoreOnAllFilms());
    }

    public void bumMind(){
        System.out.println("Взорвали ли фильмы ваш разум: "+(isBlewYourMind()?"Да":"Нет"));
    }

    @Override
    public void celebrities() {
        System.out.println("Были ли звёзды в кинотеатре: "+(isCelebrities()?"Да":"Нет")+"\n"+
                "Сколько их было: "+getCountCelebrities());
    }

    public void setBlewYourMind(boolean blewYourMind) {
        this.blewYourMind = blewYourMind;
    }

    public void setScoreOnAllFilms(double scoreOnAllFilms) {
        this.scoreOnAllFilms = scoreOnAllFilms;
    }

    public boolean isBlewYourMind() {
        return blewYourMind;
    }

    public double getScoreOnAllFilms() {
        return scoreOnAllFilms;
    }
}
