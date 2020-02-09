
package clasesabstractas.ejemploclasesabstractas;

import clasesabstractas.abstracto.domain.*;

/**
 *
 * @author Ber&ben
 */
public class EjemploClasesAbstractas {

    public static void main(String[] args) {
       
     FiguraGeometrica rectangulo = new Rectangulo("Rectangulo");
     FiguraGeometrica triangulo = new Rectangulo("Triangulo");
     FiguraGeometrica circulo = new Rectangulo("Circulo");
     
        System.out.println(rectangulo);
        rectangulo.dibujar();
        
        System.out.println("");
        System.out.println(triangulo);
        triangulo.dibujar();
        
        System.out.println("");
        System.out.println(circulo);
        circulo.dibujar();
        
    }
    
}
