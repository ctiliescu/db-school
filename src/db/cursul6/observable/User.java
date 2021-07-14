package db.cursul6.observable;

public class User implements Observer{

    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void receiveNotification(String notification) {
        System.out.println(notification + " " +  this.name);
    }

    @Override
    public void subscribe(Subject forum) {
        forum.addObserver(this);
    }
}
