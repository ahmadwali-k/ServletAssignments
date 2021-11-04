package revature.Day2;

/**
 * confirm
 * good example
 * calling constructors with initialized object to reduce repetitive code
 */

class Car {

    public String name;
    public String brand;
    public String color;
    public String engineType;
    public int price;

    //first parameterized constructor
    public Car(String name, String brand, String color, String engineType, int price) {
        this.name = name;
        this.brand = brand;
        this.color = color;
        this.engineType = engineType;
        this.price = price;
        //System.out.println(name + brand + color + engineType+ price);
    }
    // second constructor
    public Car(Car car){
        this.name = car.name;
        this.brand  = car.brand;
        this.color = car.color;
        this.engineType = car.engineType;
        this.price= car.price;
    }
    // third constructor which updates price
    public Car(Car car, int price){
        this.name = car.name;
        this.brand  = car.brand;
        this.color = car.color;
        this.engineType = car.engineType;
        this.price= price;
    }
}

public class Demo4 {
    public static void main(String[] args) {
        Car car1 = new Car("A6", "Audi", "Black", "Pertrol", 20000);
        Car car2 = new Car(car1);
        Car car3 = new Car(car1, 30000);

    }
}
