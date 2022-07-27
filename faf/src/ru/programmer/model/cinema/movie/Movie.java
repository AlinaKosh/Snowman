package ru.programmer.model.cinema.movie;

public class Movie {

    //Кол-во фильмов
    private String movie1;
    private String movie2;
    private String movie3;
    private String movie4;
    private String movie5;

    //Кол-во часов
    private int time1;
    private int time2;
    private int time3;
    private int time4;
    private int time5;

    //Понравилось или нет
    private boolean likeIt1;
    private boolean likeIt2;
    private boolean likeIt3;
    private boolean likeIt4;
    private boolean likeIt5;

    //Звезды на премьерах фильмов
    private boolean celebrities;
    private int countCelebrities;

    public void display(){
        System.out.println("Первый фильм: "+movie1+", По времени он шёл: "+time1+", Понравился ли он: "+(likeIt1?"Да":"Нет")+ "\n"+
                "Второй фильм: "+movie2+", По времени он шёл: "+time2+", Понравился ли он: "+(likeIt2?"Да":"Нет")+"\n"+
                "Третий фильм: "+movie3+", По времени он шёл: "+time3+", Понравился ли он: "+(likeIt3?"Да":"Нет")+"\n"+
                "Четвёртый фильм: "+movie4+", По времени он шёл: "+time4+", Понравился ли он: "+(likeIt4?"Да":"Нет")+"\n"+
                "Пятый фильм: "+movie5+", По времени он шёл: "+time5+", Понравился ли он: "+(likeIt5?"Да":"Нет")+"\n");
    }

    public Movie(String movie1, String movie2, String movie3, String movie4, String movie5, int time1, int time2, int time3, int time4, int time5, boolean likeIt1, boolean likeIt2, boolean likeIt3, boolean likeIt4, boolean likeIt5) {
        this.movie1 = movie1;
        this.movie2 = movie2;
        this.movie3 = movie3;
        this.movie4 = movie4;
        this.movie5 = movie5;
        this.time1 = time1;
        this.time2 = time2;
        this.time3 = time3;
        this.time4 = time4;
        this.time5 = time5;
        this.likeIt1 = likeIt1;
        this.likeIt2 = likeIt2;
        this.likeIt3 = likeIt3;
        this.likeIt4 = likeIt4;
        this.likeIt5 = likeIt5;
    }

    public void setCelebrities(boolean celebrities) {
        this.celebrities = celebrities;
    }

    public void setCountCelebrities(int countCelebrities) {
        this.countCelebrities = countCelebrities;
    }

    public boolean isCelebrities() {
        return celebrities;
    }

    public int getCountCelebrities() {
        return countCelebrities;
    }

}
