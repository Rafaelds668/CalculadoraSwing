package org.example;


import ui.VentanaCalculadora;

/**
 * La clase App es la clase de inicio de la aplicacion de la
 calculadora
 *Se usa para crear una instancia de la clase
 VentanaCalculadora y comenzar la aplicación
 */

public class App {
    /**
     * El metodo principal de la aplicación que se encarga
     de iniciar la calculadora
     *
     * @param args Los argumeentos de la linea de comando (no se usan en esta aplicación
     */
    public static void main( String[] args ) {
        //Crea una instancia de la calculadora y inicia
        VentanaCalculadora calculadora = new VentanaCalculadora();

    }
}
