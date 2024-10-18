import java.util.Scanner;

public class T4E1{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Escribe un número del 1 al 100: ");

        int num1 = sc.nextInt();

        if (num1 >= 1 && num1 <= 100){

            System.out.println("¡El número esta dentro del rango!");

        } else{

            System.out.println("He dicho que un número entre el 1 y el 100");

        }

        sc.close();
    }
    
}