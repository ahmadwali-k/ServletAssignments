package revature.Day1.Demo.java;

/**
 * for loop with if condition
 */
public class Demo14 {
    public static void main(String[] args) {
        for(int i=1;i<10;i++){
            if(i==5){
                System.out.println("break");
                break;
            }
            System.out.println(i);
        }
    }
}

