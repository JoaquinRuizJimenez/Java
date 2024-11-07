package Tema6;

public class T6Practica {

    public static void main(String[] args){

        //Numeros entre (0, 1) con decimales
        for (int i = 1; i < 11; i++){

            System.out.println(Math.random());

        }

        //Números entre [0, 10) con decimales
        for (int i = 1; i < 11; i++){

            System.out.println(Math.random() * 10);

        }

        //Numeros entre [0, 10) enteros
        for (int i= 1; i < 11; i++){

            System.out.println((int) (Math.random()* 10));

        }

        //Numeros entre [1, 10) enteros
        for (int i= 1; i < 11; i++){

            System.out.println((int) (Math.random()* 10)+ 1);

        }

        //Numeros entre [3, 7) con decimales
        for (int i= 1; i < 11; i++){

            System.out.println((Math.random()* 4)+ 3);

        }

        /*
         * Caso práctico: dado
         * 
         * Para simular el lanzamiento de un dado, necesitamos obtener un
         * número aleatorio en el intervalor [1,6].
         */

         System.out.println("Lanzamiento de dado: "+ (int)(Math.random()* 6 + 1));

    }
    
}
