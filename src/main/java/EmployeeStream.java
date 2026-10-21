import java.util.*;
import java.util.stream.Collectors;

public class EmployeeStream {


    public static void main(String[] args) {
        Employees e1 = new Employees();
        e1.setName("John");
        e1.setDepartment("Computer Science");
        e1.setSalary(5000);

        Employees e2 = new Employees();
        e2.setName("Johny");
        e2.setDepartment("Computer Science");
        e2.setSalary(20000);

        Employees e3 = new Employees();
        e3.setName("Astha");
        e3.setDepartment("IT");
        e3.setSalary(50000);

        Employees e4 = new Employees();
        e4.setName("foo");
        e4.setDepartment("EC");
        e4.setSalary(1000);

        Employees e5 = new Employees();
        e5.setName("Asha");
        e5.setDepartment("IT");
        e5.setSalary(500000);

        List<Employees> employeesStream = new ArrayList<>();
        employeesStream.add(e1);
        employeesStream.add(e2);
        employeesStream.add(e3);
        employeesStream.add(e4);
        employeesStream.add(e5);


        //Q1. Find the employee who is having highest salary department wise
        employeesStream.stream()
                .collect(Collectors.groupingBy(Employees::getDepartment,
                        Collectors.maxBy(Comparator.comparingDouble(Employees::getSalary))))
                .forEach((key, value) -> System.out.println("Department Name: " + key + " Salary :" +
                        value.get().getSalary()));

        //Q2. Find highest paid employee overall
        Optional<Employees> emp = employeesStream.stream()
                .sorted(Comparator.comparingDouble(Employees::getSalary).reversed())
                .findFirst();
        System.out.println("Employee Name: " + emp.get().getName());

        //another way
        Optional<Employees> emp1=
        employeesStream.stream()
                .max(Comparator.comparingDouble(Employees::getSalary));
        System.out.println("Employee Name: " + emp1.get().getName());

        //Q3. Group employees by department
        employeesStream.stream()
                .collect(Collectors.groupingBy(Employees::getDepartment))
                .entrySet()
                .stream()
                .forEach(entry -> {
                    System.out.println("Department: " + entry.getKey()+ " Employees List : "+ entry.getValue());
                });


        //Q4. Find avg salary department wise
        employeesStream.stream()
                .collect(Collectors.groupingBy(Employees::getDepartment,
                        Collectors.averagingDouble(Employees::getSalary)))
                .entrySet()
                .stream()
                .forEach(entry -> {
                    System.out.println("Department: " + entry.getKey()+ " Average Salary : "+ entry.getValue());
                });
    }
}
