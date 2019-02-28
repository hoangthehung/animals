package com.hunghoang.animals;

import com.hunghoang.animals.models.fish.Fish;
import com.hunghoang.animals.models.fish.Shark;
import com.hunghoang.animals.util.Color;
import com.hunghoang.animals.util.Shape;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SharkTest extends AbstractTest {
    Shark shark;
    @BeforeEach
    public void init(){
        shark = new Shark();
    }

    @Test
    void shape() {
        Shape expected = Shape.LARGE;
        Assertions.assertEquals(expected, shark.getShape());
    }

    @Test
    void color() {
        Color expected = Color.GREY;
        Assertions.assertEquals(expected, shark.getColor());
    }
    @Test
    void eat(){
        shark.eat(new Fish());
        String expected = "I am eating a fish" + System.getProperty("line.separator");
        Assertions.assertEquals(expected, output.toString());
    }
}
