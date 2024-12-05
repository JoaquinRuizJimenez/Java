package Tema5;
import java.util.Scanner;

public class T5E17PiramideHueca {
    
    public static void main(String[] args) {
        
        //Declaraciones
        Scanner sc = new Scanner(System.in);
        String relleno = "";
        int altura = 0;

        //Entrada por teclado de la altura
        try {
            System.out.print("Introduce la altura de la pirámide: ");
            altura = sc.nextInt();
            if (altura <= 0){
                System.out.println("ERROR: La altura debe ser mayor a 0.");
            }

        } catch (Exception e) {
            System.out.println("ERROR: La altura debe ser un número positivo.");
        }

        //Entrada por teclado del caracter de relleno
        while (relleno.length() != 1) {
            try {
                System.out.print("\nIntroduce el caracter de relleno: ");
                relleno = sc.nextLine();
            } catch (Exception e) {
                System.out.println("ERROR: Ese no es un caracter válido.");
            } finally{
                relleno = sc.nextLine();
            }
        }

        //Pintamos la pirámide
        int base = 2 * altura - 1;
        int espaciosBlanco = base / 2;
        String fila = relleno;
        for (int i = 1; i <= altura; i++){
            for (int blancos = 1; blancos <= espaciosBlanco; blancos++){
                System.out.print(" ");
            }
            System.out.println(fila);               //Imprime la fila acutal
            espaciosBlanco -= 1;                    //Resta un espacio en blanco a la izq
            if (i == 2){
                fila = relleno + " " + fila ;
            }else{
                fila = 
            }

        }

        sc.close();

    }

}
