package revature.Day4;

/**
 * exception handling
 * ArithmeticException
 */
public class Demo2 {
    public static void main(String[] args) {

        int a = 20;
        int b = 0;
        int c = 0;

        try {
            c = a / b;
        } catch (ArithmeticException ex) {
            System.out.println("invalid number");
        }
        catch (Exception ex) {
            System.out.println("exception occur");
        }
        System.out.println(c);

    }
}

