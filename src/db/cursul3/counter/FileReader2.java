package db.cursul3.counter;

import java.io.*;
import java.util.Scanner;

public class FileReader2 implements WordReader{


    @Override
    public String[] readWords() {
        try(FileInputStream fstream = new FileInputStream("textfile.txt");) {

            BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

            String strLine;
            while ((strLine = br.readLine()) != null)   {
                System.out.println (strLine);
            }

        } catch (IOException e) {
            System.out.println("Fisierul nu a fost gasit");
        }

        return new String[0];
    }

/*    @Override
    public String[] readWords() {
        FileInputStream fstream = null;
        try {
            fstream = new FileInputStream("textfile.txt");;
            BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

            String strLine;
            while ((strLine = br.readLine()) != null)   {
                System.out.println (strLine);
            }

        } catch (IOException e) {
            System.out.println("Fisierul nu a fost gasit");
        } finally {
            if(fstream != null) {
                try {
                    fstream.close();
                } catch (IOException e) {
                    // This is unrecoverable. Just report it and move on
                    e.printStackTrace();
                }
            }
        }

        return new String[0];
    }*/
}
