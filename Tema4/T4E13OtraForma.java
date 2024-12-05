import java.util.Scanner;

public class T4E13OtraForma {
    
    public static void main(String[] args){

        int orientacion = 0;
        String caracter = "";


        Scanner sc = new Scanner(System.in);

        do{
            try {
                System.out.println("Este programa pinta una pirámide");

                //Caracter de relleno
                while (caracter.length() != 1){
                    System.out.print("Introduzca el carácter de relleno:");
                    caracter = sc.nextLine();

                    if (caracter.length() != 1){ System.out.println("ERROR: El caracter tiene que ser de 1 de longitud.");}
                }

                //Orientacion
                System.out.println("Elija un tipo de pirámide:");
                System.out.println("\n1. Con el vértice hacia arriba.");
                System.out.println("2. Con el vértice hacia abajo.");
                System.out.println("3. Con el vértice hacia la derecha.");
                System.out.println("4. Con el vértice a la izquierda.");
                System.out.println("5. Salir del programa.");
                orientacion = sc.nextInt();


                //Controla que la opcion este entre 1 y 5
                if (orientacion < 1 || orientacion > 5){
                    //Tambien se puede hacer con "throw new Exception();"
                    System.out.println("ERROR: La opción debe ser un numero del 1 al 5.");
                }
            } catch (Exception e) {
                // TODO Auto-generated catch block
                System.out.println("ERROR: La opción debe ser un numero del 1 al 5.");
                sc.nextLine();
            }

        } while (orientacion < 1 || orientacion > 5);

        switch(orientacion){

            case 1:
                System.out.println("Has elejido pirámide con el vértice hacia arriba\n\n");

                System.out.println("  "+ caracter);
                System.out.println(" "+ caracter + caracter + caracter);
                System.out.println( caracter + caracter + caracter + caracter + caracter);
                break;
            case 2:
                System.out.println("Has elejido pirámide con el vértice hacia abajo\n\n");

                System.out.println( caracter + caracter + caracter + caracter + caracter);
                System.out.println(" "+ caracter + caracter + caracter);
                System.out.println("  "+ caracter);
                break;
            case 3:
                System.out.println("Has elegido pirámide con el vértice hacia la izquierda\n\n");

                System.out.println("  "+ caracter);
                System.out.println(" "+ caracter + caracter);
                System.out.println(caracter + caracter + caracter);
                System.out.println(" "+ caracter + caracter);
                System.out.println("  "+ caracter);
                break;
            case 4:
                System.out.println("Has elegido pirámide con el vértice hacia la derecha\n\n");

                System.out.println(caracter);
                System.out.println(caracter + caracter);
                System.out.println(caracter + caracter + caracter);
                System.out.println(caracter + caracter);
                System.out.println(caracter);
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
