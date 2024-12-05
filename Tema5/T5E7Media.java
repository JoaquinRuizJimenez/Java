package Tema5;
import java.util.Scanner;


public class T5E7Media {
    
    public static void main(String[] args) {
        
        //Declaraciones
        Scanner sc = new Scanner(System.in);
        int contador = 0;
        int numero = 0;
        int sumando = 0;

        //Presentamos el programa
        System.out.println("Este programa hace una media de varios números.");
        System.out.println("Cuando quiera parar, introduzca un número negativo.");
        System.out.println("Por favor, introduzca vaya introduciendo números:");

        //Pedimos por pantalla
        do{
            try{
                sumando = sc.nextInt();
                if (sumando >= 0){
                    numero = numero + sumando;
                    contador++;
                }
            } catch (Exception e){
                System.out.println("ERROR: El valor introducido ha de ser un número entero.");
                sc.nextLine();
            }
        }while (sumando >= 0);

        //Calculamos la media
        float media = numero / contador;

        //Mostramos el resultado
        System.out.println("La media de los números introducidos es "+ media);

        //Cerramos el Scanner
        sc.close();

    }


}
