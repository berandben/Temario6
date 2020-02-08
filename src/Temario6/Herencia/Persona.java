/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Temario6.Herencia;

import java.time.LocalDate;

/**
 *
 * @author Ber&ben
 */
public abstract class Persona {

    /*Se debe usar protected en vez de private 
    para que sea accesible sólo desde sus clases hijas*/
    protected String nombre;
    protected String apellidos;
    protected LocalDate fechaNacimiento;

    /*El constructor de la clase padre debe ser public*/
    public Persona(String nombre, String apellidos, LocalDate fechaNacimiento) {

        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;

    }

    /*Los getters y setter de la clase padre serán protected*/
    protected String getNombre() {

        return this.nombre;
    }

    protected String getApellidos() {

        return this.apellidos;
    }

    protected LocalDate getFechaNacimiento() {

        return this.fechaNacimiento;
    }

    protected void setNombre(String nombre) {

        this.nombre = nombre;
    }

    protected void setApellidos(String apellidos) {

        this.apellidos = apellidos;
    }

    protected void setFechaNacimiento(LocalDate fechaNacimiento) {

        this.fechaNacimiento = fechaNacimiento;
    }
}