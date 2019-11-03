
package bankmanagement;


import java.sql.*;


public class JavaConnect  {
    
    public static Connection Connect() throws Exception
    {
        String url="jdbc:mysql://bank.csclqpfkuqdr.us-east-2.rds.amazonaws.com:3306/bank";
        String uname="root";
        String pass="rootpasswordjayesh";
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection(url,uname,pass);
        return con;
    }
}





// bank.csclqpfkuqdr.us-east-2.rds.amazonaws.com  jdbc:mysql://bank.csclqpfkuqdr.us-east-2.rds.amazonaws.com:3306/?user=root