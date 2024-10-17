import java.util.Scanner;
public class T3E9 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca la altura (cm):");
        double altura = sc.nextDouble();

        System.out.println("Introduzca el radio de la base (cm):");
        double radio = sc.nextDouble();

        double volumen = ((1d/3d) * (Math.PI) * (radio * radio) * altura);


        System.out.printf("El volumen del cono es igual a %.2f", volumen);

        sc.close();

    }
    
}
