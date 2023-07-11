package java2_project;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCDriver {
    Connection  conn = null;
    public JDBCDriver(){
        try {
            conn =
            DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","root");
            System.out.println("Kết nối database thành công");
        } catch (SQLException ex) {
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
    }
}
