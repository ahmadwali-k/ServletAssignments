package revature.Day4;

/**
 * throw's EmployeeException
 */
class EmployeeException extends Exception{

}

public class Demo3 {
    public static void main(String[] args) throws EmployeeException {

    //  ArithmeticException ex = new ArithmeticException();
     //   throw ex;

        //throw new ArithmeticException();
        throw new EmployeeException();
    }
}
