package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Scanner intScan=new Scanner(System.in);
        System.out.print("Введите количество собак: ");
        int number = intScan.nextInt();
        Dog[] dogs = new Dog[number];
        for (int i = 0; i < number ; i++) {
            System.out.print("\nВведите имя "+(i+1)+"-й собаки: ");
            String name = scan.nextLine();
            System.out.print("\nВведите возраст "+(i+1)+"-й собаки: ");
            int age = intScan.nextInt();
            dogs[i]=new Dog (name,age);
        }
        for (int i = 0; i < number ; i++) {
            System.out.print("Имя "+(i+1)+ "-й собаки: ");
            System.out.println(dogs[i].getName());
            System.out.print("Возраст "+(i+1)+"-й собаки: ");
            System.out.println(dogs[i].getAge());
            System.out.print("Человеческий возраст "+(i+1)+"-й собаки: ");
            System.out.println(dogs[i].getHuman());
        }
    }
}
//        Разработайте и реализуйте класс Dog (Собака), поля класса описывают кличку и возраст собаки. Необходимо выполнить следующие действия:
//        определить конструктор собаки, чтобы принять и инициализировать данные экземпляра., включить стандартные методы (геттеры/сеттеры)
//        для получения и установки для имени и возраста, включить метод для перевода возраста собаки в "человеческий " возраст (возраст семь раз собаки),
//        включите метод ToString,
//        который возвращает описание экземпляра собаки в виде строки. Создайте массив собак с несколькими элементами. Продемонстрировать работу класса.