package revature.Day1.Demo.java;

public class Demo11 {
    /**
     * another nested loop (inverted)
     * @param args
     */
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=5;j>=i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
