package interfaces.manejointerfaces;

import interfaces.datos.AccesoDatos;
import interfaces.datos.ImplementacionMySql;
import interfaces.datos.ImplementacionOracle;

/**
 *
 * @author Ber&ben
 */
public class ManejoInterfaces {

    public static void main(String[] args) {

        AccesoDatos datos = new ImplementacionOracle();
        ejecutar(datos, "listar");

        datos = new ImplementacionMySql();
        ejecutar(datos, "insertar");

    }

    private static void ejecutar(AccesoDatos datos, String accion) {

        if ("listar".equals(accion)) {

            datos.listar();

        } else if ("insertar".equals(accion)) {

            datos.insertar();
        }
    }
}
