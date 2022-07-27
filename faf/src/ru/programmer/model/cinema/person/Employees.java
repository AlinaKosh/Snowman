package ru.programmer.model.cinema.person;

public class Employees {

    //Имена сотрудников
    private String name1;
    private String name2;
    private String name3;
    private String name4;
    private String name5;

    //Время работы
    private int time1;
    private int time2;
    private int time3;
    private int time4;
    private int time5;

    //Нравится или не нравится работать

    private boolean likeIt1;
    private boolean likeIt2;
    private boolean likeIt3;
    private boolean likeIt4;
    private boolean likeIt5;

    public Employees(String name1, String name2, String name3, String name4, String name5,
                     int time1, int time2, int time3, int time4, int time5, boolean likeIt1,
                     boolean likeIt2, boolean likeIt3, boolean likeIt4, boolean likeIt5) {
        this.name1 = name1;
        this.name2 = name2;
        this.name3 = name3;
        this.name4 = name4;
        this.name5 = name5;
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

    public Employees(String name1, String name2, int time1, int time2, boolean likeIt1, boolean likeIt2) {
        this.name1 = name1;
        this.name2 = name2;
        this.time1 = time1;
        this.time2 = time2;
        this.likeIt1 = likeIt1;
        this.likeIt2 = likeIt2;
    }

    public Employees(String name1, String name2, String name3, int time1,
                     int time2, int time3, boolean likeIt1, boolean likeIt2, boolean likeIt3) {
        this.name1 = name1;
        this.name2 = name2;
        this.name3 = name3;
        this.time1 = time1;
        this.time2 = time2;
        this.time3 = time3;
        this.likeIt1 = likeIt1;
        this.likeIt2 = likeIt2;
        this.likeIt3 = likeIt3;
    }

    public String getName1() {
        return name1;
    }

    public String getName2() {
        return name2;
    }

    public String getName3() {
        return name3;
    }

    public String getName4() {
        return name4;
    }

    public String getName5() {
        return name5;
    }

    public int getTime1() {
        return time1;
    }

    public int getTime2() {
        return time2;
    }

    public int getTime3() {
        return time3;
    }

    public int getTime4() {
        return time4;
    }

    public int getTime5() {
        return time5;
    }

    public boolean isLikeIt1() {
        return likeIt1;
    }

    public boolean isLikeIt2() {
        return likeIt2;
    }

    public boolean isLikeIt3() {
        return likeIt3;
    }

    public boolean isLikeIt4() {
        return likeIt4;
    }

    public boolean isLikeIt5() {
        return likeIt5;
    }
}
