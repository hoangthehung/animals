package com.hunghoang.animals.action.impl;

import com.hunghoang.animals.action.ActionWalk;

public class CanWalk implements ActionWalk {
    @Override
    public void walk() {
        System.out.println("I am walking");
    }
}
