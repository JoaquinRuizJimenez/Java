import java.util.Scanner;

public class T4E13 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Este programa pinta una pirámide");

        System.out.print("Introduzca el carácter de relleno:");
        String relleno = sc.nextLine();

        int tipoPiramide;

        System.out.println("Elija un tipo de pirámide:");
        System.out.println("\n1. Con el vértice hacia arriba.");
        System.out.println("2. Con el vértice hacia abajo.");
        System.out.println("3. Con el vértice hacia la izquierda");
        System.out.println("4. Elija un tipo de pirámide:");
        System.out.println("5. Salir del programa.");

        tipoPiramide = sc.nextInt();

        switch(tipoPiramide){

            case 1:
                System.out.println("Has elejido pirámide con el vértice hacia arriba\n\n");

                System.out.println("  "+ relleno);
                System.out.println(" "+ relleno + relleno + relleno);
                System.out.println( relleno + relleno + relleno + relleno + relleno);
                break;
            case 2:
                System.out.println("Has elejido pirámide con el vértice hacia abajo\n\n");

                System.out.println( relleno + relleno + relleno + relleno + relleno);
                System.out.println(" "+ relleno + relleno + relleno);
                System.out.println("  "+ relleno);
                break;
            case 3:
                System.out.println("Has elegido pirámide con el vértice hacia la izquierda\n\n");

                System.out.println("  "+ relleno);
                System.out.println(" "+ relleno + relleno);
                System.out.println(relleno + relleno + relleno);
                System.out.println(" "+ relleno + relleno);
                System.out.println("  "+ relleno);
                break;
            case 4:
                System.out.println("Has elegido pirámide con el vértice hacia la derecha\n\n");

                System.out.println(relleno);
                System.out.println(relleno + relleno);
                System.out.println(relleno + relleno + relleno);
                System.out.println(relleno + relleno);
                System.out.println(relleno);
                break;
            case 5:
                System.out.println("Gracias por usar el programa.");
                break;
            default:
                System.out.println("Eso no es un valor válido");
                break;
        }

        sc.close();

    }
    
}
