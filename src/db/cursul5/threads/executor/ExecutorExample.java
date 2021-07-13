package db.cursul5.threads.executor;

import db.cursul5.threads.runnable.Employee;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorExample {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        executor.execute(new Employee(1));
        executor.execute(new Employee(2));
        executor.execute(new Employee(3));
        executor.shutdown();
    }
}
