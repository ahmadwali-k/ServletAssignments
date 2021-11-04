package revature.Day8;

import java.sql.*;

public class Demo2 {
    public static void main(String[] args) throws SQLException {
        //Step 1: Load the Driver
        //Class.forName("jdbc:mysql.jdbc.Driver");

        // Step 2: Create Connection Object
        String url = "jdbc:mysql://localhost:3306/revature";
        String username = "root";
        String password = "root";
        Connection connection = DriverManager.getConnection(url, username, password);

        // Step 3: Create Statement Object
        Statement statement = connection.createStatement();

        // Demo1: Create a table
        //String query = "create table student (id INTEGER PRIMARY KEY AUTO_INCREMENT, name CHAR(20), email CHAR(50))";
        //statement.executeUpdate(query);
        //System.out.println("table create successfully");

        // Demo2: Insert data into table
//        String query = "insert into student (name, email) values (?, ?)";
//
//        // ger prepareStatement object
//        PreparedStatement preparedStatement = connection.prepareStatement(query);
//        // set the values in query
//        preparedStatement.setString(1, "Mark Smith");
//        preparedStatement.setString(2, "m@gmail.com");
//        // execute query
//        int rowAffected = preparedStatement.executeUpdate();
//        System.out.println("("+ rowAffected +") rows affected" );

        // Demo3: Update


        // Demo4: Delete


        connection.close();
        if (connection.isClosed())
            System.out.println("connection closed");
        else
            System.out.println("connection open");
    }
}
