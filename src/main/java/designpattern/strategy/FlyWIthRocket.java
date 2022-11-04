package designpattern.strategy;

public class FlyWIthRocket implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("나는 로켓으로 추진력을 얻어요!");
    }
    
}
