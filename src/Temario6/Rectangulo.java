/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Temario6;

/**
 *
 * @author Ber&ben
 */
public class Rectangulo {

    private Punto vertice1;
    private Punto vertice2;

    public double calcularSuperficie() {

        double base, altura, area;
        base = vertice2.getX() - vertice1.getX();
        altura = vertice2.getY() - vertice1.getY();
        area = base * altura;
        return area;

    }

}
