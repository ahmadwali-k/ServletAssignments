import java.util.Iterator;
import java.util.TreeSet;

public class Emprors {

    public static void main(String[] args) {


        TreeSet<String> colors = new TreeSet<>();

        colors.add("red");
        colors.add("green");
        colors.add("blue");
        colors.add("pink");
        colors.add("purple");

        System.out.println(colors);

        for (String name : colors) {
            System.out.println(name);

        }
        TreeSet<String> more = new TreeSet<>();
        more.add("grey");
        more.add("black");

        System.out.println("merging two treeSets");
        colors.addAll(more);
        System.out.println(colors);
        System.out.println("reverse order");
        Iterator iterator = colors.descendingIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("printing first and last element");
        System.out.println("first: " + colors.pollFirst());
        System.out.println("last: " + colors.pollLast());
    }
}