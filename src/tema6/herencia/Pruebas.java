/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema6.herencia;

import java.time.LocalDate;

/**
 *
 * @author Ber&ben
 */
public class Pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Alumno alumno = new Alumno("Paquito", "el Chocolatero", LocalDate.now(), "A", 10);

        System.out.println(alumno.toString());

    }

}
