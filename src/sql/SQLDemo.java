package sql;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
public class SQLDemo {
    public static void main(String[] args) {

        List<Person> personList = new ArrayList<>();

        String url = "jdbc:mysql://localhost:3306/mydb";
        String user = "root";
        String password = "arman";
        try {
            // Open database Connection
            // Connecs JDBC with DB
            Connection myconnection = DriverManager.getConnection(url, user, password);

            // To update the database, we need to create a JDBC statement
            Statement mystatement = myconnection.createStatement();

            String sql = "SELECT * FROM person";
            ResultSet myresultSet = mystatement.executeQuery(sql);
            System.out.println(2);
            while (myresultSet.next()) {
                Person person = new Person();
                person.setPersonId(myresultSet.getInt("UserID"));
                person.setName(myresultSet.getString("Name"));
                person.setSurname(myresultSet.getString("Surname"));
                person.setAge(myresultSet.getInt("Age"));
                person.setCity(myresultSet.getString("City"));
                System.out.println(person);
            }

        } catch (SQLException e) {

            e.printStackTrace();
        }

        System.out.println(personList);
    }
}

/*java.sql.SQLException: No suitable driver found for jdbc:mysql://localhost:3306/mydb
	at java.sql.DriverManager.getConnection(DriverManager.java:689)
	at java.sql.DriverManager.getConnection(DriverManager.java:247)
	at sql.SQLDemo.main(SQLDemo.java:18)
*/
