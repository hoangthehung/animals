package com.hunghoang.animals.models.fish;

import com.hunghoang.animals.action.ActionMakeJokes;
import com.hunghoang.animals.util.Color;
import com.hunghoang.animals.util.Shape;

public class Clownfish extends Fish implements ActionMakeJokes {
    public Clownfish() {
        super();
        this.shape = Shape.SMALL;
        this.color = Color.ORANGE;
    }

    @Override
    public void make() {
        System.out.println("I make jokes");
    }
}
