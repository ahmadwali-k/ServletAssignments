package revature.Day3;

/**
 * methods to use with strings
 * substring(),
 * also shows that strings are immutable.
 */
public class Demo10 {
    public static void main(String[] args) {
        String message = "Welcome to java training";
        System.out.println(message.substring(0, 7));  // Welcome

        // Strings are immutable.
        System.out.println("Original message: "+ message);
        System.out.println("SubString starting from index 7: "+ message.substring(7));
        System.out.println("SubString starting from index  0 to 7: "+ message.substring(0, 7));

        String str = new String("Welcome home");
        System.out.println(str);
        System.out.println(str.substring(8));

    }
}
