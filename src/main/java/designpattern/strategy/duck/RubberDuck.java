package designpattern.strategy.duck;

import designpattern.strategy.Duck;
import designpattern.strategy.FlyNoWay;
import designpattern.strategy.Squak;

public class RubberDuck extends Duck {

    public RubberDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squak();
    }

    @Override
    public void display() {
        System.out.println("나는 고무 오리야~~");
    }
    
}
