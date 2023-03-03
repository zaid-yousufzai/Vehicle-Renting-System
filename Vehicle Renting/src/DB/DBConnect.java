/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DB;
import java.sql.*;

/**
 *
 * @author Hp
 */
public class DBConnect {
    public Connection con;
    public Statement stmt;
    public ResultSet rst;
    public PreparedStatement pstmt;
    
    public DBConnect()
    {
        try
        {
           Class.forName("com.mysql.jdbc.Driver");
           con=DriverManager.getConnection("jdbc:mysql://localhost:3307/vehicle","root","root");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
    
}
