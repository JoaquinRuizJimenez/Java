import java.util.Scanner;
public class T3EntradaE3 {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("CALCULADORA DE MEDIDAS IMPERIALES");
        System.out.println("===================================\n");

        System.out.print("Introduce una longitud en metros: ");
        
        double metros = sc.nextDouble();

        double pulgadas = 39.3701;
        double pies = 3.28084;
        double yardas = 1.09361;
        System.out.println(metros +" metros son: ");
        System.out.printf("\033[43m %.3f pulgadas \033[0m\n", pulgadas*metros);
        System.out.printf("\033[42m %.3f pies \033[0m\n", pies*metros);
        System.out.printf("\033[41m %.3f yardas \033[0m \n", yardas*metros);
        sc.close();

    }

}
