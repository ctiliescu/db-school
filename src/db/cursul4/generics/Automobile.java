package db.cursul4.generics;

public class Automobile {

    protected String type = "automobile";

    public String getType() {
        return type;
    }

    static class Dacia extends Automobile {

        public Dacia() {
            type = "Dacia";
        }



    }
    static class BMW extends Automobile {
        public BMW() {
            type = "BMW";
        }
    }
}
