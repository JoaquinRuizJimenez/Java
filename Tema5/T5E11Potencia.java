package Tema5;
import java.util.Scanner;


public class T5E11Potencia {

    public static void main(String[] args){

        //Declaraciones
        Scanner sc = new Scanner(System.in);
        int base = 0;
        int exponente = 0;
        int potencia = 1;

        //Leemos base y exponente de teclado
        System.out.print("Introduzca la base: ");
        base = sc.nextInt();
        System.out.print("\nIntroduzca el exponente: ");
        exponente = sc.nextInt();

        //Calculamos la potencia
        for (int i = 1; i<=exponente; i++){

            potencia = potencia * base;

        }

        System.out.println("El resultado de la potencia es: "+ potencia);

        sc.close();

    }

}
