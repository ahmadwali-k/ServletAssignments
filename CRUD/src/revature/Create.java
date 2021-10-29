package revature;


import java.sql.*;
//import java.sql.DriverManager;
import java.sql.Statement;

public class Create {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        //Step 1: Load the Driver
        //Class.forName("jdbc:mysql.jdbc.Driver");

        // if you don't have the jar file.
        // jarfile = file - project structure - modules - dependencies(click +),
        //      search for jarfile(in program86) and add.

        // Step2: create connection object
        String url = "jdbc:mysql://localhost:3306/revature";
        String username = "wali";
        String password = "Loyjirga1";
        Connection connection = DriverManager.getConnection(url, username, password);

        // Step3: Statement Object
        Statement statement = connection.createStatement();

        // Step4: Execute Query
        // CRUD
        //1) create a table
        String query = "create table student (id integer primary key auto_increment, name char(20), email char(20))";
        statement.executeUpdate(query);
        System.out.println("table created successfully. ");

        //2) insert/read table
        query = "insert into student (name, email) values (?, ?)";


        // get prepareStatement object
        PreparedStatement preparedStatement = connection.prepareStatement(query);

        // set the values in query
        preparedStatement.setString(1, "John");
        preparedStatement.setString(2, "j@mail.com");
       // preparedStatement.setString(1, "kah");
       // preparedStatement.setString(2, "K@mail.com");
       // preparedStatement.setString(1, "Mark");
       // preparedStatement.setString(2, "m@mail.com");

        // execute query
        int rowAffected = preparedStatement.executeUpdate();
        System.out.println("(" + rowAffected + ") row affected." );

        // update
        //use where, alter and change the info.
        System.out.println("updating, added a different email");
        query = "update student set email = 'kah@mail.com' where name = 'John'";
        statement.executeUpdate(query);

        // Delete
        System.out.println("deleting from student");
        query = "delete from student where name = 'John'";
        statement.executeUpdate(query);




    }
}
