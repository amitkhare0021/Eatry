package db;
import java.sql.*;
import javax.swing.JOptionPane;
public class DbConnect {
    public static Connection c;
    public static Statement st;
    static{
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","eatrydb","eatrydb");
            st=c.createStatement();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public static void closeConnection() {
        try{
            c.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
