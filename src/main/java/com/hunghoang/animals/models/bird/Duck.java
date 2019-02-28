package com.hunghoang.animals.models.bird;

import com.hunghoang.animals.action.impl.CanSwim;
import com.hunghoang.animals.action.impl.sing.DuckSound;
import com.hunghoang.animals.models.Bird;

public class Duck extends Bird {
    public Duck() {
        super();
        this.actionSing = new DuckSound();
        this.actionSwim = new CanSwim();
    }
}
