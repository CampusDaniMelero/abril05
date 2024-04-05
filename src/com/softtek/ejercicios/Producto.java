package com.softtek.ejercicios;
import java.time.LocalDate;

//Ejercicio1

public class Producto {
    private String nombre;
    private int cantidad;
    private double pvp;


    public Producto(String nombre , int cantidad , double pvp){
        this.nombre=nombre;
        this.cantidad=cantidad;
        this.pvp=pvp;
    }

    public  String getNombre(){
        return nombre;
    }

    public void setNombre(){
        this.nombre=nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPvp() {
        return pvp;
    }

    public void setPvp(double pvp) {
        this.pvp = pvp;
    }


}

