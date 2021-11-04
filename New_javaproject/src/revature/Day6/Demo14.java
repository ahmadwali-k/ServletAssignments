package revature.Day6;

/**
 * singleton
 * use private with constructor
 * call getInstance() method and check to see if the instance is null (so you won't initialize it again on the second run)
 * that way you don't need to instantiate it multiple times and it will return only once.
 */
class Calculation {
    private static Calculation instance = null;
    public int count = 0;

    private Calculation() {
        count++;
        System.out.println("Count: " + count);
        System.out.println("constructor called");
    }

    public static Calculation getInstance() {
        if (instance == null)
            instance = new Calculation();
        return instance;
    }
}

public class Demo14 {
    public static void main(String[] args) {
        Calculation cal1 = Calculation.getInstance();
        Calculation cal2 = Calculation.getInstance();
        Calculation cal3 = Calculation.getInstance();
    }
}
