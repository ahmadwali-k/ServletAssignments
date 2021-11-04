package revature.Day1.Demo.java;

/**
 * ? arg : arg
 * sort of like if else
 * if the conditionis true ? than pick the first argument else pick second argument.
 */
public class Demo6 {
    public static void main(String[] args) {

        int age = 20;

        String result =  age > 18 ? "eligible" : "not eligible";
        System.out.println(result);

        int number = 5;
        String output = (number % 2 == 0) ? "even" : "odd";
        System.out.println(output);

    }
}