package com.hunghoang.animals.models.bird;

import com.hunghoang.animals.models.Bird;
import com.hunghoang.animals.util.LiveContext;

public class Parrot extends Bird {
    LiveContext liveContext;
    public Parrot(){
        super();
    }
    public void setLiveContext(LiveContext liveContext){
        this.liveContext = liveContext;
        this.actionSing = this.liveContext.getLive().getActionSing();
    }
}
