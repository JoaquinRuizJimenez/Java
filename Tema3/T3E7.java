

import java.util.Scanner;

public class T3E7 {

    public static void main (String[] args){

        System.out.println("Escriba el precio del producto sin IVA:");

        Scanner sc = new Scanner(System.in);
        double precioSinIVA = sc.nextDouble();

        System.out.println("El precio sin IVA es " + precioSinIVA);

        double IVA = precioSinIVA * 0.21;
        double precioConIVA = precioSinIVA + IVA;
        System.out.printf("El precio con IVA es %.2f", precioConIVA); 


        sc.close();

    }

}