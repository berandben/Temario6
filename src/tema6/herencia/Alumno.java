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
public class Alumno extends Persona {

    protected String grupo;
    protected double notaMedia;

    /*Con el constructor asignamos los valores a los campos 
    heredados de la clase Persona.
    --NO ES NECESARIO-- crear getters de éstos últimos, podemos llamarlos
    directamente desde la clase padre.
    Aunque podemos sobreescribirlos con @Override*/
    public Alumno(String nombre, String apellidos, LocalDate fechaNacimiento, String grupo, double notaMedia) {

        //Con super llamamos al constructor de la clase padre
        super(nombre, apellidos, fechaNacimiento);
        this.grupo = grupo;
        this.notaMedia = notaMedia;
    }

    public String getgrupo() {

        return this.grupo;
    }

    public double getNotaMedia() {

        return this.notaMedia;
    }

    public void setGrupo(String grupo) {

        this.grupo = grupo;
    }

    public void setNotaMedia(double notaMedia) {

        this.notaMedia = notaMedia;
    }

    @Override
    public String getNombre() {

        return "Nombre: " + this.nombre;

    }

    @Override
    public String getApellidos() {

        return "Alumno:" + this.apellidos;
    }

    @Override
    public String toString() {

        StringBuilder cadena = new StringBuilder(super.toString());
        cadena.append("\n");
        cadena.append("Grupo: ").append(this.grupo).append("\n");
        cadena.append("Nota media: ").append(String.format("%6.2f", this.notaMedia));

        return cadena.toString();

    }

}
