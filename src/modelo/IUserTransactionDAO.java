/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.List;
import javax.swing.JTable;

/**
 *
 * @author Chente
 */
public interface IUserTransactionDAO {
     public boolean registrar(UserTransaction ut);
    public boolean buscar(String id);
    public UserTransaction obtenertransaccion(String id);
    public List<UserTransaction> obtener();
    public boolean actualizar(UserTransaction ut);
    public boolean eliminar(UserTransaction ut);
    public boolean consultar(String consulta,JTable tabla);
}
