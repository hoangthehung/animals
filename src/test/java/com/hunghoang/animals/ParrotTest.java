package com.hunghoang.animals;

import com.hunghoang.animals.models.animal.Cat;
import com.hunghoang.animals.models.animal.Dog;
import com.hunghoang.animals.models.bird.Parrot;
import com.hunghoang.animals.models.bird.Rooster;
import com.hunghoang.animals.util.LiveContext;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ParrotTest extends AbstractTest {

    @Test
    void testLiveWithDog() {
        Parrot parrot = new Parrot();
        parrot.setLiveContext(new LiveContext(new Dog()));
        parrot.sing();
        System.out.flush();
        String expected = "Woof, woof" + System.getProperty("line.separator");
        Assertions.assertEquals(expected, output.toString());
    }
    @Test
    void testLiveWithCat() {
        Parrot parrot = new Parrot();
        parrot.setLiveContext(new LiveContext(new Cat()));
        parrot.sing();
        System.out.flush();
        String expected = "Meow" + System.getProperty("line.separator");
        Assertions.assertEquals(expected, output.toString());
    }
    @Test
    void testLiveWithRooster() {
        Parrot parrot = new Parrot();
        parrot.setLiveContext(new LiveContext(new Rooster()));
        parrot.sing();
        System.out.flush();
        String expected = "Cock-a-doodle-doo" + System.getProperty("line.separator");
        Assertions.assertEquals(expected, output.toString());
    }

}
