package Tema7;

import java.util.Scanner;

public class T7E9 {
    
    public static void main(String[] args) {
        
        //Declaraciones
        int[] numeros = new int[8];
        Scanner sc = new Scanner(System.in);

        //Pedimos por teclado
        System.out.println("Introduzca 8 números enteros, pulse INTRO después de cada número:");

        for(int i = 0; i < numeros.length; i++){

            numeros[i] = sc.nextInt();

        }

        System.out.println("");

        for(int j = 0; j < numeros.length; j++){

            System.out.print(numeros[j] + " ");
            if (numeros[j] % 2 == 0) {
                System.out.println("par");
            } else{
                System.out.println("impar");
            }

        }

        sc.close();
    }

}
