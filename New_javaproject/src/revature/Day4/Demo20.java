package revature.Day4;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * linkedList
 * add and print (iterator)
 */
public class Demo20 {
    public static void main(String[] args) {

        LinkedList<String> names= new LinkedList<>();
        names.add("Mark");
        names.add("Paul");
        names.add("Watson");

        Iterator iterator = names.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }

}
