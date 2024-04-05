package com.softtek.ejercicios;

public class Gerente extends Empleado {
    double bono;

    public Gerente(String nombre, double sueldo, double porcentaje, double bono) {
        super(nombre, sueldo, porcentaje);
        this.bono = bono;
    }

    public double getBono() {
        return bono;
    }

    public void setBono(double bono) {
        this.bono = bono;
    }

    @Override
    public double calcularNomina() {
        return (getSueldo() + bono) * getPorcentaje();
    }
}
