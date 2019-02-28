package com.hunghoang.animals.models.animal;

import com.hunghoang.animals.action.impl.walk.CanWalk;
import com.hunghoang.animals.models.Kind;

public class Animal extends Kind {
    public Animal(){
        super();
        this.actionWalk = new CanWalk();
    }
}
