package revature.Day3;

/**
 * StringBuffer and .capacity() method
 */
public class Demo14 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity()); // 16
        sb.append("Hello");
        System.out.println(sb.capacity()); // 16
        sb.append("Welcome to java class");
        System.out.println(sb.capacity());
    }
}

