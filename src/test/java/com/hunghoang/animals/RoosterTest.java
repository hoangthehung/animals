package com.hunghoang.animals;

import com.hunghoang.animals.models.bird.Chicken;
import com.hunghoang.animals.models.bird.Rooster;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RoosterTest extends AbstractTest {

    @Test
    void makeSound() {
        Rooster rooster = new Rooster();
        rooster.sing();
        System.out.flush();
        String expected = "Cock-a-doodle-doo" + System.getProperty("line.separator");
        Assertions.assertEquals(expected, output.toString());
    }
    @Test
    void fly() {
        Rooster rooster = new Rooster();
        rooster.fly();
        System.out.flush();
        String expected = "I can not fly" + System.getProperty("line.separator");
        Assertions.assertEquals(expected, output.toString());
    }
}
