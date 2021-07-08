package db.cursul3;

public class MutableObject implements Cloneable{
    private String string1;
    private String string2;
    private int integer;
    private int[] array;

    public MutableObject() {
        this.string1 = "string1";
        this.string2 = "string2";
        this.integer = 0;
        this.array = new int[]{1,4};
    }

    public MutableObject(String string1, String string2, int integer, int[] array) {
        this.string1 = string1;
        this.string2 = string2;
        this.integer = integer;
        this.array = array;
    }

    public String getString1() {
        return string1;
    }

    public void setString1(String string1) {
        if(!string1.isEmpty()) {
            this.string1 = string1;
        }
    }

    public String getString2() {
        return string2;
    }

    public void setString2(String string2) {
        this.string2 = string2;
    }

    public int getInteger() {
        return integer;
    }

    public void setInteger(int integer) {
        this.integer = integer;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    @Override
    protected MutableObject clone(){
        MutableObject mutable2 = new MutableObject(this.string1, this.string2, this.integer, this.array);
        return mutable2;
    }
}
