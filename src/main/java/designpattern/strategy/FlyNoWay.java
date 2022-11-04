package designpattern.strategy;
/* 날 수 없는 오리들의 행동을 구현한 구현 클래스 */
public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("나는 날지 못해요 ㅠ.ㅠ");
    }
}
