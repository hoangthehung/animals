package com.hunghoang.animals.util;

import com.hunghoang.animals.models.Kind;

public class LiveContext {
    Kind live;
    public LiveContext(Kind live){
        this.live = live;
    }

    public Kind getLive() {
        return live;
    }

    public void setLive(Kind live) {
        this.live = live;
    }
}
