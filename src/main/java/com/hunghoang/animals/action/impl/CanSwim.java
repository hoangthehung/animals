package com.hunghoang.animals.action.impl;

import com.hunghoang.animals.action.AactionSwim;

public class CanSwim implements AactionSwim {
    @Override
    public void swim() {
        System.out.println("I am swimming");
    }

}
