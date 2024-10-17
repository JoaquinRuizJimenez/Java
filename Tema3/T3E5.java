import java.util.Scanner;
public class T3E5 {

    public static void main (String[] args){



        System.out.println("Calculadora del área de un rectángulo");

        //Inicializamos el Scanner
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca la base del rectángulo:");
        double base = sc.nextDouble();

        
        System.out.println("Introduce el lado del rectángulo:");
        double lado = sc.nextDouble();

        double areaRectangulo = base * lado;
        System.out.printf("El área del rectángulo con base " + base + " y lado " + lado + " es " + areaRectangulo + "\u00b2");

        sc.close();

    }
    
}
