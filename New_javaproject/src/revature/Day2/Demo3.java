package revature.Day2;

class Test {

    /**
     * calling different types of constructors
     */
    public Test() {
        System.out.println("first constructor");
    }

    public Test(int x) {
        System.out.println("second constructor");
    }

    public Test(String s) {
        System.out.println("third constructor");
    }

    public Test(int a, String s) {
        System.out.println("fourth constructor");
    }

    public Test(String s, int a) {
        System.out.println("fifth constructor");
    }
}


public class Demo3 {
    public static void main(String[] args) {
        Test t1 = new Test();
        Test t2 = new Test(10);
        Test t3 = new Test("A");
        Test t4 = new Test(1, "A");
        Test t5 = new Test("A", 1);
    }
}
