package revature.Day5;

/**
 * conversion from a wrapper class to a primitive
 */
public class Demo24 {
    public static void main(String[] args) {
        // converting integer to int

        Integer a = new Integer(10);
        int b = a.intValue();
        int c = a;

        System.out.println(a + " " + b + " " + c);
    }
}

