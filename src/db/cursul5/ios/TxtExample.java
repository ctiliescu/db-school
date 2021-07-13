package db.cursul5.ios;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.Scanner;

public class TxtExample {
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("data.txt");
        System.out.println(f.exists());
        System.out.println(f.length());
        System.out.println(f.canRead());
        System.out.println(f.canWrite());
        System.out.println(f.isDirectory());
        System.out.println(f.isFile());
        System.out.println(f.isHidden());

        PrintWriter writer = new PrintWriter(f);
        writer.println("Hello World");
        writer.println("2021");
        writer.close();

        Scanner sc = new Scanner(System.in);
        String message = "Numele meu este ";
        System.out.println("Introduceti numele:");
        String name = sc.nextLine();

        System.out.println(message + name);

        Scanner sc1 = new Scanner(f);
        System.out.println(sc1.nextLine());
    }
}
