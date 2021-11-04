package revature.Day2;

public class Demo16 {
    /**
     * using index method
     * @param args
     */
    public static void main(String[] args) {

        String message = "Hello World";
        System.out.println(message.indexOf('o')); // 4
        System.out.println(message.indexOf('o', 5));  // 7
        System.out.println(message.indexOf("ll")); // 2
    }
}
