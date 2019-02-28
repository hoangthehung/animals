package com.hunghoang.animals;

import com.hunghoang.animals.models.fish.Fish;
import com.hunghoang.animals.models.insect.Butterfly;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ButterflyTest extends AbstractTest {

    Butterfly butterfly;

    @BeforeEach
    public void init(){
        butterfly = new Butterfly();
    }

    @Test
    void sing() {
        butterfly.sing();
        System.out.flush();
        String expected = "I can not make sound" + System.getProperty("line.separator");
        Assertions.assertEquals(expected, output.toString());
    }
    @Test
    void fly() {
        butterfly.fly();
        System.out.flush();
        String expected = "I am flying" + System.getProperty("line.separator");
        Assertions.assertEquals(expected, output.toString());
    }
}
