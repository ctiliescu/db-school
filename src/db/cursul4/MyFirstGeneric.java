package db.cursul4;

//import static db.cursul4.MySecGeneric.*;

public class MyFirstGeneric {
    public static void main(String[] args) {
        Integer[] myArray = {2,3,4};
        String[] mySecArray = {"unu","doi","trei"};
//        printArray(myArray);
//        printSec2Array(mySecArray);
//        printSecArray(mySecArray);
//        System.out.println(name);
        // sal

        printArray2(myArray);
        printArray2(mySecArray);
    }

    public static <T> void printArray(T[] myArray){

        for(int i = 0; i < myArray.length; i++){
            System.out.print(myArray[i] + " ");
        }
    }

    public static <T> void printArray2(T[] myArray){

        for(T object : myArray){
            System.out.print(object + " ");
        }
    }
}
