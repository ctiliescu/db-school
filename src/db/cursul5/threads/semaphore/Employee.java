package db.cursul5.threads.semaphore;

import java.util.concurrent.Semaphore;

public class Employee extends Thread{
    int number;
    private static int deposit = 0;
    private static Semaphore semaphore = new Semaphore(3);

    public void addMoney() throws InterruptedException {
        semaphore.acquire();
        System.out.println("Before " + deposit);
        deposit += 10;
        System.out.println("After " + deposit);
        semaphore.release();
    }

    public Employee(int number){
        this.number = number;
    }

    public void run() {
        try {
            addMoney();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
