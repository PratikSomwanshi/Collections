package List.vector;

import java.util.Vector;

public class VectorImpl {

    public static void main(String[] args) {

//        A Vector in Java is a part of the java.util package and is one of the legacy
//        classes in Java that implements the List interface.
//
//        It was introduced in JDK 1.0 before collection framework and is
//        synchronized, making it thread-safe.
//
//        Now it is a part of collection framework.
//
//        However, due to its synchronization overhead, it's generally recommended
//        to use other modern alternatives like ArrayList in single-threaded scenarios.
//        Despite this, Vector is still useful in certain situations, particularly in multi-
//        threaded environments where thread safety is a concern.


//        Key Features of Vector
//        Dynamic Array: Like ArrayList, Vector is a dynamic array that grows automatically
//        when more elements are added than its current capacity.
//
//        Synchronized: All the methods in Vector are synchronized, which makes it thread-safe.
//                This means multiple threads can work on a Vector without the risk of corrupting the
//        data. However, this can introduce performance overhead in single-threaded
//        environments.
//
//        Legacy Class: Vector was part of Java's original release and is considered a legacy
//        class. It's generally recommended to use ArrayList in single-threaded environments
//        due to performance considerations.
//
//        Resizing Mechanism: When the current capacity of the List.vector is exceeded, it doubles
//        its size by default (or increases by a specific capacity increment if provided).
//
//        Random Access: Similar to arrays and ArrayList, Vector allows random access to
//        elements, making it efficient for accessing elements using an index.


//        *** Constructors of Vector ***
//
//        Vector(): Creates a List.vector with an initial capacity of 10.
//
//        Vector(int initialCapacity): Creates a List.vector with a specified initial capacity.
//
//        Vector(int initialCapacity, int capacityIncrement): Creates a List.vector with an initial
//        capacity and capacity increment (how much the List.vector should grow when its capacity
//        is exceeded).
//
//        Vector(Collection <? extends E> c): Creates a List.vector containing the elements of the
//        specified collection.


        Vector<Integer> integers = new Vector<>(3, 5); //   new Vector<>(initialCapacity, capacityIncrement);

        integers.add(2);
        integers.add(3);
        integers.add(4);

        System.out.println(integers.capacity()); // 5

        integers.add(5);

        System.out.println(integers.capacity()); // 8

//        when capacity gets full the capacityIncrement will get add to existing capacity

//        Methods in Vector
//
//          . add(E e): Adds an element at the end.
//          · add(int index, E element): Inserts an element at the specified index.
//          · get(int index): Retrieves the element at the specified index.
//          · set(int index, E element): Replaces the element at the specified index.
//          · remove(Object o): Removes the first occurrence of the specified element.
//          . remove(int index): Removes the element at the specified index.
//          · size(): Returns the number of elements in the List.vector.
//          . isEmpty(): Checks if the List.vector is empty.
//          . contains(Object o): Checks if the List.vector contains the specified element.
//          . clear(): Removes all elements from the List.vector.


//        Internal Implementation of Vector
//
//        Internally, Vector uses an array to store its elements.
//                The size of this array grows as needed when more
//        elements are added. The default behavior is to double
//        the size of the array when it runs out of space. This
//        resizing operation is a costly one, as it requires copying
//        the old elements to the new, larger array.


//        Synchronization and Performance
//
//        Since Vector methods are synchronized, it ensures that only one
//        thread can access the List.vector at a time. This makes it thread-safe
//        but can introduce performance overhead in single-threaded
//        environments because synchronization adds locking and unlocking
//        costs.
//                In modern Java applications, ArrayList is generally preferred over
//        Vector when synchronization isn't required. For thread-safe
//        collections, the CopyOnWriteArrayList or ConcurrentHashMap
//        from the java.util.concurrent package is often recommended
//        instead.



//        1. Vector is a legacy synchronized collection class that
//                implements the List interface.
//        2. It behaves like a dynamic array and grows as needed.
//        3. It provides thread safety but with a performance cost
//        in single-threaded environments.
//        4. In modern applications, ArrayList or concurrent
//        alternatives like CopyOnWriteArrayList are typically
//        preferred over Vector unless thread safety is a
//        priority.

    }

}
