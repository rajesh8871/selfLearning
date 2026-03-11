package Interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DemoSample {


    public static void main(String[] args) {

        List<Students> studentsData = new ArrayList<Students>();
        studentsData.add(new Students(1, "Rajesh", "maths", "20May"));
        studentsData.add(new Students(2, "mukesh", "science", "20May"));
        studentsData.add(new Students(3, "Raj", "maths", "20May"));
        studentsData.add(new Students(4, "sonal", "maths", "20May"));
        List<Students> obj = null;
        studentsData
                .stream()
                .collect(Collectors.toMap(students -> students.getName(), students -> students))
                .entrySet()
                .forEach((x) -> System.out.println(x.getKey() + ", " + x.getValue()));

    }

    /*map<subject, List<students>>*/
}
