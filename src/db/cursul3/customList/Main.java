package db.cursul3.customList;

public class Main {
    public static void main(String[] args) throws AddException {
        List myList = new List();

        myList.add("sir1");
        myList.add("sir2");

        myList.recursiveAdd("Theo");
        myList.add(-2, "string3");
        myList.add(0, "string3");
        myList.add(3, "string4");

        myList.print();
    }
}
