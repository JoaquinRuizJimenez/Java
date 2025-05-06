package Tema9;

public class Fraccion{

    private int numerador;
    private int denominador;


    //Constructor
    public Fraccion(){

        this.numerador = numerador;
        this.denominador = denominador;

    }


    public Fraccion invierte(){


        Fraccion inversa = new Fraccion();
        inversa.denominador = this.numerador;
        inversa.numerador = this.denominador;


        return inversa;
    }




    public Fraccion simplifica(){

        Fraccion simplificada = new Fraccion();

        int maximocomundivisor = mcd(this.numerador, this.denominador);
        simplificada.denominador = this.denominador / maximocomundivisor;
        simplificada.numerador = this.numerador / maximocomundivisor;

        return simplificada;

    }

    private int mcd(int valor1, int valor2){

        while (valor1 != valor2) {
            if (valor1 >= valor2) {
                valor1 = valor1 - valor2;
            } else{
                valor2 = valor2 - valor1;
            }
        }

        return valor1;
    }



    public Fraccion multiplica(Fraccion fraccion){

        Fraccion producto = new Fraccion(this.numerador * fraccion.numerador, this.denominador * fraccion.denominador);

        producto = producto.simplifica();

        //Declaraciones
        return producto;

    }


    public void divide(){

        return new Fraccion(this.numerador * fraccion.denominador, this.denominador * fraccion.numerador);


    }


}