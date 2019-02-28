package com.hunghoang.animals.action.impl.fly;

import com.hunghoang.animals.action.ActionFly;

public class CanFly implements ActionFly {
    @Override
    public void fly() {
        System.out.println("I am flying");
    }
}
