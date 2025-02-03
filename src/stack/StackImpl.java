package stack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class StackImpl {

//    LIFO Structure: Stack follows the Last-In-First-
//    Out (LIFO) principle, where the last element
//    added is the first one to be removed.
//
//    Inheritance: Stack is a subclass of Vector, which
//    means it inherits all the features of a dynamic
//    array but is constrained by the stack's LIFO
//    nature.

    public static void main(String[] args) {

        Stack<Integer> integers = new Stack<>();

        integers.push(1);
        integers.push(2);
        integers.push(3);

        Integer pop = integers.pop(); // remove and return top ele

        Integer peek = integers.peek(); // return top ele do not remove

//        you can also implement Stack using LinkedList

        LinkedList<Integer> stack = new LinkedList<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        Integer pop1 = stack.pop();
        Integer peek1 = stack.peek();

        System.out.println(stack);

        int size = stack.size();
        boolean empty = stack.isEmpty();


//        Stack-Specific Methods:
//        push(E item)
//
//        Description: Adds an element to the top of the stack.
//
//                Time Complexity: O(1) amortized (average O(1); worst-case O(n) during resize).
//
//        pop()
//
//        Description: Removes and returns the top element.
//
//        Time Complexity: O(1) (no element shifting; simply decrements the size).
//
//        peek()
//
//        Description: Returns the top element without removing it.
//
//                Time Complexity: O(1) (direct access to the last element).
//
//        empty()
//
//        Description: Checks if the stack is empty.
//
//        Time Complexity: O(1) (checks if size == 0).
//
//        search(Object o)
//
//        Description: Returns the 1-based position of an object from the top.
//
//                Time Complexity: O(n) (linear search through the underlying array).
//
//        Common Inherited Methods from Vector:
//        size()
//
//        Description: Returns the number of elements.
//
//                Time Complexity: O(1).
//
//                isEmpty()
//
//        Description: Synonym for empty().
//
//                Time Complexity: O(1).
//
//                get(int index)
//
//        Description: Accesses an element by index.
//
//                Time Complexity: O(1) (array-backed).
//
//                add(E e)
//
//        Description: Appends an element (similar to push, but part of Vector).
//
//                Time Complexity: O(1) amortized.
//
//                remove(int index)
//
//        Description: Deletes an element at a specific position.
//
//                Time Complexity: O(n) (requires shifting elements).
//
//        This format should make it easier to distinguish between Stack-specific methods and inherited methods from Vector, and you can copy-paste it for your reference. Let me know if you need further clarification!
//
//                this is good but numbers I can not copy
//        Got it! Here's the version without numbers, making it easier for you to copy-paste:
//
//        Stack-Specific Methods:
//        push(E item)
//
//        Description: Adds an element to the top of the stack.
//
//                Time Complexity: O(1) amortized (average O(1); worst-case O(n) during resize).
//
//        pop()
//
//        Description: Removes and returns the top element.
//
//        Time Complexity: O(1) (no element shifting; simply decrements the size).
//
//        peek()
//
//        Description: Returns the top element without removing it.
//
//                Time Complexity: O(1) (direct access to the last element).
//
//        empty()
//
//        Description: Checks if the stack is empty.
//
//        Time Complexity: O(1) (checks if size == 0).
//
//        search(Object o)
//
//        Description: Returns the 1-based position of an object from the top.
//
//                Time Complexity: O(n) (linear search through the underlying array).
//
//        Common Inherited Methods from Vector:
//        size()
//
//        Description: Returns the number of elements.
//
//                Time Complexity: O(1).
//
//        isEmpty()
//
//        Description: Synonym for empty().
//
//                Time Complexity: O(1).
//
//       get(int index)
//
//        Description: Accesses an element by index.
//
//                Time Complexity: O(1) (array-backed).
//
//        add(E e)
//
//        Description: Appends an element (similar to push, but part of Vector).
//
//                Time Complexity: O(1) amortized.
//
//       remove(int index)
//
//        Description: Deletes an element at a specific position.
//
//                Time Complexity: O(n) (requires shifting elements).

    }

}
