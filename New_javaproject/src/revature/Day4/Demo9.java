package revature.Day4;

/**
 * Exception handling
 * demonstrating ArrayIndexOutOfBoundException
 *
 * Throwable -> Exception -> RuntimeException -> IndexOutOfBound -> ArrayIndexOutOfBoundException
 * */

public class Demo9 {
    public static void main(String[] args) {
        int[] a = new int[3];
        a[0] = 10;
        a[1] = 20;
        a[2] = 30;

        try{
            System.out.println(a[5000]);
        }catch (ArrayIndexOutOfBoundsException ex){
            System.out.println(ex.getMessage());
        }


    }
}

