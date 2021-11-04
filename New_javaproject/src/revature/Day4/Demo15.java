package revature.Day4;
import java.util.ArrayList;

/**
 * ArrayList
 * add, get, set and foreach loop
 */
public class Demo15 {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Mark");
        names.add("Paul");
        names.add("Watson");

        //get
        System.out.println(names.get(1)); // paul
        // set
        names.set(1, "Paul Smith");

        // foreach
        for(String name: names){
            System.out.println(name);
        }

    }
}

