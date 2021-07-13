package db.cursul5.threads.runnable;

public class Employee implements Runnable{
    int number;

    @Override
    public void run() {
        System.out.println("Employee " + number + " arrived at work");
    }

    public Employee(int number) {
        this.number = number;
    }
}
