package revature.Day2;

class Calculation{
    /**
     * simple Overloading example
     */
    public void test(){
        System.out.println("1st method");
    }

    public void test(int a){
        System.out.println("2nd method");
    }

    public void test(String b){
        System.out.println("3rd method");
    }

    public void test(int a, String b){
        System.out.println("4th method");
    }

    public void test(String a, int b){
        System.out.println("5th method");
    }

//    public int test(){
//        return 10;
//    }
}

public class Demo17 {
    public static void main(String[] args) {
    Calculation calculation = new Calculation();
    calculation.test();
    calculation.test(12);
    calculation.test("");
    calculation.test(12, "");

    }
}
