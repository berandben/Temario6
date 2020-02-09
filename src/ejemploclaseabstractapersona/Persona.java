/*
 * Clase Persona
 */
package ejemploclaseabstractapersona;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Clase abastracta Persona
 * Clase que representa a una persona.
 * No es instanciable.
 */
public abstract class Persona {
    protected String nombre;
    protected String apellidos;
    protected LocalDate fechaNacim;

    // Constructores
    // -------------

    /**
     * Constructor de la clase Persona
     * @param nombre            Nombre de la persona
     * @param apellidos         Apellidos de la persona
     * @param fechaNacimiento   Fecha de nacimiento de la persona
     */
    public Persona (String nombre, String apellidos, LocalDate fechaNacimiento) {           
        this.nombre= nombre;
        this.apellidos= apellidos;
        this.fechaNacim= fechaNacimiento;
    }

    /**
     * Getter del atributo nombre
     * @return Nombre de la persona
     */
    protected String getNombre (){
        return nombre;
    }

    /**
     * Getter del atributo apellidos
     * @return Apellidos de la persona
     */
    protected String getApellidos (){
        return apellidos;
    }

    /**
     * Getter de la fecha de nacimiento
     * @return Fecha de nacimiento de la persona
     */
    protected LocalDate getFechaNacim (){
        return this.fechaNacim;
    }

    /**
     * Setter del nombre
     * @param nombre Nombre de la persona
     */
    protected void setNombre (String nombre){
        this.nombre= nombre;
    }

    /**
     * Setter de los apellidos
     * @param apellidos Apellidos de la persona
     */
    protected void setApellidos (String apellidos){
        this.apellidos= apellidos;
    }

    /**
     * ¨Setter de la fecha de nacimiento
     * @param fechaNacim Fecha de nacimiento de la persona
     */
    protected void setFechaNacim (LocalDate fechaNacim){
        this.fechaNacim= fechaNacim;
    }

    /**
     * Representación en forma de String del contenido del objeto Persona
     * @return String que representa el contenido del objeto Persona
     */
    @Override
    public String toString() {
        StringBuilder resultado=new StringBuilder();
        DateTimeFormatter formateadorFecha = DateTimeFormatter.ofPattern("dd/LL/yyyy");
        String fechaFormateada= formateadorFecha.format(fechaNacim);
        
        resultado.append("Nombre: ").append (this.nombre).append("\n");
        resultado.append("Apellidos: ").append (this.apellidos).append("\n");
        resultado.append("Fecha de nacimiento: ").append (fechaFormateada);

        return resultado.toString();
    }        
        
    // Métodos abstractos

    /**
     * Declaración del método abstracto saludar de la clase Persona.
     * Este método en realidad no es instanciable pues aquí no se implementa.
     * @return String que representaría el saludo de una Persona
     */
    protected abstract String saludar (); // No se define: es abstracto. Ya lo harán sus subclases.
        
        
}

