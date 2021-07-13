package db.cursul5;

import org.w3c.dom.ls.LSOutput;

interface Addable {
    int add(int a, int b);
}

public class MySecLambda {

    public static void main(String[] args) {
        Addable add1 = (a, b) -> (a + b);
        Addable add2 = (int a, int b) -> (a + b);
        System.out.println(add1.add(3, 4));
        System.out.println(add2.add(3, 2));
    }
}
