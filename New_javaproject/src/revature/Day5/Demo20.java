package revature.Day5;

import java.io.File;

/**
 * to look for a file within a file?
 */
public class Demo20 {
    public static void main(String[] args) {
        File file = new File("db", "first.txt");
        file.delete();
        System.out.println(file.exists());
    }
}

