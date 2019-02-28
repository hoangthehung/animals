package com.hunghoang.animals.models.fish;

import com.hunghoang.animals.action.impl.CanSwim;
import com.hunghoang.animals.action.impl.GoodSwim;
import com.hunghoang.animals.action.impl.sing.CanNotSing;
import com.hunghoang.animals.action.impl.walk.CanNotWalk;
import com.hunghoang.animals.models.Kind;
import com.hunghoang.animals.util.Color;
import com.hunghoang.animals.util.Shape;

public class Dolphins extends Kind {
    public Dolphins() {
        super();
        this.actionSing = new CanNotSing();
        this.actionWalk = new CanNotWalk();
        this.actionSwim = new GoodSwim();
    }

}
