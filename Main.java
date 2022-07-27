package ru.programmer.model;

import ru.programmer.model.cinema.hall.Busy;
import ru.programmer.model.cinema.hall.Free;
import ru.programmer.model.cinema.movie.Fantasy;
import ru.programmer.model.cinema.movie.Fiction;
import ru.programmer.model.cinema.movie.Horror;
import ru.programmer.model.cinema.person.Janitors;
import ru.programmer.model.cinema.person.Security;
import ru.programmer.model.cinema.person.Sellers;
import ru.programmer.model.cinema.products.Candy;
import ru.programmer.model.cinema.products.Popcorn;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main extends JComponent{

    public static void main(String[] args) {

        JFrame jFrame = new JFrame();
        jFrame.setVisible(true);
        jFrame.setBackground(Color.BLUE);
        jFrame.setSize(750,750);
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
        jFrame.setLocation(500,290);
        jFrame.getContentPane().add(new Main());


    }

    public void paint(Graphics graphics){
        graphics.setColor(Color.BLUE);
        graphics.fillOval(230,450,260,210);
        graphics.fillOval(270,360,190,140);
        graphics.fillOval(300,280,130,100);
        graphics.setColor(Color.ORANGE);
        graphics.fillOval(350,400,15,15);
        graphics.fillOval(350,420,15,15);
        graphics.fillOval(350,440,15,15);
        graphics.setColor(Color.YELLOW);
        graphics.fillOval(330,310,20,30);
        graphics.fillOval(380,310,20,30);
        graphics.setColor(Color.BLACK);
        graphics.fillOval(333,315,10,10);
        graphics.fillOval(389,325,10,10);
        graphics.setColor(Color.RED);
        graphics.fillArc(346,335,40,30,0,-180);
        graphics.setColor(Color.ORANGE);
        graphics.fillArc(324,320,50,40,0,40);
        graphics.setColor(Color.DARK_GRAY);
        graphics.fillOval(295,260,150,35);
        graphics.fillRoundRect(320,155,100,120,20,15);
        graphics.setColor(Color.PINK);
        graphics.fillRoundRect(320,230,100,40,20,15);
        graphics.setColor(Color.BLACK);
        graphics.drawLine(280,420,170,280);
        graphics.drawLine(190,250,170,280);
        graphics.drawLine(200,270,170,280);
        graphics.drawLine(147,270,170,280);
        graphics.drawLine(450,420,570,280);
        graphics.drawLine(540,250,570,280);
        graphics.drawLine(560,250,570,280);
        graphics.drawLine(600,260,570,280);
    }
}
