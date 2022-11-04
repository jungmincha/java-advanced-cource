package designpattern.observerpractice.observable;



import designpattern.observerpractice.observer.Crew;

import java.util.ArrayList;
import java.util.List;

//발행 인터페이스인 Coach를 상속받아 구현한다.
public class Baedi implements Coach {

    private List<Crew> crews = new ArrayList<>();

    public void eatFood() {
        System.out.println("베디코치가 밥을 먹는다.");
        notifyCrew("나 밥 먹었다.");
    }

    public void runaway() {
        System.out.println("베디코치가 농땡이를 친다.");
        notifyCrew("나 농땡이 쳤다.");
    }

    public void upgradeCutie() {
        System.out.println("베디코치가 귀여움을 강화했다.");
        notifyCrew("나 더 귀여워 졌다.");
    }

    public void noticeForCrew(String msg) {
        System.out.println("배디코치가 모두에게 전한다.");
        notifyCrew(msg);
    }

    @Override
    public void subscribe(Crew crew) {
        crews.add(crew);
    }

    @Override
    public void unsubscribe(Crew crew) {
        crews.remove(crew);
    }

    @Override
    public void notifyCrew(String msg) {
        crews.forEach(crew -> crew.update(msg));
    }
}
