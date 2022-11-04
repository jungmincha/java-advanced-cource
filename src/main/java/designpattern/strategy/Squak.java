package designpattern.strategy;

public class Squak implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("삑");  
    }
    
}
