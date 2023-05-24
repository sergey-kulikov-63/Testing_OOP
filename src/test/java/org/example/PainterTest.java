package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PainterTest {

    @Test
    void getNameTest() {
        Person painter = new Painter("David",22);
        assertEquals("David",painter.getName());
    }

    @Test
    void setNameTestExit() {
        Person painter = new Painter("David",22);
        painter.setName("Albert");
        assertEquals("David",painter.getName());
    }
    @Test
    void setNameTestVoid() {
        Person painter = new Painter("",28);
        painter.setName("Elena");
        assertEquals("Elena",painter.getName());
    }

    @Test
    void getAgeTest() {
        Person painter = new Painter("David",22);
        assertEquals(22,painter.getAge());
    }

    @Test
    void setAgeTest() {
        Person painter = new Painter("David",22);
        painter.setAge(21);
        assertEquals(21,painter.getAge());
    }

    @Test
    void eatingTest() {
        Person painter = new Painter("David",22);
        assertEquals("Painter David is eating...", "Painter " + painter.getName() + " is eating...");
    }
}