import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamCollections {

    public static void main(String[] args) {
        List<Integer> listObj = Arrays.asList(1, 2, 3, 4, 2, 1, 3, 5, 6, 7, 8, 7);

        //find the duplicates number
        Set<Integer> dupli = listObj
                .stream()
                .distinct()
                .filter(ele -> Collections.frequency(listObj, ele) > 1)
                .collect(Collectors.toSet());
        System.out.println(" Duplicates : " + Arrays.toString(dupli.toArray()));


        //All distinct numbers
        List<Integer> dist = listObj
                .stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println("All Dist: " + Arrays.toString(dist.toArray()));

        //find first duplicate number
        int firstDupe = listObj
                .stream()
                .filter(ele -> Collections.frequency(listObj, ele) > 1)
                .findFirst()
                .orElse(0);
        System.out.println("First Dupe: " + firstDupe);

        //find 2nd last highest duplicate number
        Optional<Integer> secondHighest = listObj
                .stream()
                .filter(ele -> Collections.frequency(listObj, ele) > 1)
                .sorted(Collections.reverseOrder())
                .skip(1)
                .findFirst();

        List<Integer> allNumb = listObj
                .stream()
                .filter(ele -> Collections.frequency(listObj, ele) > 1)
                .sorted(Collections.reverseOrder())
                .collect(Collectors.toList());
        System.out.println("All number: " + allNumb);
        System.out.println("Second Highest: " + secondHighest.orElse(-1));

        //2nd highest distinct number
        Optional<Integer> distSecndHighst = listObj
                .stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();
        System.out.println("second high distinct: " + distSecndHighst.orElse(-1));

        //frequency of words
        List<String> wordStream = Arrays.asList("cat", "dog", "elephant", "dog", "deer", "snake");

       Map<String, Long> wordFreq=  wordStream
                .stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

       System.out.println(wordFreq);

       String name ="employees";
       name.chars().mapToObj(c -> (char) c)
               .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new, Collectors.counting()))
               .entrySet()
               .stream()
               .forEach(ele -> System.out.println(ele+" : "+ele.getValue()));


    }
}
