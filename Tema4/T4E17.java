import java.util.Scanner;

public class T4E17 {


    public static void main(String[] args) {
        
        //Declaraciones
        Scanner sc = new Scanner(System.in);
        int numero = 0;

        System.out.print("Introduce un número entero: ");
        numero = sc.nextInt();

        String numeroString = Integer.toString(numero) ;
        int numeroTamano = numeroString.length();

        System.out.print("\nEl número introducido tiene "+ numeroTamano +" dígitos.");


        sc.close();
    }


}
