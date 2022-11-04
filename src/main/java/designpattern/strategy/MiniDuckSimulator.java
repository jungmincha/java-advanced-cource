package designpattern.strategy;

import designpattern.strategy.duck.MallardDuck;
import designpattern.strategy.duck.RubberDuck;

public class MiniDuckSimulator {
    public static void main(String [] args){
        System.out.println("================================");
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();
        mallard.display();
        mallard.swim();

        System.out.println("================================");

        Duck rubber = new RubberDuck();
        
        rubber.performFly();
        /* 실행 중에 오리의 행동을 바꾸고 싶으면 원하는 행동에 해당하는 duck의 setter 메서드를 호출한다 */
        rubber.setFlyBehavior(new FlyWIthRocket());
        rubber.performFly();
        rubber.performQuack();
        rubber.display();
        rubber.swim();

        System.out.println("================================");
    }
}
