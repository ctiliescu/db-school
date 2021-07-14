package db.cursul6.observable;

public class Main {
    public static void main(String[] args) {
        ForumThread forum1 = new ForumThread("Radio");
        ForumThread forum2 = new ForumThread("Revista");

        User user1 = new User("Mara");
        User user2 = new User("Mihai");
        User user3 = new User("Alex");

        user1.subscribe(forum1);
        user2.subscribe(forum2);
        user3.subscribe(forum1);

        forum1.notifyObservers();
        forum2.notifyObservers();
    }
}
