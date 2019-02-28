package com.hunghoang.animals.models.insect;

import com.hunghoang.animals.action.impl.fly.CanFly;
import com.hunghoang.animals.action.impl.fly.CanNotFly;
import com.hunghoang.animals.action.impl.sing.CanNotMakeSound;
import com.hunghoang.animals.action.impl.walk.CanCrawl;
import com.hunghoang.animals.action.impl.walk.CanNotWalk;
import com.hunghoang.animals.models.Kind;

public class Caterpillar extends Kind {
    public Caterpillar() {
        super();
        this.actionFly = new CanNotFly();
        this.actionWalk = new CanCrawl();
    }
    public void transform() {
        Butterfly butterfly = new Butterfly();
        this.actionWalk = butterfly.getActionWalk();
        this.actionFly = butterfly.getActionFly();
        this.actionSing = butterfly.getActionSing();
    }
}
