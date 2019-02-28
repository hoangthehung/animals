package com.hunghoang.animals.models;

import com.hunghoang.animals.action.AnimalWalk;
import com.hunghoang.animals.action.impl.CanWalk;

public class Animal extends Kind {
    public Animal(){
        this.animalWalk = new CanWalk();
    }
}
