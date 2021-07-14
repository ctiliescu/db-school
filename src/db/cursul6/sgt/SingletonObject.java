package db.cursul6.sgt;

public class SingletonObject {
    private static SingletonObject instance;

    private SingletonObject(){
        System.out.println("Constructor Singleton!");
    }

    public static SingletonObject getInstance(){
        if(instance == null){
            instance = new SingletonObject();
        }
        return instance;
    }
}
