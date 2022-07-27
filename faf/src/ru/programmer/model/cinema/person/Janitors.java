package ru.programmer.model.cinema.person;

public final class Janitors extends Employees implements Display{

    public static int countPerson3;

    {
        countPerson3+=1;
    }

    public Janitors(String name1, String name2, int time1, int time2, boolean likeIt1, boolean likeIt2) {
        super(name1, name2, time1, time2, likeIt1, likeIt2);
    }

    @Override
    public void displayForPerson() {
        System.out.println("Эта информация взята из "+this.getClass().getSimpleName());
        System.out.println("Имя сотрудника: "+getName1()+", Общее кол-во времени работы в день: "+getTime1()+" часов" +", Нравится работать здесь уборщиком: "+(isLikeIt1()?"Мне нравится тут":"Ничего не нравится")+"\n"+
                "Имя сотрудника: "+getName2()+", Общее кол-во времени работы в день: "+getTime2()+ " часов" +", Нравится работать здесь уборщиком: "+(isLikeIt2()?"Мне нравится тут":"Ничего не нравится"));
    }
}
