package DAO;
//import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
public class JDBCgetConnection {
    public static Connection getConnection() {
        final String url = "jdbc:jtds:sqlserver://DESKTOP-JPON6UV:1433/Manager_Hotel";
        try{
            Class.forName("net.sourceforge.jtds.jdbc.Driver");
            return DriverManager.getConnection("jdbc:jtds:sqlserver://DESKTOP-JPON6UV:1433/Manager_Hotel");
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JDBCgetConnection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(JDBCgetConnection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        return null;
    }
    public static void main(String []args){
        Connection con = JDBCgetConnection.getConnection();
        if(con != null)
            System.out.println("Co");
        else
            System.out.println("Ko");
    }
}
