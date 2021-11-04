package revature.Day2;

/**
 * inheritance
 * code demonstrates that a child could use parents attributs and methods
 * but a parent can not use childs attributes and methods
 */
class Parent{
    public Parent(){
        System.out.println("Parent constructor");
    }

    public void test1(){
        System.out.println("Parent - method");
    }
}

class Child extends Parent{
    public Child(){
        System.out.println("Child constructor");
    }

    public void test2(){
        System.out.println("Child - method");
    }
}

public class Demo6 {
    public static void main(String[] args) {
        //Parent parent = new Parent();
//        Child child = new Child();
//        child.test1();
//        child.test2();

        Parent parent = new Parent();
        parent.test1();
    }
}
