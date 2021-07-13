package db.cursul5.threads.sync;

class Table {
    public synchronized void printTable(int n){
        for (int i = 0; i <= 5; i++) {
            System.out.println(n * i);
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class MyThread1 extends Thread {
    Table t;

    public MyThread1(Table t) {
        this.t = t;
    }

    public void run(){
        t.printTable(5);
    }
}

class MyThread2 extends Thread {
    Table t;

    public MyThread2(Table t) {
        this.t = t;
    }

    public void run(){
        t.printTable(100);
    }
}


public class MainSync {
    public static void main(String[] args) {

        Table t1 = new Table();
        MyThread1 m1 = new MyThread1(t1);
        MyThread2 m2 = new MyThread2(t1);

        m1.start();
        m2.start();
    }
}
