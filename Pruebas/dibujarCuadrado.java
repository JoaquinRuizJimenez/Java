import java.util.Scanner;

public class dibujarCuadrado {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el lado del cuadrado: ");
        int lado = sc.nextInt();


        for(int i = 0; i < lado; i++){
            for (int j = 0; j < lado; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }


        sc.close();
    }
    
}