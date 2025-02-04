package Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRULinkedHashMapImpl<K, V> extends LinkedHashMap<K, V> {

    private final int capacity;

    // Constructor with initialCapacity, loadFactor, and accessOrder
    public LRULinkedHashMapImpl(int capacity) {
        super(capacity, 0.75f, true);
        this.capacity = capacity;
    }

    // Override removeEldestEntry to enforce LRU behavior
    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > capacity;
    }

    public static void main(String[] args) {
        // Create an LRU cache with capacity 3
        LRULinkedHashMapImpl<Integer, String> map = new LRULinkedHashMapImpl<>(3);

        // Add entries to the map
        map.put(1, "Jetha");
        map.put(2, "Sundar");
        map.put(3, "Bagha");

        System.out.println(map);  // {1=Jetha, 2=Sundar, 3=Bagha}

        // Update an existing entry
        map.put(1, "Manoj");

        System.out.println(map);  // {2=Sundar, 3=Bagha, 1=Manoj}

        // Access an entry to update its position in the LRU order
        map.get(2);

        System.out.println(map);  // {3=Bagha, 1=Manoj, 2=Sundar}

        // Add a new entry to trigger the removal of the eldest entry
        map.put(4, "New Entry");

        System.out.println(map);  // {1=Manoj, 2=Sundar, 4=New Entry}
    }
}