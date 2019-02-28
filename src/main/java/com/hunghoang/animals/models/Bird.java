package com.hunghoang.animals.models;

import com.hunghoang.animals.action.impl.CanFly;
import com.hunghoang.animals.action.impl.CanSing;

public class Bird extends Animal {
    public Bird(){
        super();
        this.animalFly = new CanFly();
        this.animalSing = new CanSing();
    }

}
