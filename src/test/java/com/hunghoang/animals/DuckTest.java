package com.hunghoang.animals;

import com.hunghoang.animals.models.Bird;
import com.hunghoang.animals.models.bird.Duck;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DuckTest extends AbstractTest {

    @Test
    void makeSound() {
        Duck duck = new Duck();
        duck.sing();
        System.out.flush();
        String expected = "Quack, quack" + System.getProperty("line.separator");
        Assertions.assertEquals(expected, output.toString());
    }
    @Test
    void swim() {
        Duck duck = new Duck();
        duck.swim();
        System.out.flush();
        String expected = "I am swimming" + System.getProperty("line.separator");
        Assertions.assertEquals(expected, output.toString());
    }
}
