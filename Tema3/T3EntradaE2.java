import java.util.Scanner;
public class T3EntradaE2 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("VOLUMEN DE UNA ESFERA");
        System.out.println("=======================");
        System.out.print("Introduzca el radio de la esfera (cms): ");

        double radio = sc.nextDouble();

        double volumen = ((4/3)* Math.PI *(radio*radio*radio));
       
        System.out.printf("El volumen del toroide es de \033[31m%.4f \033[0mcm\u00B3", volumen);
        sc.close();
    }
    
}
