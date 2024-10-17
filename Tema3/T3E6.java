import java.util.Scanner;
public class T3E6 {
    
    public static void main (String[] args){


        System.out.println("Calculadora del área de un triángulo");

        //Inicializamos el Scanner
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca la base del triángulo:");
        double base = sc.nextDouble();
 
         
        System.out.println("Introduce la altura del triángulo:");
        double altura = sc.nextDouble();
 
        double areaTriangulo = base * altura / 2;
        System.out.printf("El área del triángulo con base " + base + " y altura " + altura + " es " + areaTriangulo + "\u0082");

        sc.close();

    }

}
