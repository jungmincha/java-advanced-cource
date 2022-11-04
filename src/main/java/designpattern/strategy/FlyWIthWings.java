package designpattern.strategy;
/* 날 수 있는 오리들의 행동을 구현한 구현 클래스 */
public class FlyWIthWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("날고 있어요~~");  
    }
}
