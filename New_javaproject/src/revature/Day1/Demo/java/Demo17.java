package revature.Day1.Demo.java;

/**
 * class example with constructor and this operator
 * this operator is used to initialize the variables of this class.
 * in other words, it lets the compiler know that we are talking about variables from Book2 class.
 */
class Book2{
    private String title;
    private String author;
    private int price;

    public Book2(String title, String author, int price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void display(){
        System.out.println("Book: Title = "+ title+", Author = "+ author+ ", Price = "+ price);
    }

}

public class Demo17 {
    public static void main(String[] args) {
        Book2 book1 = new Book2("Title 1", "author 1", 1000);
        book1.display();

        Book2 book2 = new Book2("Title 2","Author 2", 2000);
        book2.display();
    }
}
