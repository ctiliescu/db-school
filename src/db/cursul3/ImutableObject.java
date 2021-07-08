package db.cursul3;

import java.util.Arrays;

public class ImutableObject implements Cloneable {
    private String string1;
    private String string2;
    private int integer;
    private int[] array;

    public ImutableObject() {
        this.string1 = "string1";
        this.string2 = "string2";
        this.integer = 0;
        this.array = new int[]{1, 4};
    }

    public String getString1() {
        return string1;
    }

    public String getString2() {
        return string2;
    }

    public int getInteger() {
        return integer;
    }

    public int[] getArray() {
        return cloneArray();
    }

    private int[] cloneArray() {
        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        return newArray;
    }

    @Override
    public String toString() {
        return "ImutableObject{" +
                "string1='" + string1 + '\'' +
                ", string2='" + string2 + '\'' +
                ", integer=" + integer +
                ", array=" + Arrays.toString(array) +
                '}';
    }
}
