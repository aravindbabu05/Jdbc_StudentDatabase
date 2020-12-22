import java.sql.*;
public class DatabaseDao {
private static Connection connection ;
    public static Connection getConnection(){
if(connection ==null){
String url = "jdbc:mysql://localhost/jdbc";
String userName = "root";
String password="@@Aravind1$$";
try{
    Class.forName("com.mysql.jdbc.Driver");
connection=DriverManager.getConnection(url,userName,password);
}
catch (ClassNotFoundException e){
System.out.println("mysqlDriverNotFound");
}
catch (SQLException e)
{    e.printStackTrace();
}
}
return connection ;
}
private DatabaseDao(){
}
}