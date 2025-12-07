package demo;
import java.sql.*
public class Test3 {
	public static void main() {
  try {
	  Class.forName("com.mysql.cj.jdbc.Driver");
	  Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root","password");
	  
	  Statement stmt = con.createStatement();
	  Strind sql ="INSERT INTO employee VALUES(1,'TRE',76879)";
	  int result = stmt.executeUpdate(sql);
	  
	  System.out.println(result +"record inserted.");
	  con.close();
  }
  catch(Exception e) {
	  e.printStacjTrace();
  }
}
}



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MySQLConnect {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/eduplus";
        String user = "root";
        String password = "YOUR_PASSWORD"; // change to your password
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("Connected Successfully!");

            // Insert data
            String query = "INSERT INTO students (name, age) VALUES (?, ?)";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, "Aniket");
            pst.setInt(2, 24);

            int rows = pst.executeUpdate();
            System.out.println(rows + " record inserted!");

            con.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
