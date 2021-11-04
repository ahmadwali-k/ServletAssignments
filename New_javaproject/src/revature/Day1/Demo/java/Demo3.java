package revature.Day1.Demo.java;

/**
 * simple order of operation
 */
public class Demo3 {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        System.out.println(a);  // 10
        System.out.println(b); // 20

        System.out.println(a++); // 10
        System.out.println(a); // 11
        System.out.println(++ b); // 21

        //a++
        a = a + 1;

        a += 5;
        // a = a + 5
        System.out.println(a);


    }
}
