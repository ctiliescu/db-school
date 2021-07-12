package db.cursul4;

import java.util.ArrayList;
import java.util.List;

public class MyFirstWildcard {

    public static void main(String[] args) {
        List<Automobile> myList = new ArrayList<Automobile>();
        myList.add(new Automobile.Dacia());
        myList.add(new Automobile.BMW());
        myList.add(new Automobile());
        listAutomobiles(myList);
    }

    public static void listAutomobiles(List<? extends Automobile> myList) {
        for(Automobile automobile : myList) {
            System.out.println(automobile.getType());
        }
    }


}
