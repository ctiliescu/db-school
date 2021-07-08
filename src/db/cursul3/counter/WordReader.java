package db.cursul3.counter;

import java.io.FileNotFoundException;
import java.util.List;

public interface WordReader {

    public String[]  readWords() throws FileNotFoundException;

}
