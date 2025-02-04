package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapImpl {

    public static void main(String[] args) {

        // Hashmap does not preserve order of insertion

        HashMap<Integer, String> map = new HashMap<>(16, 0.75f); // new HashMap(initialCapacity, loadFactor );

        map.put(1, "jetha");
        map.put(2, "sundar");
        map.put(3, "bagha");

//        System.out.println(map);


        System.out.println(map.get(2)); // sundar


//        System.out.println(map.containsKey(2)); // true

//        System.out.println(map.containsValue("jetha")); // true

        Set<Integer> integers = map.keySet(); // .keySet return all unique keys

//        System.out.println(integers); // [1, 2, 3]

        Set<Map.Entry<Integer, String>> entries = map.entrySet();

        for(Map.Entry<Integer, String> entry: entries){
            System.out.println(entry.getKey() + " : " + entry.getValue());

            if(entry.getKey().equals(2)){
                entry.setValue("daya");
            }
        }

        map.forEach((integer, s) -> System.out.println(integer + " : " + s));


//        Key Characteristics
//
//        Unordered: Does not maintain any order of its elements.
//        Allows null Keys and Values: Can have one null key and multiple null
//        values.
//                Not Synchronized: Not thread-safe; requires external
//        synchronization if used in a multi-threaded context.
//                Performance: Offers constant-time performance (O(1)) for basic
//        operations like get and put, assuming the hash function disperses
//        elements properly.

//        map.remove(2);  // true

//        map.remove(2, "rohan"); // false , data will not be affected because key matches but value not

    }
}
