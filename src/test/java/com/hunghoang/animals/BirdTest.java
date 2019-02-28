package com.hunghoang.animals;

import com.hunghoang.animals.models.bird.Bird;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BirdTest extends AbstractTest {

    @Test
    void fly() {
        Bird bird = new Bird();
        bird.fly();
        System.out.flush();
        String expected = "I am flying" + System.getProperty("line.separator");
        Assertions.assertEquals(expected, output.toString());
    }
    @Test
    void sing() {
        Bird bird = new Bird();
        bird.sing();
        System.out.flush();
        String expected = "I am singing" + System.getProperty("line.separator");
        Assertions.assertEquals(expected, output.toString());
    }
}
