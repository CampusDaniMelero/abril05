package com.softtek.ejercicios;

public class Operador extends Empleado {
    private int piezas;
    private double incentivo;

    public Operador(String nombre, double sueldo, double porcentaje, int piezas, double incentivo) {
        super(nombre, sueldo, porcentaje);
        this.piezas = piezas;
        this.incentivo = incentivo;


    }
        @Override
        public double calcularNomina() {
            return(piezas*incentivo) + (getSueldo()*(1+getPorcentaje()));
        }
    }



