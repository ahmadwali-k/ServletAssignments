package revature.Day1.Demo.java;

/**
 * simple if-else
 */
public class Demo5 {
    public static void main(String[] args) {
        int score = 40;

        if (score >= 90)
            System.out.println("A Grade");
        else if (score < 90 && score > 75)
            System.out.println("B Grade");
        else if (score < 75 && score > 50)
            System.out.println("C Grade");
        else
            System.out.println("D Grade");
    }
}

