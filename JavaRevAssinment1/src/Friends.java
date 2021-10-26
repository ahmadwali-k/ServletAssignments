import java.util.Iterator;
import java.util.LinkedList;

public class Friends {

    public static void main(String[] args) {


        LinkedList<String> names = new LinkedList<>();

        names.add("watson");
        names.add("andrew");
        names.add("michal");
        names.add("corry");

        Iterator iterator = names.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        names.addLast("kahn");
        names.addLast("torry");

        for(String name: names) {
            System.out.println(name);
        }
        Iterator iterator1 = names.iterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }
        System.out.println("------------");
        System.out.println(names.get(2));


        System.out.println();
        System.out.println("in reverse ore");

        Iterator iterator4 = names.descendingIterator();
        while(iterator4.hasNext()){
            System.out.println(iterator4.next());
        }
        System.out.println("adding luck on index 3");
        names.add(3, "lucky");
        System.out.println(names);

    }
}
