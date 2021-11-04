package revature.Day2;

interface IEmployee{
    void print();
    // an interface can not have the implementation for the methods
}

class Z{

}
/**
 * example showing interface
 */
class Employee1 implements IEmployee{

    //if a class inherit from an interface, it must provide an implementation for all interface members
    @Override
    public void print() {
        System.out.println("interface print method");
    }

    public void test(){

    }
}

public class Demo26 {
    public static void main(String[] args) {
        Employee1 emp = new Employee1();
        emp.print();
        emp.test();

        IEmployee iEmployee = new Employee1();

    }
}
