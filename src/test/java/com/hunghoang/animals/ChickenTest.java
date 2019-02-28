package com.hunghoang.animals;

import com.hunghoang.animals.models.bird.Chicken;
import com.hunghoang.animals.models.bird.Duck;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ChickenTest extends AbstractTest {

    @Test
    void makeSound() {
        Chicken chicken = new Chicken();
        chicken.sing();
        System.out.flush();
        String expected = "Cluck, cluck" + System.getProperty("line.separator");
        Assertions.assertEquals(expected, output.toString());
    }
    @Test
    void fly() {
        Chicken chicken = new Chicken();
        chicken.fly();
        System.out.flush();
        String expected = "I can not fly" + System.getProperty("line.separator");
        Assertions.assertEquals(expected, output.toString());
    }
}
