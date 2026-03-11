package immutable;

import lombok.ToString;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

@ToString
public final class ImmutableClass {
    private final String name;
    private final int age;

    public String name() {
        return name;
    }

    public int age() {
        return age;
    }

    public Map<Integer, String> objMap() {
        return objMap;
    }

    private final Map<Integer, String> objMap;

    public ImmutableClass(String name, int age, Map<Integer, String> objMap) {
        this.name = name;
        this.age = age;

        this.objMap = objMap.entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

    }

    public static void main(String[] args) {
        Map<Integer, String> objMap = new HashMap<>();
        objMap.put(1, "Rajesh");
        ImmutableClass obj = new ImmutableClass("Rajesh", 26, objMap);
        objMap.put(2, "sonal");
        System.out.println(obj.objMap());
    }
}
