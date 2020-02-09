/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces.datos;

/**
 *
 * @author Ber&ben
 */
public interface AccesoDatos {

    public static final int MAX_REGISTROS = 10;

    public abstract void insertar();

    public abstract void listar();

}
