package db.cursul5.ios;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BinExample {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream=new FileOutputStream("test.dat");
        for (int i = 0; i < 10; i++) {
            fileOutputStream.write(i);
        }
        fileOutputStream.close();
        FileInputStream fileInputStream=new FileInputStream("test.dat");
        FileOutputStream fileOutputStream2=new FileOutputStream("test.dat");
        fileOutputStream2.write(50);
        fileOutputStream2.close();
        int x;
        while ((x=fileInputStream.read())!=-1){
            System.out.println(x);
        }
        fileInputStream.close();
    }
}
