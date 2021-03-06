package revature.Day4;

/**
 * try and catch block with the inclusion of key word finally
 * also used .getMessage()
 */
public class Demo6 {
    public static void main(String[] args) {
        // case 1: exception not occur
        try {
            int c = 10 / 5;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            System.out.println("Case 1: finally called");
        }

        // case 2: exception occur but not handled
        try {
            int c = 20 / 0;
            System.out.println(c);
        }catch (Exception ex){

        }
        finally {
            System.out.println("Case 2: finally called");
        }

        // cse 3: exception occur but handled
        try {
            int c = 20 / 0;
            System.out.println(c);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            System.out.println("Case 3: finally called");
        }
    }
}
