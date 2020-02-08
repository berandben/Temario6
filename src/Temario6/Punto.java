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
public class Punto {
    
    //atributos

    private double x;
    private double y;
    
    //constructores

    public Punto(double x, double y) {

        this.x = x;
        this.y = y;

    }

    public Punto(Punto punto) {

        this.x = punto.x;
        this.y = punto.y;

    }
    
    //getters

    public double getX() {
        return this.x;
    }

    public double getY() {

        return this.y;
    }

}
