 
package school.management.system.admin;

/**
 *
 * @author Beamtech
 */
import java.sql.*;
import javax.swing.JOptionPane;
public class dbConfig {
 public Connection con;
 public ResultSet rs;
 private final String path="jdbc:mysql://";
 private String database = "localhost:3306/wayward";
 private String username = "root";
 private String password = "";
 private String driver = "com.mysql.jdbc.Driver";
 
 public dbConfig(){
    
     try{
     Class.forName(driver);
     con=DriverManager.getConnection(path+database, username, password);
     }catch(Exception e){
         JOptionPane.showMessageDialog(null,"The followingerror occured "+e);
     }
    
 }
  public  static void main(String [] args){
     new dbConfig();   
     }
}
