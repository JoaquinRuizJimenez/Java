
import java.util.Scanner;

public class T3E4{

    public static void main (String[] args) {


        System.out.println("Introduce el primer numero:");

        //Inicializamos el Scanner
        Scanner sc = new Scanner(System.in);

        double num1 = sc.nextDouble();

        System.out.println("Introduce el segundo numero: ");
        double num2 = sc.nextDouble();


        double suma = num1 + num2;
        double resta = num1 - num2;
        double multiplicacion = num1 * num2;
        double division = num1 / num2;

        System.out.println("La suma de " + num1 + " y " + num2 + " es igual a " + suma + "\n" );
        System.out.println("La resta de " + num1 + " y " + num2 + " es igual a " + resta + "\n");
        System.out.println("La multiplicacion de " + num1 + " y " + num2 + " es igual a " + multiplicacion + "\n");
        System.out.println("La division de " + num1 + " y " + num2 + " es igual a " + division + "\n");

        sc.close();

    }

}
