/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import conexionBD.ConexionBD2;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Chente
 */
public class UserTransactionDaoImpl implements IUserTransactionDAO {

    @Override
    public boolean registrar(UserTransaction ut) {
        boolean finalizo;
        
        try {
            
            PreparedStatement mPreparedStatement = ConexionBD2.getConnection().prepareStatement("INSERT INTO CHENTE.USERTRANSACTION VALUES (?,?,?,?,?,?)");
            mPreparedStatement.setInt( 1, ut.getTransaction_id());
            mPreparedStatement.setInt(2, ut.getUser_id());
            mPreparedStatement.setInt(3,ut.getPayment_id());
            mPreparedStatement.setInt(4, ut.getAmount());
            mPreparedStatement.setString(5, ut.getType());
            mPreparedStatement.setString(6, ut.getComment());
           
            
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
    public UserTransaction obtenertransaccion(String id) {
         ResultSet resultSet;
        UserTransaction ut = null;
        String sql = "SELECT * FROM CHENTE.USERTRANSACTION WHERE transaction_id= '"+id+"'";
        try {
            PreparedStatement preparedStatement = ConexionBD2.getConnection().prepareStatement(
                    sql,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
            resultSet = preparedStatement.executeQuery();

            resultSet.last();
                ut = new UserTransaction();
                ut.setTransaction_id(resultSet.getInt(1));
                ut.setUser_id(resultSet.getInt(2));
                ut.setPayment_id(resultSet.getInt(3));
                ut.setAmount(resultSet.getInt(4));
                ut.setType(resultSet.getString(5));
                  ut.setComment(resultSet.getString(6));
                
                
                
                
       

                preparedStatement.close();

        }
        catch (SQLException e){
            e.printStackTrace();

        }
        return ut;  
    }

    @Override
    public List<UserTransaction> obtener() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean actualizar(UserTransaction ut) {
        boolean actualizado;
        String sql = "UPDATE CHENTE.USERTRANSACTION SET " +
                "transaction_id = ?, " +
                "user_id = ?, " +
                "payment_id = ?, " +
                "amount = ?, " +
                "type = ?, " +
                "comment = ? ";

        try {
            PreparedStatement preparedStatement = ConexionBD2.getConnection().prepareStatement(sql);
             preparedStatement.setInt( 1, ut.getTransaction_id());
            preparedStatement.setInt(2, ut.getUser_id());
            preparedStatement.setInt(3,ut.getPayment_id());
            preparedStatement.setInt(4, ut.getAmount());
            preparedStatement.setString(5, ut.getType());
            preparedStatement.setString(6, ut.getComment());
           
            
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
    public boolean eliminar(UserTransaction ut) {
         boolean eliminado;
        String sql = "DELETE FROM CHENTE.USERTRANSACTION WHERE transaction_id = '"+ut.getTransaction_id()+"'";
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
    public boolean consultar(String consulta, JTable tabla) {
        boolean completo = false;

     
        ResultSet rs;
        UserTransaction ut = null;
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
        
         Object registros[] = new Object [ modelo.getColumnCount()];
         
         try{
            PreparedStatement preparedStatement = ConexionBD2.getConnection().prepareStatement(sql);
            rs = preparedStatement.executeQuery();
            while(rs.next()){
                for(int i = 0;i < registros.length;i++){
                registros[i] = rs.getString(i+1);
                }
                modelo.addRow(registros);
                
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

    @Override
    public boolean buscar(String id) {
        UserTransaction ut = null;
        String sql = "SELECT * FROM CHENTE.USERTRANSACTOPN WHERE transaction_id= '"+id+"'";
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
    }

    
    
    

