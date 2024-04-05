package com.softtek.ejercicios;

public class Empleado {
    //Ejercicio2

        String nombre;
        double sueldo;
        double porcentaje;

        public Empleado(String nombre, double sueldo, double porcentaje) {
            this.nombre = nombre;
            this.sueldo = sueldo;
            this.porcentaje = porcentaje;
        }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }
        public double calcularNomina() {
            return sueldo * porcentaje;
        }
    }




