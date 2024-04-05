package com.softtek.presentacion;

import com.softtek.ejercicios.Gerente;
import com.softtek.ejercicios.Operador;
import com.softtek.ejercicios.Vendedor;

public class probarEmpleado {
    public static void main (String[] args){
        Gerente gerente=new Gerente("Mauro", 2000, 0.75 , 1200);
        System.out.println("Nómina del gerente : " + gerente.calcularNomina() + " €");
        Vendedor vendedor=new Vendedor("MºCarmen", 2000, 0.75, 12000,0.03);
        System.out.println("Nómina del vendedor : " + vendedor.calcularNomina() +  " €");
        Operador operador = new Operador("Gustabo", 1200,0.75, 600,0.1);
        System.out.println("Nómina del operador : " + operador.calcularNomina() + " €");

    }
}
