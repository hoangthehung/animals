package com.hunghoang.animals.models.fish;

import com.hunghoang.animals.action.impl.swim.GoodSwim;
import com.hunghoang.animals.action.impl.sing.CanNotSing;
import com.hunghoang.animals.action.impl.walk.CanNotWalk;
import com.hunghoang.animals.models.Kind;

public class Dolphins extends Kind {
    public Dolphins() {
        super();
        this.actionSing = new CanNotSing();
        this.actionWalk = new CanNotWalk();
        this.actionSwim = new GoodSwim();
    }

}
