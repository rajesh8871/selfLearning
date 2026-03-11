package ParallelVsStreamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Demo {
    public static void main(String[] args) {
        long start;
        long end;
        List<Employee> objects = new ArrayList<Employee>();
        for (int i = 0; i <= 44444444; i++)
            objects.add(new Employee(i, "John" + i, 2000 + i));

        start = System.currentTimeMillis();
        double asDouble = objects.stream().map(Employee::getSalary).mapToDouble(i -> i).average().getAsDouble();
        end = System.currentTimeMillis();
        System.out.println("Average: " + asDouble + " Time using single stream: " + (end - start));

        System.out.println("==============================");


        start = System.currentTimeMillis();
        double asDouble1 = objects.parallelStream().map(Employee::getSalary).mapToDouble(i -> i).average().getAsDouble();
        end = System.currentTimeMillis();
        System.out.println("Average: " + asDouble1 + "Time using parallel stream: " + (end - start));

        Stream.of("a", "b", "c", "d").map(i -> i.toUpperCase()).forEach(System.out::println);
    }
}
