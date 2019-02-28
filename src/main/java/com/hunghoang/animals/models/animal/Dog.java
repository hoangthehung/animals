package com.hunghoang.animals.models.animal;

import com.hunghoang.animals.action.impl.sing.DogSound;

public class Dog extends Animal {
    public Dog(){
        super();
        this.actionSing = new DogSound();
    }
}
