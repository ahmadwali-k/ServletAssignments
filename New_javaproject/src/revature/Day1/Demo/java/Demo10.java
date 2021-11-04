package revature.Day1.Demo.java;

/**
 * nested loop
 */
public class Demo10 {
    public static void main(String[] args) {

        for(int i=1;i<=5;i++){
            // remember once inner loop is done j's initial value is implemented on the second run.
            for(int j=1;j<=i; j++){
                System.out.print("* ");
            }
            System.out.println(); // new line
        }

    }
}
