package conexionBD;
import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;






/**
 *
 * @author Chente
 */
public class ConexionBD {
    private static ConexionBD instance;

    private Connection connection;

    private String url = "jdbc:db2://localhost:50000/DB_SPS";

    private String username = "chester";

    private String password = "chesterf51997";
    
   //pueder ser privado
    private ConexionBD() throws SQLException {

        try {

            Class.forName("com.ibm.db2.jcc.DB2Driver");

            this.connection = DriverManager.getConnection(url, username, password);

        } catch (ClassNotFoundException ex) {

            System.out.println("Database Connection Creation Failed : " + ex.getMessage());

        }

    }
    
    public Connection getConnection() {

        return connection;

    }



    public static ConexionBD getInstance() throws SQLException {

        if (instance == null) {

            instance = new ConexionBD();

        } else if (instance.getConnection().isClosed()) {

            instance = new ConexionBD();

        }



        return instance;
}
    
     /*public static void main(String args[]){
        try {
            ConexionBD x = new ConexionBD();
            x.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
        }*/
    
    
}
