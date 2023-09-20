package practice18092023;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        TaskEx taskEx = new TaskEx();
        Map<Integer, String> map = new HashMap<>();
        map.put(34123456, "Mik");
        map.put(34123457, "Nik");
        map.put(34123458, "Jane");
        map.put(34123459, "Paul");
        map.put(34123460, "Anna");
        map.put(34123461, "Alla");
        map.put(34123462, "Vera");

        Map<Integer, String> map_1 = new TreeMap<>();
        map_1.put(34123456, "Mik");
        map_1.put(34123457, "Nik");
        map_1.put(34123458, "Jane");
        map_1.put(34123459, "Paul");
        map_1.put(34123460, "Anna");
        map_1.put(34123461, "Alla");
        map_1.put(34123462, "Vera");

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("Mik",34123456);
        map2.put("Nik",34123457);
        map2.put("Jane",34123458);
        map2.put("Paul",34123459);


        Map<String, Integer> map_3 = new TreeMap<>();
        map_3.put("Mik",34123456);
        map_3.put("Nik",34123457);
        map_3.put("Jane",34123458);
        map_3.put("Paul",34123459);

        System.out.println("1______________");
        taskEx.iterMap((HashMap<Integer, String>) map, (TreeMap<Integer, String>) map_1);
        System.out.println("2______________");
        taskEx.findSumOfKeysLength((HashMap<String, Integer>) map2, (TreeMap<String, Integer>) map_3);
        System.out.println("3______________");
        taskEx.findAverage((HashMap<String, Integer>) map2, (TreeMap<String, Integer>) map_3);

    }
    }

