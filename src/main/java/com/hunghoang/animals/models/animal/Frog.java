package com.hunghoang.animals.models.animal;

import com.hunghoang.animals.action.impl.sing.CanSing;
import com.hunghoang.animals.action.impl.swim.CanSwim;
import com.hunghoang.animals.action.impl.walk.CanWalk;
import com.hunghoang.animals.models.Kind;

public class Frog extends Animal {
    public Frog(){
        super();
        this.actionSing = new CanSing();
        this.actionSwim = new CanSwim();
    }
}
