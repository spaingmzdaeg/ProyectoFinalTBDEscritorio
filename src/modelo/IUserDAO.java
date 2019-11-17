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
public interface IUserDAO {
    public boolean registrar(User user);
    public boolean buscar(String id);
    public User obtenerusuario(String id);
    public List<User> obtener();
    public boolean actualizar(User user);
    public boolean eliminar(User user);
    public boolean consultar(String consulta,JTable tabla);
    
}

