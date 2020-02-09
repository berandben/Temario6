/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema6.herencia;

import tema6.herencia.Persona;
import java.time.LocalDate;

/**
 *
 * @author Ber&ben
 */
public class Profesor extends Persona {

    protected double salario;
    protected String especialidad;

    /*Con el constructor asignamos los valores a los campos 
    heredados de la clase Persona.
    --NO ES NECESARIO-- crear getters de éstos últimos, podemos llamarlos
    directamente desde la clase padre.
    Aunque podemos sobreescribirlos con @Override*/
    public Profesor(String nombre, String apellidos, LocalDate fechaNacimiento, double salario, String especialidad) {

        //Con super llamamos al constructor de la clase padre
        super(nombre, apellidos, fechaNacimiento);
        this.salario = salario;
        this.especialidad = especialidad;

    }

    public double getSalario() {

        return this.salario;
    }

    public String getEspecialidad() {

        return this.especialidad;
    }

    public void setSalario(double salario) {

        this.salario = salario;
    }

    public void setEspecialidad(String especialidad) {

        this.especialidad = especialidad;
    }

    @Override
    public String getNombre() {

        return "Nombre: " + this.nombre;
    }

    @Override
    public String toString() {

        StringBuilder cadena = new StringBuilder(super.toString());
        cadena.append("\n");
        cadena.append("Salario: ").append(String.format("%7.2f euros", this.salario)).append("\n");
        cadena.append("Especialidad: ").append(this.especialidad);

        return cadena.toString();

    }

}
