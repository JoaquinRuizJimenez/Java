package Tema7;

import java.util.Random;
import java.util.Scanner;

public class T7E7 {
    
    public static void main(String[] args) {
        
        //Declaraciones
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[100];
        Random rand = new Random();

        //Damos un valor aleatorio entre 0 y 20 a cada indice de 'numeros[]'
        for(int i = 0; i < numeros.length; i++){

            numeros[i] = rand.nextInt(21);

        }

        //Imprimimos por pantalla cada valor de 'numeros[]'
        for(int j = 0; j < numeros.length; j++){

            System.out.print(numeros[j] + " ");

        }

        //Pedimos el número que queremos seleccionar
        System.out.println("");
        System.out.print("\nIntroduzca un número de los que se han mostrado: ");
        int numeroElegido = sc.nextInt();

        //Pedimos el número por el que queremos sustituirlo
        System.out.print("Introduzca el valor por el que quiere sustituirlo: ");
        int numeroSustituto = sc.nextInt();
        System.out.println("");

        //Sustituimos el 'numeroElegido' por el 'numeroSustituto'
        for(int i = 0; i < numeros.length; i++){

            if(numeros[i] == numeroElegido){
                numeros[i] = numeroSustituto;
            }

        }

        //Imprimimos 'numeros[]' 
        for(int j = 0; j < numeros.length; j++){

            System.out.print(numeros[j] +" ");
        }



        sc.close();
    }

}
