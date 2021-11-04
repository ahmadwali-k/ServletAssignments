package revature.Day4;

/**
 * Exception Handling
 * demonstrating NullPointerException
 * throws NullPointerException b/c str2 is pointing at null.
 *
 * Throwable -> Exception -> RunTimeException -> NullPointerException
 * */

class Customer{
    public void display(){
        System.out.println("displaying...");
    }
}

public class Demo10 {
    public static void main(String[] args) {
        String str = "Mark";
        System.out.println(str.length());

        String str2 = null;
        try{
            System.out.println(str2.length());
        }catch (NullPointerException ex){
            System.out.println(ex.getMessage());
        }

        Customer customer = new Customer();
        customer.display();

        //??
        Customer customer1 = null;
        customer1.display();
    }
}

