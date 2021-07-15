package db.cursul7;

public class Main {
    public static void main(String[] args) {
        SyncObject o1 = new SyncObject();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                o1.met1();
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                o1.met2();
            }
        });
        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                o1.met1();
            }
        });

        t1.start();
        t2.start();
        t3.start();
    }

}
