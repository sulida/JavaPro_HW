package practice18092023;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TaskEx {
    //    Переберите все ключи и значения в HashMap и TreeMap и выведите их на экран.
    public void iterMap(HashMap<Integer, String> hashMap, TreeMap<Integer, String> treeMap) {
        for (Map.Entry<Integer, String> h : hashMap.entrySet()) {
            System.out.println("Key " + h.getKey() + "values : " + h.getValue());
        }
        for (Map.Entry<Integer, String> t : treeMap.entrySet()) {
            System.out.println("Key " + t.getKey() + "values : " + t.getValue());
        }
    }

    //    Переберите только ключи в HashMap и TreeMap и найдите сумму их длин.
    public void findSumOfKeysLength(HashMap<String, Integer> hashmap, TreeMap<String, Integer> treemap) {
        int keysLength = 0;
        for (String key : hashmap.keySet()) {
            keysLength += key.length();
        }
        for (String key2 : treemap.keySet()) {
            keysLength += key2.length();
        }
        System.out.println(keysLength);
    }

//    Переберите только значения в HashMap и TreeMap и найдите их среднее значение.

    public void findAverage(HashMap<String, Integer> hashmap, TreeMap<String, Integer> treemap) {
        int sum = 0;
        int count = 0;
        for (Integer value : hashmap.values()) {

            sum += value;
            count++;
        }
        for (Integer value2 : treemap.values()) {
            sum += value2;
            count++;
        }
        double avValue = sum / count;
        System.out.println(avValue);
    }
//    Переберите HashMap и найдите ключ с максимальным значением.
//    Переберите TreeMap и найдите ключ с минимальным значением.
//    Переберите HashMap и удалите все элементы с четными значениями.
//    Переберите TreeMap и удалите все элементы с ключами, начинающимися с буквы 'A'.
//    Переберите TreeMap и найдите наибольший ключ, который меньше или равен заданному ключу.
//**Переберите HashMap и найдите ключ с максимальной суммой значений в его вложенных HashMap: HashMap<String, HashMap<String, Integer>> nestedHashMap = new HashMap<>();
}
