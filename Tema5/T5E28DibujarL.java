package Tema5;
import java.util.Scanner;

public class T5E28DibujarL {
    
    public static void main(String[] args) {
        
        //Declaraciones
        Scanner sc = new Scanner(System.in);
        int altura = 0;
        int contador = 1;
        int base;

        //Preguntamos
        try {
            System.out.print("Introduzca la altura de la L: ");
            altura = sc.nextInt();
            if(altura < 1){
                System.out.print("ERROR: La altura debe ser un número positivo: ");
                sc.nextLine();
            }
        } catch (Exception e) {
            System.out.print("ERROR: Debe introducir un número positivo: ");
            sc.nextLine();
        }

        //Escribimos el palo vertical
        while (contador < altura) {
            System.out.println("*");
            contador++;
        }

        //Medimos el palo horizontal
        base = altura / 2;
        base++;

        if(base % 2 != 0){
            base--;
        }

        //Pintamos el palo horizontal
        for(int i = 1; i <= base; i++ ){
            System.out.print("* ");
        }


        sc.close();
    }

}
