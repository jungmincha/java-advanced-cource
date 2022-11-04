package designpattern.observerpractice;

import designpattern.observerpractice.observable.Baedi;
import designpattern.observerpractice.observer.Crew;
import designpattern.observerpractice.observer.Jay;
import designpattern.observerpractice.observer.Lewin;

public class Main {

    public static void main(String[] args) {
    Baedi baedi = new Baedi();

    Crew jay = new Jay();
    Crew lewin = new Lewin();

    baedi.subscribe(jay);
    baedi.subscribe(lewin);

    baedi.eatFood();

    }
}
