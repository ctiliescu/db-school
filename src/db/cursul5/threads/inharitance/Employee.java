package db.cursul5.threads.inharitance;

public class Employee extends Thread{
    int number;

    public Employee(int number){
        this.number = number;
    }

    public void run() {
        System.out.println("Employee " + number + " arrived at work");
    }
}
