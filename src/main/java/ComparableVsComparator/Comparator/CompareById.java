package ComparableVsComparator.Comparator;

import java.util.Comparator;

public class CompareById implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
//        if (o1.getId() > o2.getId())
//            return 1;
//        else if (o1.getId() < o2.getId())
//            return -1;
//        else
//            return 0;
        return Integer.compare(o1.getId(), o2.getId());
    }

}
