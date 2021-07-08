package db.cursul3.counter;

import java.util.Scanner;

public class KeyboardReader implements WordReader {


    @Override
    public String[] readWords() {

        Scanner scan = new Scanner(System.in);

        String s = scan.nextLine();

       return s.split(" ");
    }


}
