package learn.java;

import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapClass {
    public static void main(String[] args) {
        SortedMap<Integer, String> treeMap= new TreeMap<>();
        treeMap.put(1, "A");
        treeMap.put(3, "C");
        treeMap.put(2, "B");
        treeMap.put(4, "D");
        System.out.println("TreeMap to Set: " + treeMap.entrySet());

        System.out.println("TreeMap headMap(3): " + treeMap.headMap(3));
        System.out.println("TreeMap tailMap(3): " + treeMap.tailMap(3));
        System.out.println("TreeMap subMap(key 1 to key 4): " + treeMap.subMap(1, 5));

    }
}
