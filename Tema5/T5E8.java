package Tema5;
import java.util.Scanner;

public class T5E8 {

    public static void main(String[] args) {

        //Declaraciones
        Scanner sc = new Scanner(System.in);
        int numero = 0;

        try{
            System.out.print("Introduzca el número: ");
            numero = sc.nextInt();

            //Pinta cabezera tabla

            System.out.println("  n  |    n2   |    n3");
            System.out.println("---------------------------");

            //Calcula y pinta las potencias de los 5 siguientes números al introducido

            for(int i = 1; i<=5; i++ ){

                System.out.printf(" %-5d|  %-5d|  %-5d\n", numero, numero*numero, numero*numero*numero);
                numero++;

            }


        } catch (Exception e){
            System.out.println("ERROR: Se debe introducir un valor numérico.");
        }


        sc.close();
    }

    
}