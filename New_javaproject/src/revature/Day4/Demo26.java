package revature.Day4;

import java.util.PriorityQueue;

/**
 * PriorityQueue (PriorityQueue<String> queue = new PriorityQueue<>();)
 * add, print, .element() and .peek() (only shows head), .remove() and .poll() (will show
 * and remove the head)
 *
 */
public class Demo26 {
    public static void main(String[] args) {
        PriorityQueue<String> queue = new PriorityQueue<>();
        queue.add("Mark");
        queue.add("Paul");
        queue.add("Watson");
        queue.add("John");

        for(String name: queue){
            System.out.println(name);
        }

        System.out.println("head: "+ queue.element());
        System.out.println("head: "+ queue.peek());
        System.out.println(queue.remove()); //?
        System.out.println(queue.poll()); //?

        System.out.println("*************");

        for(String name: queue){
            System.out.println(name);
        }



    }
}

