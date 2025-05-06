

import java.util.Scanner;

public class T3E1 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Este programa multiplica 2 números enteros");

        System.out.println("Introduce el primer número:");
        int num1 = sc.nextInt();

        System.out.println("Introduce el segundo número:");
        int num2 = sc.nextInt();

        int producto = num1*num2;
        System.out.println(num1 + " por "+ num2 +" es igual a "+ producto);

        sc.close();
    }

}
