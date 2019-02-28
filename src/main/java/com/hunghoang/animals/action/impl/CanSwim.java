package com.hunghoang.animals.action.impl;

import com.hunghoang.animals.action.ActionSwim;

public class CanSwim implements ActionSwim {
    @Override
    public void swim() {
        System.out.println("I am swimming");
    }

}
