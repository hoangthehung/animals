package com.hunghoang.animals.action.impl.walk;

import com.hunghoang.animals.action.ActionWalk;

public class CanCrawl implements ActionWalk {
    @Override
    public void walk() {
        System.out.println("I am crawling");
    }
}
