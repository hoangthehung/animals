package com.hunghoang.animals.action.impl.fly;

import com.hunghoang.animals.action.ActionFly;

public class CanNotFly implements ActionFly {
    @Override
    public void fly() {
        System.out.println("I can not fly");
    }
}
