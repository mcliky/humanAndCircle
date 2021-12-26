package com.company;

import coordinates.Circle;
import coordinates.PointList;
import human.Human;

import java.awt.*;
import java.util.Scanner;

public class Main {
    public static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        task1();
        menu();
    }

    private static void menu() {
        PointList pointList=new PointList();
        System.out.println("| введите координаты точки");
        System.out.print("|x: ");
        double x = sc.nextInt();
        System.out.print("|y: ");
        double y = sc.nextInt();
        pointList.add(x,y);
        pointList.size();
        options(pointList);
        System.out.println("Введите координаты центра и радиуса окружности: ");
        System.out.print("center x: ");
        double centerX=sc.nextDouble();
        System.out.print("center y: ");
        double centerY=sc.nextDouble();
        System.out.print("radius: ");
        double radius=sc.nextDouble();
        Circle circle=new Circle(centerX,centerY,radius);
        circle.checkPoints(pointList);
    }

    private static void options(PointList pointList){

        System.out.println("| Желаете добавить еще (1-да 2-нет)");
        int option = sc.nextInt();
        switch (option) {
            case 1:
                System.out.println("Ваш выбор: " + option);
                System.out.println("| введите координаты точки");
                System.out.print("|x: ");
                double x = sc.nextInt();
                System.out.print("|y: ");
                double y = sc.nextInt();
                pointList.add(x,y);
                System.out.println(pointList.size());
                options(pointList);
                break;
            case 2:
                System.out.println("Ваш выбор: " + option);
                break;
            default:
                System.out.println("Вы ввели неверную цифру");
                options(pointList);
                break;
        }


    }




    //Задача 1 (разминка)
//
//Написать класс Human, который содержит фамилию, имя и отчество человека
//
//Реализовать 2 конструктора, первый принимает фамилию и имя, второй все 3 параметра
//реализовать метод getFullName, который возвращает полное имя (Пупкин Иван Василиевич), учесть что отчества может не быть (Пупкин Иван)
//реализовать метод getShortName который возвращает фамилию и инициалы (Пупкин И. В. или Пупкин И., если отчества нет)
    private static void task1() {
        Human human = new Human("Пупкин", "Иван", "Василиевич");
        System.out.println(human.getShortName());
        System.out.println(human.getFullName());
        Human anotherHuman = new Human("Джеймс", "Бонд");
        System.out.println(anotherHuman.getShortName());
        System.out.println(anotherHuman.getFullName());
    }


}
