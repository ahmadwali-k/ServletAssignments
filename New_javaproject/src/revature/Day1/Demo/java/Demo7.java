package revature.Day1.Demo.java;

/**
 * program implementing switch-case statement
 */
public class Demo7 {
    public static void main(String[] args) {
        int number = 4;
        switch (number){
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            default:
                System.out.println("not a valid number");
        }
    }
}
