import java.sql.Connection;
import java.sql.DriverManager;

class App {

public static void main(String[] args){

String url = "jdbc:mysql://localhost:3306/tourism ";

String id = "root";

String pwd ="6006926138";

Connection con;

try {

Class.forName("com.mysql.cj.jdbc.Driver");

con = DriverManager.getConnection(url, id, pwd);

if(con != null){

System.out.println("connected"); }

} catch (Exception e) {

    
        System.out.println(e.getMessage());
    }
}}