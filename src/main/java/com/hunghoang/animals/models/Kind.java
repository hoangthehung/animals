package com.hunghoang.animals.models;

import com.hunghoang.animals.action.AnimalFly;
import com.hunghoang.animals.action.AnimalSing;
import com.hunghoang.animals.action.AnimalWalk;

public abstract class Kind {
    AnimalWalk animalWalk;
    AnimalFly animalFly;
    AnimalSing animalSing;



    public void fly(){
        animalFly.fly();
    }
    public void walk(){
        animalWalk.walk();
    }
    public void sing() {
        animalSing.sing();
    }
}
