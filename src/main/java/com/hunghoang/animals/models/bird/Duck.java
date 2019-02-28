package com.hunghoang.animals.models.bird;

import com.hunghoang.animals.action.impl.swim.CanSwim;
import com.hunghoang.animals.action.impl.sing.DuckSound;

public class Duck extends Bird {
    public Duck() {
        super();
        this.actionSing = new DuckSound();
        this.actionSwim = new CanSwim();
    }
}
