package designpattern.strategy;
/* 추상 클래스 */
public abstract class Duck {

    /* 행동 인터페이스의 레퍼런스 변수 2개를 선언
    같은 패키지에 속하는 모든 서브 클래스에서 이 변수를 상속 받는다. */
    public FlyBehavior flyBehavior;
    public QuackBehavior quackBehavior;
    
    public FlyBehavior getFlyBehavior() {
        return flyBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public QuackBehavior getQuackBehavior() {
        return quackBehavior;
    }

        
    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }


    public Duck(){}

    /* 상속 받는 클래스에서 구현하는 추상 메소드
     display는 모두 다르게 표현되기 때문에 상속 받는 클래스에서 구현 */
    public abstract void display();

    public void performFly() {
        /* 행동 클래스에 위임 */
        flyBehavior.fly();
    }

    public void performQuack() {
        /* 행동 클래스에 위임 */
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("모든 오리는 물에 뜹니다. 물론 가짜오리도");
    }
    
}
