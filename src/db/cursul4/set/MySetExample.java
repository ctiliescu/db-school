package db.cursul4.set;

import java.util.*;

public class MySetExample {
    public static void main(String[] args) {
        Set<String> mySet = new HashSet<>();
        boolean miau = mySet.add("a");
        System.out.println(miau);
        System.out.println(mySet);

        mySet.add("b");
        mySet.add("c");

        System.out.println(mySet);

        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.addAll(mySet);
        TreeSet<String> result = (TreeSet<String>)treeSet.descendingSet();

        System.out.println(treeSet);
        System.out.println(result);

//        for(String s : result) {
//            System.out.println(s);
//        }


        Iterator<String> iterator = result.iterator();
        //result.remove(iterator.next());

        mySet.remove("b");

        System.out.println(mySet);
    }
}
