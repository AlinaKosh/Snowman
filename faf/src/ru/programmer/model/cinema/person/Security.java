package ru.programmer.model.cinema.person;

public final class Security extends Employees implements Display{

    public static int countPerson2=0;

    {
        countPerson2+=1;
    }

    public Security(String name1, String name2, String name3, int time1, int time2, int time3, boolean likeIt1, boolean likeIt2, boolean likeIt3) {
        super(name1, name2, name3, time1, time2, time3, likeIt1, likeIt2, likeIt3);
    }

    @Override
    public void displayForPerson() {
        System.out.println("Эта информация взята из "+this.getClass().getSimpleName());
        System.out.println("Имя сотрудника: "+getName1()+", Общее кол-во времени работы в день: "+getTime1()+" часов" +", Нравится работать здесь охранником: "+(isLikeIt1()?"Мне нравится тут":"Ничего не нравится")+"\n"+
                "Имя сотрудника: "+getName2()+", Общее кол-во времени работы в день: "+getTime2()+ " часов" +", Нравится работать здесь охранником: "+(isLikeIt2()?"Мне нравится тут":"Ничего не нравится")+"\n"+
                "Имя сотрудника: "+getName3()+", Общее кол-во времени работы в день: "+getTime3()+" часов" +", Нравится работать здесь охранником: "+(isLikeIt3()?"Мне нравится тут":"Ничего не нравится"));
    }
}
