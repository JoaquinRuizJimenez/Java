package Tema5;
import java.util.Scanner;


public class T5PracticaExamen {
    
    public static void main(String[] args) {
        
        //Declaraciones
        Scanner sc = new Scanner(System.in);
        int numChico = 0;
        int numGrande = 0;

        //Pedimos el número grande por teclado.
        try {
            System.out.print("Introduzca un número (relativamente grande): ");
            numGrande = sc.nextInt();
            //Comprobamos que 'numGrande' sea mayor a 0.
            if (numGrande < 0){
                System.out.println("ERROR: El valor introducido debe ser mayor a 0.");
            }
        } catch (Exception e) {
            System.out.print("\nERROR: El valor introducido debe ser un número entero positivo.");
            sc.nextLine();
        }

        //Pedimos el número pequeño por teclado
        try {
            System.out.print("\nIntroduzca un valor (relativamente pequeño): ");
            numChico = sc.nextInt();

            //Comprobamos que 'numChico' sea más pequeño que 'numGrande' y más grande que 0.
            if (numChico < 0 || numChico > numGrande){
                System.out.println("ERROR: El valor introducido no es un valor válido.");
                System.out.println("Por favor, introduzca otro número distinto: ");
                sc.nextLine();
            }
        } catch (Exception e) {
            System.out.println("\nERROR: El valor introducido debe ser un número entero positivo.");
            sc.nextLine();
        }


        //Declaramos el número aleatorio sin darle un valor.
        double numAleatorio;

        numAleatorio = (Math.random()* numGrande + numChico);
        int contador = 0;
        

        while (contador < numAleatorio) {
            System.out.print(" * ");
            contador++;
        }


        sc.close();


    }


}
