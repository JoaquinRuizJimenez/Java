import java.util.Scanner;

public class T3E2{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Esto es un conversor de euros a pesetas");
        System.out.println("Introduzca la cantidad de euros a convertir:");

        double euros = sc.nextDouble();

        double conversor = 166.386;
        
        double pesetas = euros * conversor;
        System.out.println(euros +" euros son "+ pesetas +" pesetas.");

        sc.close();

    }

}