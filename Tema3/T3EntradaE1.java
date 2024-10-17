import java.util.Scanner;
public class T3EntradaE1 {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("SEGUNDOS QUE TIENE UN DÍA");
        System.out.println("==========================");
        System.out.print("Introduzca el número de días: ");

       
        int dias = sc.nextInt();

        int segundosDia = 60*60*24;
        System.out.println(dias +" días equivalen a "+ segundosDia*dias + " segundos.");

        sc.close();

    }

}
