package db.cursurul2;

public class ArrayTest {

    public static void printSpecialName(String name){
        if(name.length() > 4){
            System.out.println(name);
        }
    }
   public static void printSpecialName(String name, int size){
        if(name.length() > size){
            System.out.println(name);
        }
    }

    public static void main(String[] args) {

        for (String s : args) {
            printSpecialName(s);
        }

        for (int i = 0; i < args.length; i++) {
            printSpecialName(args[i],2);
        }
    }
}
