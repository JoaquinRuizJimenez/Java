import java.util.Scanner;
public class T4E3{

    public static void main(String[] args){

        //Inicializamos el Scanner
        Scanner sc = new Scanner(System.in);

        //Pedimos la hora del dia
        System.out.print("Introduce una hora del día (0 - 23): ");
        int hora = sc.nextInt();

        //Ejecutamos la sentencia Switch para determinar el mensaje que mostrar en función de la hora que nos hayan dado
        switch (hora){

            case 6, 7, 8, 9, 10, 11, 12:
                System.out.print("\nBuenos días.");
                break;

            case 13, 14, 15, 16, 17, 18, 19, 20:
                System.out.print("\nBuenas tardes.");
                break;

            case 21, 22, 23, 0, 1, 2, 3, 4, 5:
                System.out.print("\nBuenas noches.");
                break;

            default:
                System.out.print("\nLa hora introducida no es correcta.");
                break;
        }

        //Cerramos el Scanner
        sc.close();

    }



}