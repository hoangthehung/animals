package com.hunghoang.animals.models.bird;

import com.hunghoang.animals.action.impl.fly.CanNotFly;
import com.hunghoang.animals.action.impl.sing.RoosterSound;

public class Rooster extends Bird {
    public Rooster(){
        super();
        this.actionFly = new CanNotFly();
        this.actionSing = new RoosterSound();
    }
}
