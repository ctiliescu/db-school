package db.cursurul2;

public class ArrayTest {

    public static void main(String[] args) {

        for (String s : args) {
            if (s.length() > 4) {
                System.out.println(s);
            }
        }

        for (int i = 0; i < args.length; i++) {
            if (args[i].length() > 4) {
                System.out.println(args[i]);
            }
        }
    }
}
