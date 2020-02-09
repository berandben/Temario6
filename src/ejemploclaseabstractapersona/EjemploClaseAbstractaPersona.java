    /**
     *  Ejemplo de uso de clases abstractas y métodos abstractos
     */
package ejemploclaseabstractapersona;
import java.time.LocalDate;


/**
 * Programa principal
 */
public class EjemploClaseAbstractaPersona {

    /**
     *  Ejemplo de uso de clases abstractas y métodos abstractos
     * @param args
     */
    public static void main(String[] args) {
        // Declaración de objetos de las clases Profesor y Alumno
        Alumno alumno;
        Profesor profe;
        
        //Persona persona= new Persona (); // Sería un error: una clase abstracta no puede ser instanciada
        alumno= new Alumno ("Juan", "Torres", LocalDate.parse ("1995-03-22"), "1DAM-B", 7.5);
        profe= new Profesor  ("Antonio", "Campos", LocalDate.parse ("1975-08-16"), "Electricidad", 2000);
        
        // Llamada a métodos abstractos en la clase Persona
        // Pero heredados y definidos en las clases Profesor y en Alummno
        System.out.println ("EJEMPLO DE ALUMNO: ");
        System.out.println ("------------------ ");
        System.out.println ("Datos del alumno:");       
        System.out.println (alumno.toString());
        System.out.println ("Saludo del alumno:");
        System.out.println (alumno.saludar());
        System.out.println();
        System.out.println ("EJEMPLO DE PROFESOR: ");
        System.out.println ("---------------------");
        System.out.println ("Datos del profesor");
        System.out.println (profe.toString());
        System.out.println ("Saludo del profesor:");
        System.out.println (profe.saludar());
    }
}
