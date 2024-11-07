import java.util.Scanner;
public class T4E4EcuacionPrimerGrado{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        float incognita;

        System.out.println("Calculadora de ecuaciones de primer grado tipo ax + b = 0");

        System.out.print("Introduzca el valor de a: ");
        float valorA = sc.nextFloat();

        System.out.print("Ahora introduzca el valor de b: ");
        float valorB = sc.nextFloat();

        if (valorA == 0){

            System.out.print("Esta ecuación no tiene solución real.");

        } else{

            incognita = (-valorB / valorA);
            System.out.printf("\nLa solución de la ecuación es x = %.2f", incognita);

        }


        sc.close();

    }

}