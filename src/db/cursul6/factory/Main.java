package db.cursul6.factory;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        FactoryList<String> f1 = new FactoryList<>();

        List<String> listString1 = f1.createList(FactoryEnum.LL);
        List<String> listString2 = f1.createList(FactoryEnum.AL);



        System.out.println(listString1);
        System.out.println(listString2);

    }


}
