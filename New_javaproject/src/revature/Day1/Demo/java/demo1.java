package revature.Day1.Demo.java;

/**
 * types of variables
 * static, instance and local
 */
public class demo1 {

    static int z = 100; // static variable
    int x = 10;  // instance variable

    public void addNumber() {
        // static int d = 100; not allowed
        int a = 10;  // local variable
        int b = 20;
    }

    public void foo() {

    }

}
class demo2 {
    public static void main(String[] args) {
        demo1 obj = new demo1();
        obj.addNumber();
    }
}