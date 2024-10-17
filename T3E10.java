import java.util.Scanner;
public class T3E10 {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);


        System.out.println("Esto es un conversor de MB a KB");
        System.out.println("Introduzca el número de MB:");

        double megabytes = sc.nextDouble();
        
        double kilobytes = megabytes * 1024;

        System.out.println(megabytes + "MB son "+ kilobytes +"KB.");

        sc.close();

    }


}
