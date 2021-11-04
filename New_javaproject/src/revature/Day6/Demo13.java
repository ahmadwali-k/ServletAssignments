package revature.Day6;

interface IDisplay{
    String message(String str);
}

/**
 * calling the interface in main method
 */
public class Demo13 {
    public static void main(String[] args) {
        IDisplay display = (message) ->{
            String str1 = "Hello ";
            String str2 = message;
            String str3 = ", How are you";
            return str1 + str2+ str3;
        };
        System.out.println(display.message("Mark"));
    }
}

