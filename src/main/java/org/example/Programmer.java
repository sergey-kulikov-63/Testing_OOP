package org.example;

public class Programmer extends Person implements Eating {
    private String name;
    private int age;

    public Programmer (String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public void setName(String name) {
        if (this.name.isEmpty()) {
            this.name = name;
        }
    }
    @Override
    public int getAge() {
        return age;
    }
    @Override
    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public void eating() {
        System.out.println("Programmer " + getName() + " is eating...");
    }
}
