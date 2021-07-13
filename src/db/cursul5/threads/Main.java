package db.cursul5.threads;


import db.cursul5.threads.semaphore.Employee;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Employee[] array = new Employee[30];
        for (int i = 0; i < 30; i++) {
            array[i] = new Employee(i);
            array[i].start();
        }
    }
}
