

import java.util.Scanner;

/**
 * Calculadora de horas ordinarias y horas extra de trabajo
 */
public class T4E3HorasExtra {
    public static void main(String[] args) {
        // Declaraciones
        final float PRECIO_HORA = 12f;
        float horas;
        float sueldo;
        float horas_maximas = 40f;
        float precio_hora_extra = 16f;
        
        // Lee las horas trabajadas 
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el número de horas trabajadas durante la semana: ");
        horas = sc.nextFloat();


        if (horas <= 40){

            sueldo = horas * PRECIO_HORA;
            System.out.printf("El sueldo semanal que le corresponde es de %.2f euros. \n ", sueldo);

        } else{

            float horas_extra = horas - horas_maximas;
            sueldo = ((horas_extra * precio_hora_extra) + (horas_maximas * PRECIO_HORA));
            System.out.printf("El sueldo semanal que le corresponde es de %.2f euros", sueldo);

        }
        

        //Cierra scanner
        sc.close();

    }
}