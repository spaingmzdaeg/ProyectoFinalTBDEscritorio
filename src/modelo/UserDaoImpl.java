/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import conexionBD.ConexionBD;
import conexionBD.ConexionBD2;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Chente
 */
public class UserDaoImpl implements IUserDAO {

   
    
    @Override
    public boolean registrar(User user) {
        
        boolean finalizo;
        
        try {
            
            PreparedStatement mPreparedStatement = ConexionBD2.getConnection().prepareStatement("INSERT INTO CHENTE.USERS VALUES (?,?,?,?,?,?,?,?,?)");
            mPreparedStatement.setInt( 1, user.getUser_id());
            mPreparedStatement.setString(2, user.getEmail());
            mPreparedStatement.setString(3,user.getPassword());
            mPreparedStatement.setString(4, user.getFirst_name());
            mPreparedStatement.setString(5, user.getLast_name());
            mPreparedStatement.setString(6, user.getAddress());
            mPreparedStatement.setString(7, user.getPerformance_factor());
            mPreparedStatement.setString(8, user.getCellphone());
            mPreparedStatement.setInt(9, user.getPayment_id());
            
            mPreparedStatement.executeUpdate();
            finalizo = true;
            mPreparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
            finalizo = false;
        }
        return finalizo;
        
    }

    @Override
    public List<User> obtener() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean actualizar(User user) {
        boolean actualizado;
        String sql = "UPDATE CHENTE.USERS SET " +
                "user_id = ?, " +
                "email = ?, " +
                "password = ?, " +
                "first_name = ?, " +
                "last_name = ?, " +
                "address = ? ," +
                "performance_factor = ? ,"+
                "cellphone = ? ,"+
                "payment_id = ? " +
                "WHERE user_id = ?";

        try {
            PreparedStatement preparedStatement = ConexionBD2.getConnection().prepareStatement(sql);
            preparedStatement.setInt( 1, user.getUser_id());
            preparedStatement.setString(2, user.getEmail());
            preparedStatement.setString(3, user.getPassword());
            preparedStatement.setString(4, user.getFirst_name());
            preparedStatement.setString(5, user.getLast_name());
            preparedStatement.setString(6,user.getAddress());
            preparedStatement.setString(7,user.getPerformance_factor());
            preparedStatement.setString(8,user.getCellphone());
            preparedStatement.setInt(9,user.getPayment_id());
            preparedStatement.setInt( 10, user.getUser_id());
           
            
            //preparedStatement.execute();
            preparedStatement.executeUpdate();
            actualizado = true;
            preparedStatement.close();

        }catch (SQLException e){
            e.printStackTrace();
            actualizado = false;
        }


        return actualizado;
    }

    @Override
    public boolean eliminar(User user) {
        boolean eliminado;
        String sql = "DELETE FROM CHENTE.USERS WHERE user_id= '"+user.getUser_id()+"'";
        try {
            PreparedStatement preparedStatement = ConexionBD2.getConnection().prepareStatement(sql);
            //preparedStatement.execute();
            preparedStatement.executeUpdate();
            eliminado = true;
            preparedStatement.close();

        }catch (SQLException e){
            e.printStackTrace();
            eliminado = false;
        }

        return eliminado;
    }

    @Override
    public boolean buscar(String id) {
        
        User user = null;
        String sql = "SELECT * FROM CHENTE.USERS WHERE user_id= '"+id+"'";
        boolean encontro = false;
        try {
            PreparedStatement preparedStatement = ConexionBD2.getConnection().prepareStatement(sql);
            encontro = true;

          

                preparedStatement.close();

        }
        catch (SQLException e){
            encontro = false;
            e.printStackTrace();

        }
        return encontro;
    }

    @Override
    public User obtenerusuario(String id) {
      ResultSet resultSet;
        User user = null;
        String sql = "SELECT * FROM CHENTE.USERS WHERE user_id= '"+id+"'";
        try {
            PreparedStatement preparedStatement = ConexionBD2.getConnection().prepareStatement(
                    sql,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
            resultSet = preparedStatement.executeQuery();

            resultSet.last();
                user = new User();
                user.setUser_id(resultSet.getInt(1));
                user.setEmail(resultSet.getString(2));
                user.setPassword(resultSet.getString(3));
                user.setFirst_name(resultSet.getString(4));
                user.setLast_name(resultSet.getString(5));
                user.setAddress(resultSet.getString(6));
                user.setPerformance_factor(resultSet.getString(7));
                user.setCellphone(resultSet.getString(8));
                user.setPayment_id(resultSet.getInt(9));
                
       

                preparedStatement.close();

        }
        catch (SQLException e){
            e.printStackTrace();

        }
        return user;  
    }

    @Override
    public boolean consultar(String consulta, JTable tabla) {
        boolean completo = false;

     
        ResultSet rs;
        User user = null;
        String sql = consulta;
        
        String cadenaRegreso;

        cadenaRegreso = sql.substring(6, sql.length());
        
        int indice = cadenaRegreso.indexOf("F");
        
         cadenaRegreso = cadenaRegreso.substring(0, indice);
         
         String columnas[] = cadenaRegreso.split(",");
         Object columnasModelo[] = new Object[columnas.length];
         System.out.println(Arrays.toString(columnas));
         
         for(int i = 0;i<columnasModelo.length;i++){
         columnasModelo[i] = columnas[i];
         }
        DefaultTableModel modelo = new DefaultTableModel();


        modelo.setColumnIdentifiers(columnasModelo);
        System.out.println(modelo.getColumnCount());
        
        

        try{
            PreparedStatement preparedStatement = ConexionBD2.getConnection().prepareStatement(sql
                    );
            
            rs = preparedStatement.executeQuery();
            while(rs.next()){
              modelo.addRow(new Object[]{rs.getString(1),
                        rs.getString(2)
                        
                 });
                completo = true;
            }
            tabla.setModel(modelo);
            preparedStatement.close();

        }catch (Exception e){
            System.out.println(e.getMessage());
            completo = false;
        }
        return  completo;
    }
    
    
    
    
}
