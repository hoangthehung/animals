package com.hunghoang.animals;

import com.hunghoang.animals.models.animal.Dog;
import com.hunghoang.animals.models.bird.Rooster;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DogTest extends AbstractTest {

    @Test
    void makeSound() {
        Dog dog = new Dog();
        dog.sing();
        System.out.flush();
        String expected = "Woof, woof" + System.getProperty("line.separator");
        Assertions.assertEquals(expected, output.toString());
    }

}
