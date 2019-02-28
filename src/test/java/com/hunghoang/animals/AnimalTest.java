package com.hunghoang.animals;

import com.hunghoang.animals.models.Animal;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AnimalTest extends AbstractTest {

    @Test
    void walk() {
        Animal animal = new Animal();
        animal.walk();
        System.out.flush();
        String expected = "I am walking" + System.getProperty("line.separator");
        Assertions.assertEquals(expected, output.toString());
    }
}
