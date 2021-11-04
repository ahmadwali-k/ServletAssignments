package revature.Day2;

abstract class Calculator3 {
    /**
     * implementation of abstraction
     * abstract class and methods
     * @param num1
     * @param num2
     */
    // abstract class contains abstract and non abstract methods
    // non abstract method
    public void addNumber(int num1, int num2) {
        System.out.println("Sum: " + (num1 + num2));
    }

    public void subNumber(int num1, int num2) {
        System.out.println("Sub: " + (num1 - num2));
    }

    // abstract method
    // an abstract method can not have the body or implementation
    public abstract void mulNumber(int num1, int num2);

    public abstract void divNumber(int num1, int num2);
}

class Output extends Calculator3 {

    // a non abstract class derived from abstract class must provide the implementation of the methods
    @Override
    public void mulNumber(int num1, int num2) {
        System.out.println("Mul: " + (num1 * num2));
    }

    @Override
    public void divNumber(int num1, int num2) {
        System.out.println("Div: " + (num1 / num2));
    }
}

public class Demo23 {
    public static void main(String[] args) {
        // abstract class is considered as incomplete hence we can not create an instance of abstract class.
        Output obj = new Output();
        obj.addNumber(200, 100);
        obj.subNumber(200, 100);
        obj.mulNumber(200, 100);
        obj.divNumber(200, 100);


    }
}

