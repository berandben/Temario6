/*
 * Clase Alumno.
 */
package ejemploclaseabstractapersona;

import java.time.LocalDate;

/**
 * Clase que representa a un alumno.
 * Hereda de la clase Persona.
 */
public class Alumno extends Persona  {
    protected String grupo;
    protected double notaMedia; 


    // Constructor
    // -----------
    /**
     * Constructor de la clase Alumno   
     * @param nombre            Nombre del alumno
     * @param apellidos         Apellidos del alumno
     * @param fechaNacim        Fecha de nacimiento del alumno
     * @param grupo             Grupo al que pertenece el alumno
     * @param notaMedia         Nota media del alumno
     */    
    public Alumno (String nombre, String apellidos, LocalDate fechaNacim, String grupo, double notaMedia) {
        super (nombre, apellidos, fechaNacim);
        this.grupo= grupo;
        this.notaMedia= notaMedia;            
    }


    /** 
     * Getter del grupo
     * @return Grupo al que pertenece el alumno
     */
    public String getGrupo (){
        return grupo;
    }

    /**
     * Getter de la nota media
     * @return Nota Nota media del alumno
     */
    public double getNotaMedia (){
        return notaMedia;
    }

    /**
     * Setter del grupo
     * @param grupo Grupo al que pertenece el alumno
     */
    public void setGrupo (String grupo){
        this.grupo= grupo;
    }

    /** 
     * Setter de la nota media
     * @param notaMedia Nota media del alumno
     */
    public void setNotaMedia (double notaMedia){
        this.notaMedia= notaMedia;
    }

    /**
     * Representación en forma de String del contenido del objeto Alumno
     * Aprovecha el método toString de la clase Persona mediante una llamada a
     * super.toString(). Es decir, se está ampliando la funcionalidad de la clase
     * Persona.
     * @return String que representa el contenido del objeto Alumno
     */
    @Override
    public String toString() {
        StringBuilder resultado;

        // Llamada al método “toString” de la superclase
        resultado= new StringBuilder (super.toString());

        // A continuación añadimos la información “especializada” de esta subclase
        resultado.append("\n");
        resultado.append ("Grupo: ").append(this.grupo).append("\n");
        resultado.append ("Nota media: ").append(String.format("%6.2f", this.notaMedia));

        return resultado.toString();
    }        
        

    // Redefinición de métodos abstractos heredados

    /**
     * Declaración del método saludar de la clase Alumno.
     * Este método sobrescribe el método abastracto saludar de la clase Persona.
     * @return String que representaría el saludo de un alumno.
     */    
    @Override
    public String saludar () {
        StringBuilder resultado= new StringBuilder ();
        resultado.append("Hola, soy el alumno ").append(this.nombre).append(" ");
        resultado.append(this.apellidos).append(" y estoy en el grupo ").append(this.grupo);

        return resultado.toString();
    }
}
