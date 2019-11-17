/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package conexionBD;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

/**
 *
 * @author Chente
 */
public class ConexionBD2 {
    private static Connection con=null;

    public static Connection getConnection(){
        try {
            if( con == null ){
                String driver="com.ibm.db2.jcc.DB2Driver"; //el driver varia segun la DB que usemos
                String url="jdbc:db2://localhost:50000/DB_SPS";
                String pwd="chesterf51997";
                String usr="chester";
                Class.forName(driver);
                con = DriverManager.getConnection(url,usr,pwd);
                System.out.println("Conection exitosa");
            }

        }catch (ClassNotFoundException | SQLException ex){
            ex.printStackTrace();
        }
        return con;
    }
    
    
}
