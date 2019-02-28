package com.hunghoang.animals.models.bird;

import com.hunghoang.animals.action.impl.walk.CanWalk;
import com.hunghoang.animals.action.impl.fly.CanFly;
import com.hunghoang.animals.action.impl.sing.CanSing;
import com.hunghoang.animals.models.Kind;

public class Bird extends Kind {
    public Bird() {
        super();
        this.actionWalk = new CanWalk();
        this.actionFly = new CanFly();
        this.actionSing = new CanSing();
    }

}
