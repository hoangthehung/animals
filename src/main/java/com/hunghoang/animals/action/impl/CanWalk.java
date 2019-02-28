package com.hunghoang.animals.action.impl;

import com.hunghoang.animals.action.AnimalWalk;

public class CanWalk implements AnimalWalk {
    @Override
    public void walk() {
        System.out.println("I am walking");
    }
}
