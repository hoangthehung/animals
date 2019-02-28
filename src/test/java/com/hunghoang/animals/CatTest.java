package com.hunghoang.animals;

import com.hunghoang.animals.models.animal.Cat;
import com.hunghoang.animals.models.animal.Dog;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CatTest extends AbstractTest {

    @Test
    void makeSound() {
        Cat cat = new Cat();
        cat.sing();
        System.out.flush();
        String expected = "Meow" + System.getProperty("line.separator");
        Assertions.assertEquals(expected, output.toString());
    }

}
