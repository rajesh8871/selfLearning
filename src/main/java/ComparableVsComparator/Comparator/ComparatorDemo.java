package ComparableVsComparator.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorDemo {
    public static void main(String[] args) {
        List<Student> objects = new ArrayList<Student>();
        objects.add(new Student(1, "Rajesh"));
        objects.add(new Student(2, "Mukesh"));
        objects.add(new Student(0, "Sonal"));
        objects.forEach(System.out::println);

        Collections.sort(objects, new CompareById());
        objects.forEach(System.out::println);

        Collections.sort(objects, new CompareByName());
        objects.forEach(System.out::println);
    }
}

