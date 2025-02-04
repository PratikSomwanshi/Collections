package Map;

import java.util.LinkedHashMap;

public class LinkedHashMapImpl {

    public static void main(String[] args) {

//        LinkedHashMap preserve the order of insertion

        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();

        map.put(1, "Jetha");
        map.put(2, "Sundar");
        map.put(3, "Bagha");

//        System.out.println(map); // {1=Jetha, 2=Sundar, 3=Bagha}

        map.put(3, "Manoj");

//        System.out.println(map); // {1=Jetha, 2=Sundar, 3=Manoj}

//        if key already preset it will update the record with the help of .hashCode and .equal method of particular object.

        map.get(2); // Sundar
        map.getOrDefault(20, "default"); // default



    }
}
