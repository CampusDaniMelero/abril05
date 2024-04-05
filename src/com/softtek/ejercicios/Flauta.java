package com.softtek.ejercicios;

public class Flauta extends InstrumentoMusical {
    private String material;

    public Flauta(String marca, String material) {
        super(marca);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public void emitirSonido() {
        System.out.println("La flauta " + getMarca() + " de material " + material + " está tocando una melodía clásica.");
    }
}
