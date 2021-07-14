package db.cursul6.observable;

public interface Observer {
    void receiveNotification(String notification);
    void subscribe(Subject forum);
}
