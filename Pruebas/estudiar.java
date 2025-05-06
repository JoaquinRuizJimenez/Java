package Pruebas;

import java.util.Random;
import java.util.Scanner;



public class estudiar {
    public static void main(String[] args) {

        //Declaración de variables
        Scanner sc = new Scanner(System.in);


        System.out.println("Bienvenido al programa de estudio.");
        System.out.println("¿Qué tema deseas estudiar? (1-5)");
        System.out.println("1. Tema 1");
        System.out.println("2. Tema 2");
        System.out.println("3. Tema 3");
        System.out.println("4. Tema 4");
        System.out.println("5. Tema 5");
        int tema = sc.nextInt();

        System.out.println("Estudiando el tema " + tema + "...");

        estudiarTema(tema);

        sc.close();
    }

    public static void estudiarTema(int tema) {
        // Simulación de estudio
        int tiempoEstudio = 5;
        Random rand = new Random();
        boolean temaAprendido = rand.nextBoolean(); // Simula si el tema fue aprendido o no

        System.out.println("Estudiando el tema " + tema + " durante " + tiempoEstudio + " minutos...");
       

        if (temaAprendido) {
            System.out.println("¡Has aprendido el tema " + tema + "!");
        } else {
            System.out.println("No has aprendido el tema " + tema + ". Intenta de nuevo.");
            
        }
        

    }


}