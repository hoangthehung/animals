package com.hunghoang.animals.models.fish;

import com.hunghoang.animals.action.ActionEatFish;
import com.hunghoang.animals.util.Color;
import com.hunghoang.animals.util.Shape;

public class Shark extends Fish implements ActionEatFish {
    public Shark() {
        super();
        this.shape = Shape.LARGE;
        this.color = Color.GREY;
    }

    @Override
    public void eat(Fish fish) {
        System.out.println("I am eating a fish");
    }
}
