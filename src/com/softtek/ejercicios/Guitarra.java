package com.softtek.ejercicios;

public class Guitarra extends InstrumentoMusical {
    private String tipoCuerdas;

    public Guitarra(String marca, String tipoCuerdas) {
        super(marca);
        this.tipoCuerdas = tipoCuerdas;
    }

    public String getTipoCuerdas() {
        return tipoCuerdas;
    }

    public void setTipoCuerdas(String tipoCuerdas) {
        this.tipoCuerdas = tipoCuerdas;
    }

    public void emitirSonido() {
        System.out.println("La guitarra " + getMarca() + " de tipo de cuerdas " + tipoCuerdas + " está tocando un solo de rock.");
    }
    }

