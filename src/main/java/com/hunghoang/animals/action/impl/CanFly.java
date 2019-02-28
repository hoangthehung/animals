package com.hunghoang.animals.action.impl;

import com.hunghoang.animals.action.AnimalFly;

public class CanFly implements AnimalFly {
    @Override
    public void fly() {
        System.out.println("I am flying");
    }
}
