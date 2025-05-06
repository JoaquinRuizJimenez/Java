package Tema7;
import java.util.Scanner;

public class pruebaArrays1 {

    public static void main(String[] args) {
        
        //Array de enteros de 4 posiciones
        int[] numeros;
        Scanner sc = new Scanner(System.in);
        int indice;


        //Inicializamos el Array
        numeros = new int[4];

        numeros[0] = 6;
        numeros[1] = 345;
        numeros[2] = -67;
        numeros[3] = 0;


        System.out.println("\n" + numeros[2] + "\n");


        for(int i = 0; i < numeros.length; i++){
            System.out.println(numeros[i]);
        }


        /*  Esta línea de codigo nos devuelve un error tipo ArrayIndexOutOfBounds ya que 
            estamos pidiendo que nos impriman el valor que hay en una posicion 5 en un Array
            con 4 valores
            System.out.println(numeros[4]);
        */


        System.out.println("Introduzca indice entre el 0 y el "+ (numeros.length - 1) +": ");
        indice = sc.nextInt();

        System.out.println(numeros[indice]);




        sc.close();
    }
    
}
