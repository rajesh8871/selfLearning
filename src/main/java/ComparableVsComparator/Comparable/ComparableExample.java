package ComparableVsComparator.Comparable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ComparableExample implements Comparable<ComparableExample> {
    private int var1;
    private String var2;


    /*Suppose in future you need to compare based on some different field then you
     * need to change the logic in below method, so it's not a dynamic solution as
     * its kind of really implementing your sorting algo.It is kind of hardcoded not
     * dynamic solution,
     * and also it is tightly coupled, We can't sort on multiple field
     * using this*/
    @Override
    public int compareTo(ComparableExample o) {
/*        if (var1 > o.getVar1()) return 1;
        else if (var1 < o.getVar1()) return -1;
        else return 0;*/
        return Integer.compare(var1, o.getVar1());
    }


    public static void main(String[] args) {
        List<ComparableExample> obj = new ArrayList<>();
        obj.add(new ComparableExample(1, "Rajesh"));
        obj.add(new ComparableExample(2, "Sonal"));
        obj.add(new ComparableExample(0, "Mukesh"));

        obj.forEach(x -> System.out.println("id :" + x.getVar1()));

        //now sort the data as we have written compareTo method of interface comparable
        //which will do sorting of data
        //if we remove the comparable interface and overrided method then it will not be
        // able to sort
        Collections.sort(obj);
        obj.forEach(x -> System.out.println("id :" + x.getVar1()));
    }
}
