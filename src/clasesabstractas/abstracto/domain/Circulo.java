/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesabstractas.abstracto.domain;

/**
 *
 * @author Ber&ben
 */
public class Circulo extends FiguraGeometrica {

    public Circulo(String tipoFigura) {

        super(tipoFigura);
    }

    @Override
    public void dibujar() {

        System.out.println("Aquí se dibuja un: "
                + this.getClass().getSimpleName());

    }
}
