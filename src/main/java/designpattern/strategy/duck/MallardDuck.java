package designpattern.strategy.duck;

import designpattern.strategy.Duck;
import designpattern.strategy.FlyWIthWings;
import designpattern.strategy.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWIthWings();
    }

    @Override
    public void display() {
        System.out.println("저는 물오리입니다.");
    } 
}
