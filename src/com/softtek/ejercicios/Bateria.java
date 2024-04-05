package com.softtek.ejercicios;

public class Bateria extends InstrumentoMusical {
    private int noPlatillos;

    public Bateria(String marca, int noPlatillos) {
        super(marca);
        this.noPlatillos = noPlatillos;
    }

    public int getNoPlatillos() {
        return noPlatillos;
    }

    public void setNoPlatillos(int noPlatillos) {
        this.noPlatillos = noPlatillos;
    }

    @Override
    public void emitirSonido() {
        System.out.println("La batería " + getMarca() + " con " + noPlatillos + " platillos está tocando un ritmo de jazz.");
    }
}

