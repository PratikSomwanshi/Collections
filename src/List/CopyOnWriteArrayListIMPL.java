package List;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListIMPL {

    public static void main(String[] args) {

        // "Copy on Write" means that whenever a write operation
// Like adding or removing an element
// instead of directly modifying the existing list
// a new copy of the list is created, and the modification is applied to that copy
// This ensures that other threads reading the list while it's being modified are unaffected.

// Read Operations: Fast and direct, since they happen on a stable list without interference from modifications.
//      Write Operations: A new copy of the list is created for every modification.
//      The reference to the list is then updated so that subsequent reads use this new list.

        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(1);
        arr.add(2);
        arr.add(3);

        for(Integer i : arr){
            System.out.println(i);
            arr.add(10);     // throw ConcurrentModificationException
        }

        CopyOnWriteArrayList<Integer> integers = new CopyOnWriteArrayList<>();

        integers.add(1);
        integers.add(2);
        integers.add(3);


        for(Integer integer : integers) {
            System.out.println(integer);
            integers.add(integer * 2);
        }

//        Step-by-Step Execution
//        Initial State:
//
//        The CopyOnWriteArrayList is created with an empty internal array.
//
//                No modifications have occurred yet.
//
//        Add Operations Before the Loop:
//
//        integers.add(1);:
//
//        A new internal array is created to hold [1].
//
//                Array Copy Count: 1
//
//        integers.add(2);:
//
//        A new internal array is created to hold [1, 2].
//
//        Array Copy Count: 2
//
//        integers.add(3);:
//
//        A new internal array is created to hold [1, 2, 3].
//
//        Array Copy Count: 3
//
//        At this point, the list contains [1, 2, 3], and 3 new internal arrays have been created.
//
//        Iteration and Add Operations Inside the Loop:
//
//        The for loop iterates over the snapshot of the list [1, 2, 3]. This snapshot is created at the start of the iteration and is not affected by modifications during the loop.
//
//                First Iteration:
//
//        integer is 1.
//
//        System.out.println(integer); prints 1.
//
//        integers.add(1 * 2); adds 2 to the list.
//
//                A new internal array is created to hold [1, 2, 3, 2].
//
//        Array Copy Count: 4
//
//        Second Iteration:
//
//        integer is 2.
//
//        System.out.println(integer); prints 2.
//
//        integers.add(2 * 2); adds 4 to the list.
//
//                A new internal array is created to hold [1, 2, 3, 2, 4].
//
//        Array Copy Count: 5
//
//        Third Iteration:
//
//        integer is 3.
//
//        System.out.println(integer); prints 3.
//
//        integers.add(3 * 2); adds 6 to the list.
//
//                A new internal array is created to hold [1, 2, 3, 2, 4, 6].
//
//        Array Copy Count: 6
//
//        After the loop, the list contains [1, 2, 3, 2, 4, 6], and 3 more internal arrays have been created during the loop.
//
//                Total Array Copies
//        Before the loop: 3 add operations → 3 array copies.
//
//        During the loop: 3 add operations → 3 array copies.
//
//        Total Array Copies: 6


    }

}
