package com.hunghoang.animals.models;

import com.hunghoang.animals.action.ActionFly;
import com.hunghoang.animals.action.AactionSing;
import com.hunghoang.animals.action.AactionSwim;
import com.hunghoang.animals.action.ActionWalk;

public abstract class Kind {
    protected ActionWalk actionWalk;
    protected ActionFly actionFly;
    protected AactionSing actionSing;
    protected AactionSwim actionSwim;


    public void fly(){
        actionFly.fly();
    }
    public void walk(){
        actionWalk.walk();
    }
    public void sing() {
        actionSing.sing();
    }
    public void swim(){
        actionSwim.swim();
    }
}
