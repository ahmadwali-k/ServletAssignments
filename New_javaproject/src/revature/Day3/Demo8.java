package revature.Day3;

/**
 * anything after quatation marks is treated as
 * a string
 */
public class Demo8 {
    public static void main(String[] args) {
        String str = "Hello" + "World";
        System.out.println(str); // HelloWorld

        String str2 = 10 + 20 + 30 + "Sum" + 40 + 50 + true;
        System.out.println(str2);  //60Sum4050



    }
}

