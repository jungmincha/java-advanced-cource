package designpattern.observerpractice.observer;

/*
Observer
구독자
크루들은 코치가 하는 일들을 모두 알림 받아야 한다.
크루는 자신의 상태를 업데이트 하는 기능을 가진다.
*/
public interface Crew {
    void update(String msg);
}
