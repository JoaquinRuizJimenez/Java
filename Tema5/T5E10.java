package Tema5;
import java.util.Scanner;

public class T5E10 {

public static void main(String[] args) {
    
    //Declaraciones
    Scanner sc = new Scanner(System.in);
    int numero;
    int positivos = 0;
    int negativos = 0;


    //Introducidos el programa
    System.out.println("Este programa mide cuantos positivos/negativos se han introducido por teclado.");
    System.out.print("Vaya introduciendo numeros: ");

    //Pedimos por teclado los números
    for(int i = 0; i < 10; i++){

        try{
            numero = sc.nextInt();
            //Si el número es menor a 0, la variable 'negativos' aumenta en 1. 
            if (numero < 0){
                negativos++;
            }
            //Si el número es mayor a 0, la variable 'positivos' aumenta en 1.
            if (numero > 0){
                positivos++;
            }
            if (numero == 0){
                System.out.println("El 0 no se considera ni positivo ni negativo, asi que no contará como ninguno.");
                System.out.println("No se contará como número introducido.");
                i--;
            }

            //Imprime un mensaje de error si hay algún tipo de excepción y vuelve a preguntar.
        } catch (Exception e){
            System.out.println("ERROR: El valor introducido debe ser un numero entero.");
            System.out.println("Por favor, siga introduciendo números: ");
            i--;
            sc.nextLine();
        }
    }

    //Imprime el resultado del ejercicio.
    System.out.println("Has introducido "+ positivos +" positivos y "+ negativos +" negativos.");


    //Cerramos el Scanner.
    sc.close();

}
    
}
