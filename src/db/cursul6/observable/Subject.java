package db.cursul6.observable;

public interface Subject {
    void addObserver(Observer o);
    void notifyObservers();
}
