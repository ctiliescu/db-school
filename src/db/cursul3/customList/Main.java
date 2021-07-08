package db.cursul3.customList;

public class Main {
    public static void main(String[] args) {
        List myList = new List();

        myList.add("sir1");
        myList.add("sir2");

        myList.recursiveAdd("Theo");

        myList.print();
    }
}
