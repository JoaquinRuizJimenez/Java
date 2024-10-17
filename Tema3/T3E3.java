


import java.util.Scanner;

public class T3E3 {

    public static void main (String[] args){

        final double conversor = 166.386;

        System.out.println("Esto es un conversor de euros a pesetas");
        
        // Definimos e inicializamos el Scanner
        Scanner sc = new Scanner(System.in);

        // Leer por teclado una cantidad de euros
        System.out.println("Introduzca una cantidad de euros:");
        double euros = sc.nextDouble();

        // Alternativa
        //double euros2 = Double.parseDouble(sc.nextLine());

        // Calculamos el valor en pesetas
        double pesetas = euros * conversor;

        // Imprimimos por pantalla
        System.out.println(euros + " son " + pesetas + " pesetas.");

        System.out.println("Introduzca");

        sc.close();

    }

    
}
