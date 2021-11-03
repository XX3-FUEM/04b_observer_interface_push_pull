package com.cc.java;

import com.cc.java.observers.Observer;
import com.cc.java.subject.Subject;

public class App {
    
    public static void main(String[] args) {

      Subject s = new Subject();

      Observer o1 = new Observer(s, "observer_1");
      Observer o2 = new Observer(s, "observer_2");

      s.setState("state 1");
      Logger.ausgabe("-------------");
      o2.setNotifiedByPush(true);  // Push an ..
      s.setState("state 2");
      Logger.ausgabe("------------");
      o2.setNotifiedByPush(false); // Push aus ...
      s.setState("state 3");
      Logger.ausgabe("------------");
      s.detatch(o1);
      s.setState("state 2");
      Logger.ausgabe("------------");

    }

}
