import java.util.Scanner;
import java.lang.Math;


public class T4E5CalcularCaida {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        final float aceleracion_gravedad = 9.8f;


        System.out.println("Cálculo del tiempo de caída de un objeto.");

        System.out.print("Introduce la altura (en metros) desde la que cae el objeto: ");
        float altura = sc.nextFloat();

        float tiempo;

        float Tiempo_Sin_Raiz = ((2 * altura) / aceleracion_gravedad);
        tiempo = sqrt(Tiempo_Sin_Raiz);
        System.out.printf("\nEl objeto tarda en caer %.2f segundos.", tiempo);



    }
    
}
