package revature.Day4;

/**
 * ArrayList<>
 * how to add, print, iterate. hasNext() method will check the next element and foreach loop
 * will print the elements of array.
 */

import java.util.ArrayList;
import java.util.Iterator;

public class Demo14 {
    public static void main(String[] args) {
        ArrayList<String> mList = new ArrayList<>();

        // how to add into an arrayList
        mList.add("Mark");
        mList.add("Paul");
        mList.add("John");

        // how to print it
        System.out.println(mList);

        // iterator
        Iterator iterator = mList.iterator();
        // hasNext() will check if iterator has the element
        while (iterator.hasNext()) {
            System.out.println(iterator.next()); // print element and move the cursor to the next
        }

        //foreach
        for (String name : mList) {
            System.out.println(name);
        }

    }
}
