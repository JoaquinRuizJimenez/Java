import java.util.Scanner;

public class T3E11 {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);


        System.out.println("Esto es un conversor de KB a MB");
        System.out.println("Introduzca el número de KB:");

        double kilobytes = sc.nextDouble();
        
        double megabytes = kilobytes / 1024;

        System.out.println(kilobytes + "KB son "+ megabytes +"MB.");

        sc.close();

    }

}
