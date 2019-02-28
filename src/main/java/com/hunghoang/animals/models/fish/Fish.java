package com.hunghoang.animals.models.fish;

import com.hunghoang.animals.action.impl.CanSwim;
import com.hunghoang.animals.action.impl.fly.CanNotFly;
import com.hunghoang.animals.action.impl.sing.CanNotSing;
import com.hunghoang.animals.action.impl.walk.CanNotWalk;
import com.hunghoang.animals.models.Kind;
import com.hunghoang.animals.util.Color;
import com.hunghoang.animals.util.Shape;

public class Fish extends Kind {
    Shape shape;
    Color color;
    public Fish() {
        super();
        this.actionSing = new CanNotSing();
        this.actionWalk = new CanNotWalk();
        this.actionSwim = new CanSwim();
    }

    public Shape getShape() {
        return shape;
    }

    public Color getColor() {
        return color;
    }
}
