package com.hunghoang.animals.models;

import com.hunghoang.animals.action.ActionFly;
import com.hunghoang.animals.action.ActionSing;
import com.hunghoang.animals.action.ActionSwim;
import com.hunghoang.animals.action.ActionWalk;

public abstract class Kind {
    protected ActionWalk actionWalk;
    protected ActionFly actionFly;
    protected ActionSing actionSing;
    protected ActionSwim actionSwim;


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

    public ActionSing getActionSing() {
        return actionSing;
    }
}
