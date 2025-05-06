package Tema9;

import java.util.Random;

public class TarjetaRegalo {
    
    //Variables de instancia
    private double saldo;
    private int codigo;

    //Random
    Random rand = new Random();

    //Constructor
    public TarjetaRegalo(double saldo){

        this.saldo = saldo;
        this.codigo = rand.nextInt(10000, 100000);  //Numero entero aleatorio de 5 cifras.

    }


    /*
     * Descuenta el saldo a la tarjeta según la cantidad a pagar.
     * Imprimirá un mensaje de error si la cantidad es superior al saldo disponible.
     */

    public void gasta(double cantidad){

        if (this.saldo > cantidad) {
            this.saldo -= cantidad;
        } else{
            System.out.println("ERROR: Saldo insuficiente.");
        }
        

    }


    /*
     * Fusiona con la tarjeta regalo que se pasa como parámetro
     * 
     * Las dos tarjetas fusionadas pasarán a tener 0 euros
     * 
     * Se creará una nueva tarjeta
     * 
     */
    public TarjetaRegalo fusionaCon(TarjetaRegalo t2){

        TarjetaRegalo tNueva = new TarjetaRegalo(this.saldo + t2.saldo);
        this.saldo = 0;
        t2.saldo = 0;

        return tNueva;

    }


    public String toString(){

        return "Tarjeta nº "+ codigo +" - "+ saldo + "€";

    }

}
