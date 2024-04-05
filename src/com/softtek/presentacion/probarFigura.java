package com.softtek.presentacion;

import com.softtek.ejercicios.Cuadrado;
import com.softtek.ejercicios.Figura;
import com.softtek.ejercicios.Triangulo;

public class probarFigura {
    public static void main(String[] args) {
        Cuadrado cPeque = new Cuadrado(1, 2, 5);
        Cuadrado cMediano = new Cuadrado(3, 4, 7);
        Triangulo tPeque = new Triangulo(5, 6, 4, 3);
        Triangulo tMediano = new Triangulo(7.0, 8, 6, 5);

        Figura[] figuras = {cPeque, cMediano, tPeque, tMediano};

        for (Figura figura : figuras) {
            System.out.println("El área es: " + figura.calcularArea());
            figura.mostrarPosicion();
        }
    }
}
