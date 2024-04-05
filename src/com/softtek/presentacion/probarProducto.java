package com.softtek.presentacion;

import com.softtek.ejercicios.ProductoPerecedero;

import java.time.LocalDate;

public class probarProducto {
    public static void main(String[] args){
        ProductoPerecedero productoPerecedero = new ProductoPerecedero("ColaCao", 14, 75.12, LocalDate.of(2024, 4, 05), LocalDate.of(2024, 4, 1));
        System.out.println("Nombre: " + productoPerecedero.getNombre());
        System.out.println("Cantidad: " + productoPerecedero.getCantidad());
        System.out.println("PVP: " + productoPerecedero.getPvp());
        System.out.println("Fecha de caducidad: " + productoPerecedero.getfCaducidad());
        System.out.println("Fecha de fabricación: " + productoPerecedero.getfFabricacion());
        System.out.println("Tiempo de consumo: " + productoPerecedero.tiempoConsumision() + " días");
    }
}
