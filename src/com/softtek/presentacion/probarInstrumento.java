package com.softtek.presentacion;

import com.softtek.ejercicios.Bateria;
import com.softtek.ejercicios.Flauta;
import com.softtek.ejercicios.Guitarra;
import com.softtek.ejercicios.InstrumentoMusical;

public class probarInstrumento {
    public static void main(String[] args) {
        Guitarra guido = new Guitarra("Fender", "Eléctrica");

        Bateria bataca = new Bateria("Pearl", 5);

        Flauta ham = new Flauta("Yamaha", "Madera");

        InstrumentoMusical[] instrumentos = {guido, bataca, ham};

        for (InstrumentoMusical instrumento : instrumentos) {
            instrumento.emitirSonido();
        }

    }
}
