package com.softtek.ejercicios;

import java.time.LocalDate;

public class ProductoPerecedero extends Producto {
    private LocalDate fCaducidad;
    private LocalDate fFabricacion;

    public ProductoPerecedero(String nombre, int cantidad, double pvp, LocalDate fCaducidad, LocalDate fFabricacion) {
        super(nombre, cantidad, pvp);
        this.fCaducidad = fCaducidad;
        this.fFabricacion = fFabricacion;
    }

    // Método para calcular el tiempo de consumo en días
    public int tiempoConsumision() {
        return fCaducidad.getDayOfYear() - fFabricacion.getDayOfYear();
    }

    // Getters y setters
    public LocalDate getfCaducidad() {
        return fCaducidad;
    }

    public void setfCaducidad(LocalDate fCaducidad) {
        this.fCaducidad = fCaducidad;
    }

    public LocalDate getfFabricacion() {
        return fFabricacion;
    }

    public void setfFabricacion(LocalDate fFabricacion) {
        this.fFabricacion = fFabricacion;
    }
}