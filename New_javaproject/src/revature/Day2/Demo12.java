package revature.Day2;

/**
 * with static method we can call any method
 * without making an instance of it.
 *
 * Calculator2 cal = new Calculator2(); non static
 * cal.addNumber(200, 100); non static
 * Calculator2.subNumber(200, 100); with static method
 */
class Calculator2 {
    // non static method
    public void addNumber(int num1, int num2) {
        System.out.println(num1 + num2);
    }

    // static method
    public static void subNumber(int num1, int num2) {
        System.out.println(num1 - num2);
    }
}

public class Demo12 {
    public static void main(String[] args) {
        Calculator2 cal = new Calculator2(); // non static
        cal.addNumber(200, 100);
        Calculator2.subNumber(200, 100); // static method
    }
}
