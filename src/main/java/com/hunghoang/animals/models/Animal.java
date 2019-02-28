package com.hunghoang.animals.models;

import com.hunghoang.animals.action.impl.CanWalk;

public class Animal extends Kind {
    public Animal(){
        super();
        this.actionWalk = new CanWalk();
    }
}
