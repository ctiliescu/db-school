package db.cursul6.factory;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class FactoryList<T> {

    public  List<T> createList(FactoryEnum e) {

        switch (e) {
            case LL : return new LinkedList<>();
            case AL: return new ArrayList<>();
        }
        return null;
    }


}
