package Student;


import java.util.List;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

public class StudentDemo {

    public static void main(String[] args) {

        StudentClass obj1 = new StudentClass();
        obj1.setName("rajesh");
        List<StudentClass> studentClasses = new ArrayList<>();
        studentClasses.add(obj1);
        studentClasses.add(new StudentClass("rajesh bhardwaj", "+918871131196"));
        studentClasses.add(new StudentClass("rajesh bhardwaj", ""));
        studentClasses.add(new StudentClass("rajesh bhai", ""));
        studentClasses.add(new StudentClass("mohit bhardwaj", ""));
        studentClasses.add(new StudentClass("sonal bhardwaj", ""));
        studentClasses.add(new StudentClass("sonal bhardwaj", "+918871131196"));


        List<String> studentName1 = studentClasses
                .stream()
                .filter(obj -> Objects.nonNull(obj.getPhoneNumber()) && obj.getPhoneNumber().isEmpty())
                .map(x -> {
                    String finalName = "";
                    if (!(Optional.ofNullable(x.getName()).isEmpty() && x.getName().isEmpty())) {
                        String[] nameArr = x.getName().split(" ");
                        finalName = nameArr[0];
                        if (nameArr.length == 2) {
                            finalName = finalName + " " + nameArr[1].substring(0, 1);
                        }
                    }
                    return finalName;
                }).collect(Collectors.toList());

        System.out.println(studentName1);

    }
}
