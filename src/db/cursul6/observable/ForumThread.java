package db.cursul6.observable;

import java.util.ArrayList;
import java.util.List;

public class ForumThread implements Subject{

    private String name;
    private List<Observer> obs = new ArrayList<>();

    public ForumThread(String name) {
        this.name = name;
    }

    @Override
    public void addObserver(Observer o) {
        obs.add(o);
    }

    @Override
    public void notifyObservers() {
        for(Observer o : obs) {
            o.receiveNotification("This is my notification from " + this.name);
        }
    }
}
