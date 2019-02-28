package com.hunghoang.animals.models.animal;

import com.hunghoang.animals.action.impl.sing.CatSound;

public class Cat extends Animal {
    public Cat(){
        super();
        this.actionSing = new CatSound();
    }
}
