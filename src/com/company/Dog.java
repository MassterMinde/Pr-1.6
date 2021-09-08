package com.company;
public class Dog {
    String name="Шарик";
    int age=3;
    public Dog(String n,int a) {name = n; age = a;}{
        this.name=name;
        this.age=age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getHuman(){
        return age*7;
    }
}
//        Разработайте и реализуйте класс Dog (Собака), поля класса описывают кличку и возраст собаки. Необходимо выполнить следующие действия:
//        определить конструктор собаки, чтобы принять и инициализировать данные экземпляра., включить стандартные методы (геттеры/сеттеры)
//        для получения и установки для имени и возраста, включить метод для перевода возраста собаки в "человеческий " возраст (возраст семь раз собаки),
//        включите метод ToString,который возвращает описание экземпляра собаки в виде строки.
//        Создайте массив собак с несколькими элементами. Продемонстрировать работу класса.