package revature.Day2;

// without static
//class Counter{
//    int count = 0;
//
//    public Counter(){
//        count++; // increment vaule
//        System.out.println(count);
//    }
//}

/**
 * static
 * with the help of key word static we retain (update) the value of count
 * otherwise each time counter is called from main method it will initialize count to 0
 */
class Counter {
    static int count = 0;

    public Counter() {
        count++;
        System.out.println(count);
    }
}

public class Demo11 {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
    }
}