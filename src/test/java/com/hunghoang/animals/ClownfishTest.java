package com.hunghoang.animals;

import com.hunghoang.animals.models.fish.Clownfish;
import com.hunghoang.animals.models.fish.Shark;
import com.hunghoang.animals.util.Color;
import com.hunghoang.animals.util.Shape;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ClownfishTest extends AbstractTest {
    Clownfish clownfish;
    @BeforeEach
    public void init(){
        clownfish = new Clownfish();
    }

    @Test
    void shape() {
        Shape expected = Shape.SMALL;
        Assertions.assertEquals(expected, clownfish.getShape());
    }

    @Test
    void color() {
        Color expected = Color.ORANGE;
        Assertions.assertEquals(expected, clownfish.getColor());
    }
    @Test
    void makeJokes(){
        clownfish.make();
        String expected = "I make jokes" + System.getProperty("line.separator");
        Assertions.assertEquals(expected, output.toString());
    }

}
