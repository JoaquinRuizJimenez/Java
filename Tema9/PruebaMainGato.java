package Tema9;

import java.util.Scanner;

public class PruebaMainGato {
    
    public static void main(String[] args) {
        
        //Declaraciones
        Scanner sc = new Scanner(System.in);

        int[][] tablero = new int[4][4];

        //Constructor vacío

        Gato silvestre = new Gato();


        //Constructor simple

        Gato felix = new Gato("macho");


        //Constructor completo
        Gato tom = new Gato("gris", "atigrado", "macho", 12, 6.57);



        System.out.println("Tenemos dos gatos, Felix y Tom. Felix es un gato "+ felix.sexo +" y Tom es un gato "+ tom.sexo +".");



    }

}
