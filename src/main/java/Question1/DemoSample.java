package Question1;

import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class DemoSample {

    public static void main(String[] args) {
        List<EmployeeDemo> emplList = new ArrayList<>();
        emplList.add(new EmployeeDemo("Rajesh", 30000, 26));
        emplList.add(new EmployeeDemo("Mukesh", 40000, 23));
        emplList.add(new EmployeeDemo("Sonal", 35000, 24));
        emplList.add(new EmployeeDemo("Raj", 30000, 28));

        emplList.stream()
                .sorted(Comparator.comparingDouble(EmployeeDemo::getSalary))
                .collect(Collectors.toList())
                .forEach(System.out::println);

        Runnable obj = () -> {
            System.out.println("Hi");
        };
        Thread obj1 = new Thread(obj);
        obj1.start();

        new Thread(() -> {
            System.out.println("Hi");
        }).start();


        new Thread(() -> {
            System.out.println("ss");
        }).start();

        Runnable runObj =()->{};
        Thread thread = new Thread(runObj);
        thread.start();

    }
}
