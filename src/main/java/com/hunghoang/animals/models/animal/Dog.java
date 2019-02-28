package com.hunghoang.animals.models.animal;

import com.hunghoang.animals.action.impl.sing.DogSound;
import com.hunghoang.animals.models.Animal;

public class Dog extends Animal {
    public Dog(){
        super();
        this.actionSing = new DogSound();
    }
}
