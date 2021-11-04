package revature.Day2;


class Bike{
    /**
     * final key word with method
     * it cannot be overriden.
     */
    public final void drive(){
        System.out.println("driving...");
    }
}

class Honda extends Bike{
//    @Override
//    public void drive() {
//        System.out.println("driving...");
//    }
}

public class Demo21 {
    public static void main(String[] args) {

    }
}
