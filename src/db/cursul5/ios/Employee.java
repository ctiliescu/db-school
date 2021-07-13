package db.cursul5.ios;

import java.io.*;

public class Employee implements Serializable {
    transient String name;
    transient int age;

    public Employee() {
    }

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name+age;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Employee employee=new Employee("Ovidiu",21);
        ObjectOutputStream os=null;
        os=new ObjectOutputStream(new FileOutputStream("out.bin"));
        os.writeObject(employee);
        System.out.println("Successful Writing");
        ObjectInputStream is=new ObjectInputStream(new FileInputStream("out.bin"));
        employee= (Employee) is.readObject();
        System.out.println(employee);
        System.out.println("Successful Reading");
    }
}
