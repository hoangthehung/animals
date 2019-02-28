package com.hunghoang.animals.util;

import com.hunghoang.animals.action.impl.fly.CanFly;
import com.hunghoang.animals.action.impl.sing.CanSing;
import com.hunghoang.animals.action.impl.swim.CanSwim;
import com.hunghoang.animals.action.impl.walk.CanWalk;
import com.hunghoang.animals.models.Kind;

public class CounterAnimal {
    public int countActionFly(Kind[] animals) {
        int sum = 0;
        for(Kind animal: animals) {
            if (animal != null && animal.getActionFly() instanceof CanFly) sum++;
        }
        return sum;
    }
    public int countActionSwim(Kind[] animals) {
        int sum = 0;
        for(Kind animal: animals) {
            System.out.println(animal.getClass().getName() + " " + (animal.getActionSwim() instanceof CanSwim));
            if (animal != null && animal.getActionSwim() instanceof CanSwim) sum++;
        }
        return sum;
    }
    public int countActionWalk(Kind[] animals) {
        int sum = 0;
        for(Kind animal: animals) {
            if (animal != null && animal.getActionWalk() instanceof CanWalk) sum++;
        }
        return sum;
    }
    public int countActionSing(Kind[] animals) {
        int sum = 0;
        for(Kind animal: animals) {
            if (animal != null && animal.getActionSing() instanceof CanSing) sum++;
        }
        return sum;
    }
}
