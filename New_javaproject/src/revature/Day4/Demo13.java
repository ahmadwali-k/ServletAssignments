package revature.Day4;

/**
 * Exception handling
 * to demonstrate that we can have multiple try and catch blocks
 * with nested try-catch, try with finally and without catch
 */
public class Demo13 {
    public static void main(String[] args) {
        // 1st
        try{

        }catch (Exception e){

        }

        // 2nd
        try{

        }catch (ArithmeticException ex){

        }catch (Exception e){

        }

        // 3rd
        try{
            try{

            }catch (Exception e){

            }
        }catch (Exception e){

        }

        //4th
        try{
            System.out.println("something");
        }finally {

        }

        // 5th
//        catch (Exception e){
//
//        }

    }
}

