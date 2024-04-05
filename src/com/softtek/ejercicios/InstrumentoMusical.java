package com.softtek.ejercicios;

public class InstrumentoMusical {
    private String marca;

    public InstrumentoMusical(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void emitirSonido() {
        System.out.println("Este instrumento no tiene un sonido predeterminado.");
    }
}
