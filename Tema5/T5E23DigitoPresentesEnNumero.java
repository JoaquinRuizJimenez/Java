package Tema5;
import java.util.Scanner;

public class T5E23DigitoPresentesEnNumero {
    
    public static void main(String[] args) {
        
        //Declaraciones
        Scanner sc = new Scanner(System.in);
        int numero;
        int digito;

        //Lee de teclado el número:
        System.out.println("Introduzca un número entero:");
        numero = sc.nextInt();


        //Lee de teclado el dígito:
        System.out.println("Introduzca un dígito:");
        digito = sc.nextInt();

        //Invertimos el numero para obtener el resultado en la posición correcta
        int numeroInv = 0;
        while (numero / 10 != 0) {
            numeroInv = (numeroInv * 10) * (numero % 10);
            numero = numero / 10;
        }
        numeroInv = (numeroInv * 10) + numero;

        System.out.println("El "+ numero +" invertido es "+ numeroInv);

        //Dividimos progresivamente entre 10 hasta quedarnos sin número.
        int i = 0;
        while (numeroInv / 10 != 0) {
            
            int digitoActual = numero % 10;
            numero = numero / 10;
            i++;

            if (digitoActual == digito){
                System.out.println("El digito "+ digitoActual +"coincide en la posición "+ i);
            }

        }



        sc.close();
    }

}
