package com.softtek.ejercicios;

public class Vendedor extends Empleado {
        double ventas;
        double comision;

        public Vendedor(String nombre, double sueldo, double porcentaje, double ventas, double comision) {
            super(nombre, sueldo, porcentaje);
            this.ventas = ventas;
            this.comision = comision;
        }

    public double getVentas() {
        return ventas;
    }

    public void setVentas(double ventas) {
        this.ventas = ventas;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    @Override
    public double calcularNomina() {
        return (ventas * comision + getSueldo()) * getPorcentaje();
    }
    }


