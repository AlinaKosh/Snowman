package ru.programmer.model.cinema.person;

public final class Sellers extends Employees implements Display{

    public static int countPerson1=0;

    {
        countPerson1+=1;
    }

    public Sellers(String name1, String name2, String name3, String name4, String name5, int time1, int time2, int time3, int time4, int time5, boolean likeIt1, boolean likeIt2, boolean likeIt3, boolean likeIt4, boolean likeIt5) {
        super(name1, name2, name3, name4, name5, time1, time2, time3, time4, time5, likeIt1, likeIt2, likeIt3, likeIt4, likeIt5);
    }

    @Override
    public void displayForPerson() {
        System.out.println("Эта информация взята из "+this.getClass().getSimpleName());
        System.out.println("Имя сотрудника: "+getName1()+", Общее кол-во времени работы в день: "+getTime1()+" часов" +", Нравится работать здесь продавцом билетов: "+(isLikeIt1()?"Мне нравится тут":"Ничего не нравится")+"\n"+
                "Имя сотрудника: "+getName2()+", Общее кол-во времени работы в день: "+getTime2()+ " часов" +", Нравится работать здесь продавцом билетов: "+(isLikeIt2()?"Мне нравится тут":"Ничего не нравится")+"\n"+
                "Имя сотрудника: "+getName3()+", Общее кол-во времени работы в день: "+getTime3()+" часов" +", Нравится работать здесь продавцом билетов: "+(isLikeIt3()?"Мне нравится тут":"Ничего не нравится")+"\n"+
                "Имя сотрудника: "+getName4()+", Общее кол-во времени работы в день: "+getTime4()+" часов" +", Нравится работать здесь продавцом билетов: "+(isLikeIt4()?"Мне нравится тут":"Ничего не нравится")+"\n"+
                "Имя сотрудника: "+getName5()+", Общее кол-во времени работы в день: "+getTime5()+" часов" +", Нравится работать здесь продавцом билетов: "+(isLikeIt5()?"Мне нравится тут":"Ничего не нравится"));
    }
}
