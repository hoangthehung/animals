package com.hunghoang.animals.action.impl.sing;

import com.hunghoang.animals.action.AactionSing;

public class CanSing implements AactionSing {
    @Override
    public void sing() {
        System.out.println("I am singing");
    }
}
