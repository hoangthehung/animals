package com.hunghoang.animals.models.bird;

import com.hunghoang.animals.action.impl.fly.CanNotFly;
import com.hunghoang.animals.action.impl.sing.ChickenSound;

public class Chicken extends Bird {
    public Chicken(){
        super();
        this.actionSing = new ChickenSound();
        this.actionFly = new CanNotFly();
    }
}
