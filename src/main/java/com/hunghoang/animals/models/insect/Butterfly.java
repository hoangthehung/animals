package com.hunghoang.animals.models.insect;

import com.hunghoang.animals.action.impl.fly.CanFly;
import com.hunghoang.animals.action.impl.sing.CanNotMakeSound;
import com.hunghoang.animals.action.impl.sing.CanNotSing;
import com.hunghoang.animals.models.Kind;

public class Butterfly extends Kind {
    public Butterfly() {
        super();
        this.actionSing = new CanNotMakeSound();
        this.actionFly = new CanFly();
    }
}
