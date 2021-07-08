package db.cursul3;

public class MutableExample {

    static MutableObject function(MutableObject mutable){
        System.out.println(mutable.getString2());
        mutable.setString2("somethingelse");
        mutable.getArray()[1] = 120;
        return mutable;
    }

    public static void main(String[] args) {
        MutableObject mutable = new MutableObject();
        MutableObject mutable2 = function(mutable.clone());
        System.out.println(mutable.getString2());

        final MutableObject mutable3 =new MutableObject();
        mutable3.setInteger(123);


        ImutableObject imutableObject = new ImutableObject();
        imutableObject.getArray()[1]=129;
        System.out.println(imutableObject);
    }
}
