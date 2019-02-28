package com.hunghoang.animals.models;

import com.hunghoang.animals.action.impl.CanWalk;
import com.hunghoang.animals.action.impl.fly.CanFly;
import com.hunghoang.animals.action.impl.sing.CanSing;

public class Bird extends Kind {
    public Bird() {
        super();
        this.actionWalk = new CanWalk();
        this.actionFly = new CanFly();
        this.actionSing = new CanSing();
    }

}
