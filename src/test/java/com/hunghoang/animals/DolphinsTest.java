package com.hunghoang.animals;

import com.hunghoang.animals.models.fish.Dolphins;
import com.hunghoang.animals.models.fish.Fish;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DolphinsTest extends AbstractTest {
    Dolphins dolphins;
    @BeforeEach
    public void init(){
        dolphins = new Dolphins();
    }
    @Test
    void walk() {
        dolphins.walk();
        System.out.flush();
        String expected = "I can not walk" + System.getProperty("line.separator");
        Assertions.assertEquals(expected, output.toString());
    }
    @Test
    void sing() {
        dolphins.sing();
        System.out.flush();
        String expected = "I can not sing" + System.getProperty("line.separator");
        Assertions.assertEquals(expected, output.toString());
    }
    @Test
    void swim() {
        dolphins.swim();
        System.out.flush();
        String expected = "good swimmers" + System.getProperty("line.separator");
        Assertions.assertEquals(expected, output.toString());
    }
}
