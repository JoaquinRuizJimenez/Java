package Tema5;

import java.util.Scanner;

public class T5E4CajaFuerte {

    public static void main(String[] args){

        final int oportunidades = 4;
        int contador = 0;
        String combinacion = "0000";
        boolean acierto = false;
        Scanner sc = new Scanner(System.in);

        switch (combinacion.length()){
            case 1:
                combinacion = "000" + combinacion;
                break;
            case 2:
                combinacion = "00"+ combinacion;
                break;
            case 3:
                combinacion = "0"+ combinacion;
                break;
            default:
                break;

        }

        while (contador <= oportunidades && !acierto){
            System.out.print("Introduce la clave de la caja fuerte: ");
            String intento = sc.nextLine();

            //Comprueba 
            if (intento.equals(combinacion)){
                System.out.println("\033[1m;Se ha abierto la caja fuerte\033[0m");
                acierto = true;
            } else{
                System.out.println("Clave incorrecta");
                contador++;
            }


        }

        if(!acierto){
            System.out.println("Lo siento, ha agotado las 4 oportunidades \r\n");
            System.out.print("Se ha avisado a la policia.");
        }

        sc.close();
    }
    
}
