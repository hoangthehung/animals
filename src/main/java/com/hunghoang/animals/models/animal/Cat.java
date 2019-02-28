package com.hunghoang.animals.models.animal;

import com.hunghoang.animals.action.impl.sing.CatSound;
import com.hunghoang.animals.action.impl.sing.DogSound;
import com.hunghoang.animals.models.Animal;

public class Cat extends Animal {
    public Cat(){
        super();
        this.actionSing = new CatSound();
    }
}
