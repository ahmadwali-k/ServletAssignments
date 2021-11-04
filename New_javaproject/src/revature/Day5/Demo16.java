package revature.Day5;

import java.io.File;

/**
 * creates a directory
 */
public class Demo16 {
    public static void main(String[] args) {
        File file = new File("db");
        System.out.println(file.exists());
        file.mkdir();
        System.out.println(file.exists());
    }
}
