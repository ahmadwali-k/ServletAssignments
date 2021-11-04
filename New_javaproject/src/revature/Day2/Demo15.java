package revature.Day2;

class A10{
    /**
     * static block
     * its executed before main method
     */
    static int a;

    // static block executed before main method.
    static {
        a = 20;
        System.out.println(a);
    }

    public void test(){
        a = 30;
        System.out.println(a);
    }

}

public class Demo15 {
    public static void main(String[] args) {
        A10 a1 = new A10();
        a1.test();
    }
}

