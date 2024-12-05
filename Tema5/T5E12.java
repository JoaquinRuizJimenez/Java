package Tema5;
import java.util.Scanner;

public class T5E12 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int exponente;
        int potencia = 1;
        int base;
        int aumenta = 1;

        System.out.println("Calculador de potencias.");

        //Leemos base y exponente de teclado
        System.out.print("Introduzca la base: ");
        base = sc.nextInt();
        System.out.print("\nIntroduzca el exponente maximo: ");
        exponente = sc.nextInt();
 
        //Calculamos la potencia
        for (int i = 1; i<=exponente; i++){
 
            potencia = potencia * base;
            System.out.println(base +"^"+ aumenta +" = "+ potencia);
            aumenta++;
 
        }
 
        sc.close();
    }
    
}
