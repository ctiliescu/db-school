package db.cursul3.counter;

import java.io.FileNotFoundException;

public class CounterExample {
    public static void main(String[] args) throws FileNotFoundException {

        WordReader wordReader = new KeyboardReader();
        WordReader readFromFile = new FileReader();

        // Clasa anonima
        WordReader anonimReader = new WordReader() {
            @Override
            public String[] readWords() throws FileNotFoundException {
                return new String[1];
            }
        };

        System.out.println(wordReader.readWords().length);
        System.out.println(readFromFile.readWords().length);
        System.out.println(anonimReader.readWords().length);

    }
}
