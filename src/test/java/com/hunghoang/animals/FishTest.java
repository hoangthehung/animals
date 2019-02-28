package com.hunghoang.animals;

import com.hunghoang.animals.models.bird.Bird;
import com.hunghoang.animals.models.fish.Fish;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FishTest extends AbstractTest {
    Fish fish;
    @BeforeEach
    public void init(){
        fish = new Fish();
    }
    @Test
    void walk() {
        fish.walk();
        System.out.flush();
        String expected = "I can not walk" + System.getProperty("line.separator");
        Assertions.assertEquals(expected, output.toString());
    }
    @Test
    void sing() {
        fish.sing();
        System.out.flush();
        String expected = "I can not sing" + System.getProperty("line.separator");
        Assertions.assertEquals(expected, output.toString());
    }
    @Test
    void swim() {
        fish.swim();
        System.out.flush();
        String expected = "I am swimming" + System.getProperty("line.separator");
        Assertions.assertEquals(expected, output.toString());
    }
}
