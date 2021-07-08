package db.cursul3.counter;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader implements WordReader{


    @Override
    public String[] readWords() {

        try {
            String content = new Scanner(new File("file.txt")).useDelimiter("\\Z").next();
            return content.split(" ");
        } catch (FileNotFoundException e) {
            System.out.println("Fisierul nu a fost gasit");
            return new String[0];
        }

    }
}
