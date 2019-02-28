package com.hunghoang.animals.action.impl.sing;

import com.hunghoang.animals.action.ActionSing;

public class CanNotSing implements ActionSing {
    @Override
    public void sing() {
        System.out.println("I can not sing");
    }
}
