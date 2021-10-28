package revature;

abstract class Marks {

    public abstract void getPercentage();
}

class A extends Marks {
    public double sub1;
    public double sub2;
    public double sub3;

    public A(int sub1, int sub2, int sub3) {
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
    }
    @Override
    public void getPercentage() {

        double percentage = ((sub1 + sub2 + sub3)/300) * 100;

        System.out.println("The percentage of Student A is: " + percentage);

    }
}

class B extends Marks {

    public double sub1;
    public double sub2;
    public double sub3;
    public double sub4;

    public B(int sub1, int sub2, int sub3, int sub4) {
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
        this.sub4 = sub4;
    }
    @Override
    public void getPercentage() {

        double percentage = ((sub1 + sub2 + sub3 + sub4) / 400) * 100;
        System.out.println("the percentage for student B is: " + percentage);
        // return percentage of the student
    }
}
class Main3 {
    public static void main(String[] args) {
        A a = new A(90, 89, 78);
        a.getPercentage();
        B b = new B(99, 78, 56, 75);
        b.getPercentage();

    }
}