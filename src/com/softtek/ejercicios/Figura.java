package com.softtek.ejercicios;

//Ejercicio 3
public class Figura {
    private double x;
    private double y;

    public Figura(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double calcularArea() {
        return 0; // No se puede calcular el área sin saber el tipo específico de la figura
    }

    public void mostrarPosicion() {
        System.out.println("Posición: (" + x + ", " + y + ")");
    }
}