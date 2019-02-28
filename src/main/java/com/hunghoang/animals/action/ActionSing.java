package com.hunghoang.animals.action;

import java.util.Locale;
import java.util.ResourceBundle;

@FunctionalInterface
public interface ActionSing {
    public void sing();
    default ResourceBundle getBundle(){
        Locale locale = Locale.getDefault();
        if(locale==null){
            locale= Locale.ENGLISH;
        }

        ResourceBundle bundle = ResourceBundle.getBundle("lang", locale);
        return bundle;
    }
    default String getSound(String kind){
        StringBuffer sound= new StringBuffer(kind).append(".sound");
        return    getBundle().getString(sound.toString());
    }
}
