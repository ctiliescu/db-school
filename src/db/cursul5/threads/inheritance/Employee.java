package db.cursul5.threads.inheritance;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Employee extends Thread{
    int number;
    private static int deposit = 0;
    private static Lock lock = new ReentrantLock();


    public void addMoney() {
        lock.lock();
        System.out.println("Before " + deposit);
        deposit += 10;
        System.out.println("After " + deposit);
        lock.unlock();
    }

    public Employee(int number){
        this.number = number;
    }

    public void run() {
        addMoney();
    }
}
