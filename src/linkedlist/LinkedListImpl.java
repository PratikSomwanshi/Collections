package linkedlist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkedListImpl {

    public static void main(String[] args) {


//        The LinkedList class in Java is a part of the Collection framework and
//        implements the List interface. Unlike an ArrayList, which uses a
//        dynamic array to store the elements, a LinkedList stores its elements
//        as nodes in a doubly linked list. This provides different performance
//        characteristics and usage scenarios compared to ArrayList.

//        A LinkedList is a linear data structure where each element is a separate
//        object called a node. Each node contains two parts:
//
//        Data: The value stored in the node.
//
//        Pointers: Two pointers, one pointing to the next node (next) and the other
//        pointing to the previous node (previous).

//        *** Performance Considerations ***
//
//        LinkedList has different performance characteristics compared to ArrayList:
//
//        Insertions and Deletions: LinkedList is better for frequent insertions and deletions
//        in the middle of the list because it does not require shifting elements, as in
//        ArrayList.
//
//        Random Access: LinkedList has slower random access (get(int index)) compared
//        to ArrayList because it has to traverse the list from the beginning to reach the
//        desired index.
//
//        Memory Overhead: LinkedList requires more memory than ArrayList because
//        each node in a linked list requires extra memory to store references to the next
//        and previous nodes.


        LinkedList<Integer> integers = new LinkedList<>();

        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(5);

//        it has all methods whiiich are in arrayList

        integers.add(6); // add at last

        integers.addFirst(1);
        integers.addLast(7);
        integers.replaceAll(x -> x * 2);




        System.out.println(integers);


        LinkedList<String> strings = new LinkedList<>(Arrays.asList("Jetha", "Sundar", "Bhide"));

        List<String> sundar = List.of("Sundar", "Bhide");

        strings.removeAll(sundar); // ["Jetha"]

//        System.out.println(strings);


//        The time complexities of the methods in Java's LinkedList (a doubly linked list implementation) are as follows:
//
//        *** O(1) Time Complexity ***
//        Adding Elements:
//
//        add(E e) / addLast(E e): Appends to the end.
//
//        addFirst(E e): Prepends to the start.
//
//        offer(E e), offerFirst(E e), offerLast(E e): Queue/Deque operations to add elements.
//
//        Removing Elements:
//
//        remove() / removeFirst(): Removes the first element.
//
//        removeLast(): Removes the last element.
//
//        poll(), pollFirst(), pollLast(): Queue/Deque operations to remove elements.
//
//        Accessing Ends:
//
//        getFirst(), getLast(), peek(), peekFirst(), peekLast(): Retrieves head/tail without removal.
//
//        Stack Operations:
//
//        push(E e) (adds to head), pop() (removes head).
//
//        Miscellaneous:
//
//        size(): Returns the current list size.
//
//        element(): Retrieves the head (throws if empty).
//
//        *** O(n) Time Complexity ***
//        Indexed Access:
//
//        get(int index), set(int index, E element): Traverses to the specified index.
//
//                Search Operations:
//
//        contains(Object o), indexOf(Object o), lastIndexOf(Object o): Scans the entire list.
//
//        Indexed Modifications:
//
//        add(int index, E element): Inserts at position index.
//
//        remove(int index): Removes the element at index.
//
//        Object-Based Removal:
//
//        remove(Object o), removeFirstOccurrence(Object o), removeLastOccurrence(Object o): Traverses until a match is found.
//
//        Bulk Operations:
//
//        addAll(int index, Collection<? extends E> c): O(n + k), where n is the list size and k is the collection size (traversal + insertion).
//
//                clear(): Iterates to unlink all nodes (O(n) due to GC cleanup).
//
//                List Iterators:
//
//        listIterator(int index): Traverses to index to initialize the iterator.
//
//                O(1) Per Operation, O(n) Overall
//        Iteration:
//
//        iterator(), descendingIterator(): Each next() or previous() is O(1), but full traversal is O(n).
//
//                O(n log n) Time Complexity
//        Sorting:
//
//        sort(Comparator<? super E> c): Uses TimSort (converts to array, sorts, and rebuilds the list).
//
//        Other Operations
//        Conversion:
//
//        toArray(), toArray(T[] a): O(n) to copy elements.
//
//                Cloning:
//
//        clone(): O(n) for a shallow copy.
//
//                Bulk Addition:
//
//        addAll(Collection<? extends E> c): O(k) if appended to the end (no traversal needed).


    }

}
