package com.cc.java.observers;

import com.cc.java.Logger;
import com.cc.java.subject.Subject;

public class Observer implements IObserve{
    
    private Subject s;
    private String name;
    private boolean isNotifiedByPush;
   
    public Observer(Subject s, String name) {
        this.s = s;
        this.name = name;
        s.attach(this);
    } 

    @Override
    public void update() {
        String str = name + ": (by pull) observes changed state to: " + s.getState();
        Logger.ausgabe(str);
    }

    @Override
    public void update(String state) {
        String str = name + ": (by push) observes changed state to: " + state;
        Logger.ausgabe(str);
        // SMS / Mail Gateway ...
    }

    public boolean isNotifiedByPush() {
        return isNotifiedByPush;
    }

    public void setNotifiedByPush(boolean isNotifiedByPush) {
        this.isNotifiedByPush = isNotifiedByPush;
    }





   
}
