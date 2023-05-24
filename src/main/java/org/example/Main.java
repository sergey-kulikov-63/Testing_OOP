package org.example;

public class Main{
    public static void main(String[] args) {
        Person programmer = new Programmer("",23); // новый объект класса Programmer типа Person с пустым именем
        Person painter = new Painter("",43); // новый объект класса Painter типа Person с пустым именем
        programmer.setName("Irina"); // ставим имя Irina объекту programmer, которое более нельзя изменить
        painter.setName("Anna"); // ставим имя Irina объекту programmer, которое более нельзя изменить
        programmer.eating(); // вызываем унаследованный, абстрактный и переопределённый
        //под Programmer метод абстрактного класса Person (данный метод также является методом интерфейса Eating)
        painter.eating(); // вызываем унаследованный, абстрактный и переопределённый
        //под Painter метод абстрактного класса Person (данный метод также является методом интерфейса Eating)
    }
}