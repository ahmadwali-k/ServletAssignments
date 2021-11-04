package revature.Day1.Demo.java;

/**
 * another example of switch-statement
 * this time using string instead of int
 */
public class Demo8 {
    public static void main(String[] args) {
        String number = "One";
        switch (number){
            case "One":
                System.out.println(1);
                break;
            case "Two":
                System.out.println(2);
                break;
            case "Three":
                System.out.println(3);
                break;
            default:
                System.out.println("not a valid number");
        }

    }
}
