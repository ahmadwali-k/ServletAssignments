package revature.Day2;

class Test2{

}

/**
 * static block
 * and the static block is executed before main method
 */
public class Demo14 {

    // static  bloack
    // gets executed before main method
    static {
        System.out.println("static block");
    }

    public static void main(String[] args) {
        System.out.println("Main method");
    }
}
