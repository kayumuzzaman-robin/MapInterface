package learn.java;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapClass {
    public static void main(String[] args) {
        Map<Integer, String> integerStringMap = new HashMap<>();
        integerStringMap.put(1, "A");
        integerStringMap.put(2, "B");
        integerStringMap.put(4, "D");
        integerStringMap.put(3, "C");
        System.out.println("Map: " + integerStringMap);

//      Convert Hashmap to set for iteration, Direct map can't be itreate
        Set mapToSet = integerStringMap.entrySet();
        System.out.println("Map converted to Set: " + mapToSet);

        for (Object o : mapToSet) {
            System.out.println(o);
        }

        System.out.println();

        for (Map.Entry<Integer, String> element : integerStringMap.entrySet()) {
            System.out.println(element.getKey() + " = " + element.getValue());
        }

        System.out.println();

//      Using stream API + Method Reference
        integerStringMap.entrySet().stream()
                .sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
                .forEach(System.out::println);

        System.out.println("Set of keys: " + integerStringMap.keySet() + " & Set of values" +integerStringMap.values());
    }

}
