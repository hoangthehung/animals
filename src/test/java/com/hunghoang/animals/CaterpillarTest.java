package com.hunghoang.animals;

import com.hunghoang.animals.models.insect.Butterfly;
import com.hunghoang.animals.models.insect.Caterpillar;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CaterpillarTest extends AbstractTest {

    Caterpillar caterpillar;

    @BeforeEach
    public void init(){
        caterpillar = new Caterpillar();
    }

    @Test
    void walk() {
        caterpillar.walk();
        System.out.flush();
        String expected = "I am crawling" + System.getProperty("line.separator");
        Assertions.assertEquals(expected, output.toString());
    }
    @Test
    void fly() {
        caterpillar.fly();
        System.out.flush();
        String expected = "I can not fly" + System.getProperty("line.separator");
        Assertions.assertEquals(expected, output.toString());
    }
    @Test
    void transform() {
        caterpillar.transform();
        caterpillar.fly();
        System.out.flush();
        String expected = "I am flying" + System.getProperty("line.separator");
        Assertions.assertEquals(expected, output.toString());
        initOutput();
        caterpillar.sing();
        System.out.flush();
        expected = "I can not make sound" + System.getProperty("line.separator");
        Assertions.assertEquals(expected, output.toString());
    }
}
