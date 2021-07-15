package db.cursul7;

public class Main {

    public static void main(String[] args) {
        //concurrency();
        deadlockFunction();
    }

    public static void deadlockFunction() {
        SyncObject o1 = new SyncObject();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                o1.met4();
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                o1.met5();
            }
        });

        t1.start();
        t2.start();
    }

    private static void concurrency() {
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
