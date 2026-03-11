package com.rajesh.selflearning.havingBy;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DemoClass {
    public static void main(String[] args) {
        List<StudentClass> studentClassesData = new ArrayList<>();
        studentClassesData.add(new StudentClass("rajesh", 12, "first", new int[]{1, 20, 33}));
        studentClassesData.add(new StudentClass("ra", 12, "first", new int[]{1, 2, 3}));
        studentClassesData.add(new StudentClass("mukesh", 13, "third", new int[]{11, 23, 3}));
        studentClassesData.add(new StudentClass("mohit", 14, "second", new int[]{1, 2, 32}));
        studentClassesData.add(new StudentClass("sonal", 67, "first", new int[]{18, 2, 3}));
        studentClassesData.add(new StudentClass("sameer", 14, "second", new int[]{100, 22, 3}));
        studentClassesData.add(new StudentClass("demo", 14, "third", new int[]{12, 2, 3}));
        studentClassesData.add(new StudentClass("sonal", 67, "fourth", new int[]{1, 2, 30}));

        Map<Integer, List<StudentClass>> obj =
                studentClassesData
                        .stream()
                        .collect(Collectors.groupingBy(StudentClass::getAge));

        System.out.println(obj);
        System.out.println("----------------");
        System.out.println();


        Map<String, Set<String>> OBJJJ = studentClassesData.stream()
                .collect(Collectors.groupingBy(StudentClass::getClassName,
                        Collectors.mapping(StudentClass::getName, Collectors.toSet())));


        Map<Integer, Set<String>> obj1 =
                studentClassesData
                        .stream()
                        .collect(Collectors.groupingBy(StudentClass::getAge,
                                Collectors.mapping(StudentClass::getName, Collectors.toSet())));
        System.out.println(obj1);
        System.out.println("----------------");
        System.out.println();


        Hashtable<Integer, Set<String>> obj2 =
                studentClassesData
                        .stream()
                        .collect(Collectors.groupingBy(StudentClass::getAge,
                                Hashtable::new, Collectors.mapping(StudentClass::getName, Collectors.toSet())));
        System.out.println(obj2);
        System.out.println("----------------");
        System.out.println();

        //this will produce list of studentsClass
        //function, collectors has been used
        Map<String, List<StudentClass>> obj3 = studentClassesData
                .stream()
                .collect(Collectors.groupingBy(StudentClass::getClassName, Collectors.toList()));

        System.out.println(obj3);
        System.out.println("----------------");
        System.out.println();

        //this will produce list of student name
        //function, collectors has been used
        Map<String, Set<String>> obj4 = studentClassesData
                .stream()
                .collect(Collectors.groupingBy(StudentClass::getClassName,
                        Collectors.mapping(StudentClass::getName, Collectors.toSet())));

        System.out.println(obj4);
        System.out.println("----------------");
        System.out.println();

        //this will produce list of student name
        //function, supplier, collectors has been used
        Map<String, Set<String>> obj5 = studentClassesData
                .stream()
                .collect(Collectors.groupingBy(StudentClass::getClassName, TreeMap::new,
                        Collectors.mapping(StudentClass::getName, Collectors.toSet())));

        System.out.println(obj5);
        System.out.println("----------------");
        System.out.println();

        System.out.println("====================================================================");
        System.out.println("====================================================================");

        // Get the List
        List<String> g = Arrays.asList("geeks", "for", "geeks");

        // Collect the list as map
        // by groupingBy() method
        Map<String, Long> result = g
                .stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        // Print the result
        System.out.println(result);
    }
}
