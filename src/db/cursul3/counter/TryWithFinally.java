package db.cursul3.counter;

public class TryWithFinally {
    public static void main(String[] args) {
        try {
            check(0);
            return;
        } catch (OurCustomException e) {
            System.out.println("Check Exception");
        } finally {
            System.out.println("finally");
        }

        System.out.println("last action");
    }

    static class OurCustomException extends Exception {
        public OurCustomException() {
            super("This is OurCustomException");
        }
    }

    public static void check(int n) throws OurCustomException {
        if(n == 0) {
            throw new OurCustomException();
        }
    }
}
