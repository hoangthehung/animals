package com.hunghoang.animals;

import com.hunghoang.animals.models.Kind;
import com.hunghoang.animals.models.animal.Animal;
import com.hunghoang.animals.models.animal.Cat;
import com.hunghoang.animals.models.animal.Dog;
import com.hunghoang.animals.models.animal.Frog;
import com.hunghoang.animals.models.bird.*;
import com.hunghoang.animals.models.fish.Clownfish;
import com.hunghoang.animals.models.fish.Dolphins;
import com.hunghoang.animals.models.fish.Fish;
import com.hunghoang.animals.models.fish.Shark;
import com.hunghoang.animals.models.insect.Butterfly;
import com.hunghoang.animals.util.CounterAnimal;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CounterAnimalTest extends AbstractTest {
    CounterAnimal counterAnimal;
    Kind[] animals;
    @BeforeEach
    public void init(){
        counterAnimal = new CounterAnimal();
        animals = new Kind[]{ new Bird(),
                new Duck(),
                new Chicken(),
                new Rooster(),
                new Parrot(),
                new Fish(),
                new Shark(),
                new Clownfish(),
                new Dolphins(),
                new Frog(),
                new Dog(),
                new Butterfly(),
                new Cat()
        };
    }
    @Test
    void countWalk() {

        System.out.flush();
        int expected = 8;
        Assertions.assertEquals(expected, counterAnimal.countActionWalk(animals));
    }
    @Test
    void countFly() {

        System.out.flush();
        int expected = 4;
        Assertions.assertEquals(expected, counterAnimal.countActionFly(animals));
    }
    @Test
    void countSing() {

        System.out.flush();
        int expected = 8;
        Assertions.assertEquals(expected, counterAnimal.countActionSing(animals));
    }
    @Test
    void countSwim() {

        System.out.flush();
        int expected = 6;
        Assertions.assertEquals(expected, counterAnimal.countActionSwim(animals));
    }
}
