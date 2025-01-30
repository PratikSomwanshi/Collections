package arraylist;


import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ArrayListImpl {

    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);


        for(int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }

        for(int i : arr){
            System.out.println(i);
        }

        System.out.println(arr.contains(10)); // false

        Integer removedElement = arr.remove(1); // takes index in param and o/p 2


        arr.add(1, 10);   // .add( index,  element ); add ele to indexed position

        arr.set(1, 1); // .set( index, element ); replace ele to indexed position

//      Internal working
//        Unlike a regular array, which has a fixed size,
//        an ArrayList can grow and shrink as elements
//        are added or removed. This dynamic resizing
//        is achieved by creating a new array when the
//        current array is full and copying the elements
//        to the new array.

//        Internally, the ArrayList is implemented as an
//        array of Object references. When you add
//        elements to an ArrayList, you're essentially
//        storing these elements in this internal array.


//        When you create an ArrayList, it has an initial
//        capacity (default is 10). The capacity refers
//        to the size of the internal array that can hold
//        elements before needing to resize.

//        Adding Elements
//        When we add an element to an ArrayList, the following steps occur
//
//        Check Capacity: Before adding the new element, ArrayList checks if
//        there is enough space in the internal array (elementData). If the array is
//        full, it needs to be resized.
//
//        Resize if Necessary: If the internal array is full, the ArrayList will create
//        a new array with a larger capacity (usually 1.5 times the current
//        capacity) and copy the elements from the old array to the new array.
//
//        Add the Element: The new element is then added to the internal array at
//        the appropriate index, and the size is incremented.


//        Resizing the Array
//
//        . Initial Capacity: By default, the initial capacity is 10. This means the
//          internal array can hold 10 elements before it needs to grow.
//
//        . Growth Factor: When the internal array is full, a new array is created
//          with a size 1.5 times the old array. This growth factor balances
//          memory efficiency and resizing cost.
//
//        · Copying Elements: When resizing occurs, all elements from the old
//          array are copied to the new array, which is an O(n) operation, where
//          n is the number of elements in the ArrayList.

//        Removing Elements
//
//        . Check Bounds: The ArrayList first checks if the index is within the
//          valid range.
//
//        . Remove the Element: The element is removed, and all elements to
//          the right of the removed element are shifted one position to the left
//          to fill the gap.
//
//        . Reduce Size: The size is decremented by 1.


        ArrayList<Integer> brr = new ArrayList<>(2); // in constructor we can provide initial capacity of object array that has default size / capacity of 10;

//        try {
//            Field elementData = ArrayList.class.getDeclaredField("elementData");
//
//            elementData.setAccessible(true);
//
//            Object[] o = (Object[]) elementData.get(brr);
//
//            System.out.println(o.length);
//
//        } catch (NoSuchFieldException e) {
//            throw new RuntimeException(e);
//        } catch (IllegalAccessException e) {
//            throw new RuntimeException(e);
//        }

//        now brr having initial capacity 2 suppose I add three ele

        brr.add(1);
        brr.add(1);
        brr.add(1);

//        now brr capacity will increase with 1.5 which become 2 * 1.5 = 3

//        suppose I removed the all elements then also capacity will be same as 3
//        so it not shrink by default but we can do it using

        brr.trimToSize(); // this will trime capacity to how many elements are present like in these case 0;



//        we can also use Arrays class to create a list

        List<String> list = Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday");

//        but Arrays.asList return a fixed size list so you can not use add or remove operation like any write operation
//        but you can do get and set which does not increase or decrease the capacity or size of list

        List<Integer> integers = List.of(1, 2, 3, 45, 5);

//        this is same as above one but List.of return unmodifiable list where you can not do set opertion as well


        String[] strArray = {"Apple", "Banana", "Kiwi"};

//        ArrayList<String> list1 = Arrays.asList(strArray);  its will give error because it return List
        List<String> list1 = Arrays.asList(strArray);

        List<String> strArray1 = List.of(strArray);


//        but we can convert unmodifiable list to modifiable

        ArrayList<String> strings = new ArrayList<>(strArray1); // this is modifiable list


//        strings.addAll(list1); // we can also add list to list



//        if you want to contert list into array then

        Object[] array = strings.toArray();

//        if you want to convert to type specific array then

        String[] array1 = strings.toArray(new String[0]); // taking 0 sized array is a convention so toArray method create a new array with Strings

//        Sorting

        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(4);
        intList.add(2);
        intList.add(3);


        intList.forEach(System.out::println);

        intList.sort(new CustomIntComparator());

        intList.forEach(System.out::println);

//        Creating comparator with the help of java 8 functional programming

        List<Student> students = new ArrayList<>();

        students.add(new Student("Rohan", 8.9));
        students.add(new Student("John", 8.8));
        students.add(new Student("Bob", 9.9));
        students.add(new Student("Amar", 9.9));
        students.add(new Student("Sam", 7.9));

        Comparator<Student> comparator = Comparator.comparing(Student::getMarks).reversed().thenComparing(s -> {
            System.out.println("get marks: " + s.getMarks());
            return s.getName();
        }); // here .thenComparing only runs when first comparator means getMarks provide two equal object otherwise .thenComparing will be ignored

        students.sort(comparator);

        students.forEach(System.out::println);


    }


}


class CustomIntComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        return o1.compareTo(o2); // compareTo method only available on string which compare o1 with o2 if o1 comes first then it return negative means for ascending order
    }
}