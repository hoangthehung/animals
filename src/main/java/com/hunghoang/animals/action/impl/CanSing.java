package com.hunghoang.animals.action.impl;

import com.hunghoang.animals.action.AnimalSing;

public class CanSing implements AnimalSing {
    @Override
    public void sing() {
        System.out.println("I am singing");
    }
}
