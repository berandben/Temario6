/*
 * Clase Profesor
 */
package ejemploclaseabstractapersona;


import java.time.LocalDate;

/**
 * Clase Profesor
 * Clase que contiene los atributos que representan a un profesor
 */
public class Profesor extends Persona {
    String especialidad;
    double salario; 

    // Constructor
    // -----------
    
    /**
     * Constructor de la clase Persona
     * @param nombre            Nombre del profesor
     * @param apellidos         Apellidos del profesor
     * @param fechaNacim        Fecha de nacimiento del profesor
     * @param especialidad      Especialidad del profesor
     * @param salario           Salario del profesor
     */
    public Profesor (String nombre, String apellidos, LocalDate fechaNacim, String especialidad, double salario) {
        super (nombre, apellidos, fechaNacim);
        this.especialidad= especialidad;
        this.salario= salario;            
    }


    /** 
     * Getter de la especialidad del profesor
     * @return Especialidad del profesor
     */
    public String getEspecialidad (){
        return especialidad;
    }

    /**
     * Getter del salario del profesor
     * @return Salario del profesor
     */
    public double getSalario (){
        return salario;
    }

    /**
     * Setter del salario del profesor
     * @param salario Salario del profesor
     */
    public void setSalario (double salario){
        this.salario= salario;
    }

    /**
     * Setter de la especialidad del profesor
     * @param especialidad Especialidad del profesor
     */
    public void setESpecialidad (String especialidad){
        this.especialidad= especialidad;
    }

    /**
     * Representación en forma de String del contenido del objeto Profesor
     * Aprovecha el método toString de la clase Profesor mediante una llamada a
     * super.toString(). Es decir, se está ampliando la funcionalidad de la clase
     * Persona.
     * @return String que representa el contenido del objeto Profesor
     */    
    @Override
    public String toString() {
        StringBuilder resultado;

        // Llamada al método “toString” de la superclase
        resultado= new StringBuilder (super.toString());

        // A continuación añadimos la información “especializada” de esta subclase
        resultado.append("\n");
        resultado.append ("Especialidad: ").append(this.especialidad).append("\n");
        resultado.append ("Salario: ").append(String.format("%7.2f euros", this.salario));


        return resultado.toString();
    }        
    
    // Redefinición de métodos abstractos heredados

    
    /**
     * Declaración del método saludar de la clase Profesor.
     * Este método sobrescribe el método abastracto saludar de la clase Persona.
     * @return String que representaría el saludo de un Profesor.
     */    
    @Override
    public String saludar () {
        StringBuilder resultado= new StringBuilder ();
        resultado.append("Hola, mi nombre es profesor ").append(this.nombre).append(" ");
        resultado.append(this.apellidos).append(" y soy de la especialidad de ").append(this.especialidad);

        return resultado.toString();
    }
}

