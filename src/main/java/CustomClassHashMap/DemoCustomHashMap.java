package CustomClassHashMap;

import java.util.*;

public class DemoCustomHashMap {
    public static void main(String[] args) {


        Map<Employee, String> obj = new HashMap<>();
        obj.put(new Employee(1, "Rajesh"), "Rajesh");
        obj.put(new Employee(1, "Rajesh"), "Rajesh");
        obj.put(new Employee(3, "sonal"), "Bhardwaj");

        obj.forEach((x, y) -> System.out.println("Id: " + x.getEmployeeId() + "  Name:" + x.getEmployeeName()));

        Set<Employee> objSet = new HashSet<>();
        objSet.add(new Employee(1, "Rajesh"));
        objSet.add(new Employee(1, "Rajesh"));
        objSet.add(new Employee(3, "sonal"));

        objSet.stream().forEach(employee -> System.out.println("Id: " + employee.getEmployeeId() + " Employee Name: "
                + employee.getEmployeeName()));


    }
}
