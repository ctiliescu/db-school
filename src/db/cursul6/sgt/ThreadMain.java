package db.cursul6.sgt;

public class ThreadMain {
    public static void main(String[] args) {
        Runnable run = new Runnable() {
            @Override
            public void run() {
                SingletonObject singletonObject = SingletonObject.getInstance();
            }
        };

        Thread thread1 = new Thread(run);
        Thread thread2 = new Thread(run);
        thread1.start();
        thread2.start();
    }
}
