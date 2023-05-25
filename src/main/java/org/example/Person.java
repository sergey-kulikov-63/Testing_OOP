package org.example;

public abstract class Person implements Eating {
    private String name;
    private int age;

    public abstract String getName();

    public abstract void setName(String name);

    public abstract int getAge();

    public abstract void setAge(int age);

    public abstract void eating();
    public Person() {
    }
}
