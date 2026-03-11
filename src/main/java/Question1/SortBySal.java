package Question1;

import java.util.Comparator;

public class SortBySal implements Comparator<EmployeeDemo> {

    @Override
    public int compare(EmployeeDemo obj1, EmployeeDemo obj2) {
        if (obj1.getSalary() > obj2.getSalary())
            return 1;
        else if (obj1.getSalary() < obj2.getSalary())
            return -1;
        else
            return 0;
    }
}
