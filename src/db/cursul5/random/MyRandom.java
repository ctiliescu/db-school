package db.cursul5.random;

import java.io.IOException;
import java.io.RandomAccessFile;

public class MyRandom {
    public static void main(String[] args) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile("test.dat", "rw");
        randomAccessFile.setLength(0);

        for (int i = 1; i < 10; i++) {
            randomAccessFile.writeInt(i);
        }

        randomAccessFile.seek(0);
        System.out.println(randomAccessFile.readInt());
        randomAccessFile.seek(1);
        System.out.println(randomAccessFile.readInt());
        Integer integer = 1;
        randomAccessFile.seek(2);
        System.out.println(randomAccessFile.readInt());
        randomAccessFile.seek(3);
        System.out.println(randomAccessFile.readInt());
        randomAccessFile.seek(4);
        System.out.println(randomAccessFile.readInt());
    }
}
