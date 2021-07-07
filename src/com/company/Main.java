package com.company;

public class Main {

    public static void main(String[] args) {


        System.out.println("Hello, World!");

        String immutableString = "abc";
        test(immutableString);
        System.out.println("immutableString:" + immutableString);
        immutableString = "qwe";
        System.out.println("immutableString:" + immutableString);
    }

    public static void test(String s) {
        String ref = s;
        s = "xyz";
        System.out.println("ref:" + ref);
        System.out.println("s:" + s);
    }
}
