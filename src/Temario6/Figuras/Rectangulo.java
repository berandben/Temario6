/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Temario6.Figuras;

/**
 *
 * @author Ber&ben
 */
public class Rectangulo {

    //atributos
    private Punto vertice1;
    private Punto vertice2;

    //contructores
    public Rectangulo() {

        this.vertice1 = new Punto(0, 0);
        this.vertice2 = new Punto(1, 1);

    }

    public Rectangulo(double x1, double y1, double x2, double y2) {

        this.vertice1 = new Punto(x1, y1);
        this.vertice2 = new Punto(x2, y2);

    }

    /*Este contructor copia puede ocasionar efectos no deseados*/
    public Rectangulo(Punto vertice1, Punto vertice2) {

        this.vertice1 = vertice1; //INCORRECTO
        this.vertice2 = vertice2; //INCORRECTO

    }

//    /*Alternativa 1, extraer los atributos de los parámetros y crear un nuevo objeto*/
//    public Rectangulo(Punto vertice1, Punto vertice2) {
//
//        this.vertice1 = new Punto(vertice1.getX(), vertice1.getY());
//        this.vertice2 = new Punto(vertice2.getX(), vertice2.getY());
//
//    }
//
//    /*Alternativa 2, usar el constructor copia para crear nuevos objetos*/
//    public Rectangulo(Punto vertice1, Punto vertice2) {
//
//        this.vertice1 = new Punto(vertice1);
//        this.vertice2 = new Punto(vertice2);
//
//    }
    public Rectangulo(double base, double altura) {

        this.vertice1 = new Punto(0, 0);
        this.vertice2 = new Punto(base, altura);
    }

    public Rectangulo(Rectangulo rectangulo) {

        this.vertice1 = new Punto(rectangulo.getVertice1Version1());
        this.vertice2 = new Punto(rectangulo.getVertice2Version1());

    }

    //métodos
    public double calcularSuperficie() {

        double base, altura, area;

        base = vertice2.getX() - vertice1.getX();
        altura = vertice2.getY() - vertice1.getY();
        area = base * altura;
        return area;

    }

    public double CalcularPerimetro() {

        double perimetro, base, altura;

        base = vertice2.getX() - vertice1.getX();
        altura = vertice2.getY() - vertice1.getY();
        perimetro = 2 * base + 2 * altura;
        return perimetro;

    }

    //getters
    /*Devuelven directamente una referencia a un objeto atributo
    que probablemente has definido como privado*/
    public Punto getVertice1() {

        return this.vertice1; //INCORRECTO
    }

    public Punto getVertice2() {

        return vertice2; //INCORRECTO
    }

    /*Para evitar lo anterior se crea un un nuevo objeto copia*/
    //Version 1
    public Punto getVertice1Version1() {

        double x, y;
        Punto p;

        x = this.vertice1.getX();
        y = this.vertice1.getY();
        p = new Punto(x, y);

        return p;

    }

    public Punto getVertice2Version1() {

        double x, y;
        Punto p;

        x = this.vertice2.getX();
        y = this.vertice2.getY();
        p = new Punto(x, y);

        return p;

    }

    //Versión 2
    public Punto getVertice1Version2() {

        Punto p;
        p = new Punto(this.vertice1);

        return p;

    }

    public Punto getVertice2Version2() {

        Punto p;
        p = new Punto(this.vertice2);

        return p;

    }

}
