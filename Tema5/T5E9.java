package Tema5;
import java.util.Scanner;

public class T5E9 {
    
    

    public static void main(String[] args){

        //Declaraciones
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        int primero = 0;
        int segundo = 1;
        int ultimo = 0;
        int aux = 0;
        int penultimo = 1;

        try{

        System.out.println("\033[1m;PRIMEROS NÚMEROS DE LA SERIE DE FIBONACCI\033[0m");
        System.out.print("Introduzca un número: ");
        numero = sc.nextInt();
        if (numero == 0){
            System.out.println(primero);
        } else if (numero == 1){
            System.out.println(primero + " " + segundo);
        } else{
            System.out.print(primero + " " + segundo);
            while (numero > 2){
                aux = ultimo + penultimo;
                penultimo = ultimo = aux;
                ultimo = aux;
                System.out.println(" "+ ultimo);
            }
        }

        } catch (Exception e){
            System.out.println("ERROR: Se debe introducir un valor numérico");
        }


        sc.close();

    }

}
