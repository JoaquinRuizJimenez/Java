package Tema5;
import java.util.Scanner;

public class T5E30 {
    
    public static void main(String[] args) {
        
        //Declaraciones
        Scanner sc = new Scanner(System.in);
        int altura = 0;

        try{
            System.out.print("Introduzca la altura de la U: ");
            altura = sc.nextInt();
        }  catch(Exception e){
            System.out.print("ERROR: El valor de la altura debe ser un número positivo: ");
            sc.nextLine();
        }

        int i = 0;

        while (i < altura) {
            System.out.println("*     *");
            i++;
        }

        String espacioBlanco = "";


        System.out.println(espacioBlanco +" * * *");


        sc.close();
    }

}
