package db.cursul4.lambda;

import java.util.*;
import java.util.stream.Collectors;

public class MyListExamples {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 2, 3, null, 4, 5, null);
        List<Integer> integerWithouNulls = integerList.parallelStream()
                .filter(Objects::nonNull)
                .collect(Collectors.toList());
        System.out.println(integerList);
        System.out.println(integerWithouNulls);

        List<Integer> simpleStream = integerWithouNulls.stream()
                .filter(x -> (x >= 3))
                .collect(Collectors.toList());

        Set<Integer> setStream = integerWithouNulls.stream()
                .filter(x -> (x >= 3))
                .collect(Collectors.toSet());

//        List<Student> students = new ArrayList<>();
//        students.add(new Student("Rares", 10));
//        students.add(new Student("Ana", 10));
//        students.add(new Student("Mihai", 10));
//        students.add(new Student("Gigel", 4));
//
//        Set<Student> studentStream = students.stream()
//                .filter((x, y) -> (x.getGrade() >= 3) && )
//                .collect(Collectors.toSet());

        System.out.println(simpleStream);
        System.out.println(setStream);
    }
}
