package db.cursul3;

public class MutableExample {

    static MutableObject function(MutableObject mutable){
        System.out.println(mutable.getString2());
        mutable.setString2("somethingelse");
        return mutable;
    }

    public static void main(String[] args) {
        MutableObject mutable = new MutableObject();
        function(mutable.clone());
        System.out.println(mutable.getString2());
    }
}
