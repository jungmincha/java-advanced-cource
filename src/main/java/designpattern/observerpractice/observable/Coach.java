package designpattern.observerpractice.observable;


import designpattern.observerpractice.observer.Crew;

/*
Observable
발행자
코치는 모든 크루들에게 정보를 알려야 한다.
*/
public interface Coach {

    //구독
    void subscribe(Crew crew);
    //구독 취소
    void unsubscribe(Crew crew);
    //알림
    void notifyCrew(String msg);
}
