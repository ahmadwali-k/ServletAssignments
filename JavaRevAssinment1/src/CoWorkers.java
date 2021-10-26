import java.util.HashSet;
import java.util.Iterator;

public class CoWorkers {

    public static void main(String[] args) {


        HashSet<String> names = new HashSet<>();

        names.add("knight");
        names.add("chris");
        names.add("mark");
        names.add("watson");

        System.out.println(names);

        HashSet<String> set = new HashSet<>();
        set.add("white");
        set.add("alex");
        names.addAll(set);
        System.out.println(names);
        System.out.println("number of elements " + names.size());

        System.out.println("removing all");

        names.removeAll(names);
        System.out.println(names);


    }
}