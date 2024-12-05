package Tema5;
import java.util.Scanner;

public class T5E7{

    public static void main(String[] args){

        //Declaraciones

        int numero = 0;
        int valores = 0;
        int contador = 0;
        Scanner sc = new Scanner(System.in);

        //Menu

        System.out.println("Este programa calcula la media de los números positivos introducidos");
        System.out.println("Para parar, introduzca un número negativo.");
        System.out.println("Vaya introduciendo números: ");
        
        do{
            try{
                numero = sc.nextInt();
                if(numero >= 0){
                    valores = valores + numero;
                    contador++;
                }

            }catch (Exception e){
                System.out.println("ERROR: Solo valen valores numéricos. Intentelo de nuevo.");
                sc.nextLine();
            }
        } while (numero >= 0);

        //Calculo de la media

        float media = valores / contador;
        System.out.println("El resultado de la media de los valores introducidos es: "+ media);
        
        sc.close();

    }

    

}