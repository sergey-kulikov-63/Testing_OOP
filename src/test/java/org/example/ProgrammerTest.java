package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProgrammerTest {

    @Test
    void getNameTest() {
        Person programmer = new Programmer("Anna",28);
        assertEquals("Anna",programmer.getName());
    }

    @Test
    void setNameTestExit() {
        Person programmer = new Programmer("Anna",28);
        programmer.setName("Elena");
        assertEquals("Anna",programmer.getName());
    }
    @Test
    void setNameTestVoid() {
        Person programmer = new Programmer("",28);
        programmer.setName("Elena");
        assertEquals("Elena",programmer.getName());
    }

    @Test
    void getAgeTest() {
        Person programmer = new Programmer("Anna",28);
        assertEquals(28,programmer.getAge());
    }

    @Test
    void setAgeTest() {
        Person programmer = new Programmer("Anna",28);
        programmer.setAge(30);
        assertEquals(30,programmer.getAge());
    }

    @Test
    void eatingTest() {
        Programmer programmer = new Programmer("Anna",28);
        assertEquals("Programmer Anna is eating...","Programmer " + programmer.getName() + " is eating...");
    }
}