package db.cursul3.counter;

import java.io.FileNotFoundException;

public class CounterExample {
    public static void main(String[] args) throws FileNotFoundException {

        WordReader wordReader = new KeyboardReader();
        WordReader readFromFile = new FileReader();

        System.out.println(wordReader.readWords().length);
        System.out.println(readFromFile.readWords().length);

    }
}
