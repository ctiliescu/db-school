package db.cursul6.sgt;

public class Main {
    public static void main(String[] args) {
        SingletonObject singletonObject1 = SingletonObject.getInstance();
        SingletonObject singletonObject2 = SingletonObject.getInstance();

        System.out.println(singletonObject1 == singletonObject2);
    }
}
