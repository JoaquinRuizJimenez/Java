package Tema7;

import java.util.Random;
import java.util.Scanner;

public class T7E32 {

    final static int tamanio = 3;
    final static char[] fichas = {' ', 'X', 'O'};
    static int jugadas = 0;
    public static void main(String[] args) {
        
        //Declaraciones
        int[][] tablero = new int[tamanio][tamanio];    //Tablero con tamaño 3x3
        int turno = 0; //turno = 0 (ordenador) y turno = 1 (usuario)
        Scanner sc = new Scanner(System.in);


        //Inicializamos el tablero
        inicializaTablero(tablero);
        
        //Desarrollo del juego
        boolean terminado = false;   //Tablero lleno sin ganador
        boolean victoria = false;   //Alguien ha ganado
        int fila = 0;
        int columna;
        Random rand = new Random();


        while (!victoria && !terminado) {
            if (turno == 0) {   //Juega el ordenador
                do {
                    fila = rand.nextInt(3);
                    columna = rand.nextInt(3);
                } while (!posicionValida(tablero,fila,columna));
                
                tablero[fila][columna] = 1;
                turno = 1;      //Devuelve el turno al usuario
            } else{             //Juega el usuario
                do {
                    System.out.print("Introduzca coordenada vertical (a-c): ");
                    String sFila = sc.nextLine();
                    switch (sFila) {
                        case "a":
                            fila = 0;
                            break;
                    
                        case "b":
                            fila = 1;
                            break;
                        case "c":
                            fila = 2;
                            break;
                        default:
                            break;
                    }
                    System.out.println("");
                    System.out.print("Introduzca coordenada horizontal (0-2): ");
                    columna = sc.nextInt();
                } while (!posicionValida(tablero, fila, columna));
                tablero[fila][columna] = 2;
                turno = 0;      //Devuelve el turno al ordenador
            }
            jugadas++;
        }


        //Pintar el tablero
        pintaTablero(tablero);
                
        //Comprueba victoria
        victoria = compruebaVictoria(tablero);

        //Comprueba terminar
        terminado = compruebaTerminado(tablero);

        sc.close();
        }

        public static boolean compruebaTerminado(int[][] tablero){
            boolean check;

            if (jugadas == (tamanio*tamanio)) {
                check = true;
            } else{
                check = false;
            }
            return check;
        }

        public static boolean compruebaVictoria(int[][] tablero){


            return false;
        }
                

        public static void pintaTablero(int[][] tablero) {
        
            for(int fila = 0; fila < tamanio; fila++){

                for(int col = 0; col < tamanio; col++){
                    //Linea horizontal superior
                    if (col == 0)
                    //Contenido celda
                    if (col == 0) {
                        
                        String sFila = "";
                        switch (fila) {
                            case 0:
                                sFila = "a";
                                break;
                        
                            case 1:
                                sFila = "b";
                                break;
                            case 2:
                                sFila = "c";
                                break;
                            default:
                                break;
                        }

                        System.out.print(sFila + " |");
                    }
                    System.out.print(" "+ tablero[fila][col] + " ");

                }
                System.out.println("");
            }

            //Borde inferior
            System.out.print("   ");
            for(int i = 0; i < tamanio; i++){
                System.out.print(" "+ "---");
            }

            //Cordenadas horizontales
            System.out.println("");
            for(int i = 0; i < tamanio; i++){
                System.out.print(" " + i + " ");
            }

        }
        
        //Método para inicializar el tablero antes del juego
        public static void inicializaTablero(int[][] tablero) {
           
            for(int fila = 0; fila < tamanio; fila++){

                for(int col = 0; col < tamanio; col++){

                    tablero[fila][col] = 0;

                }
            }

        }

        public static boolean posicionValida(int[][] tablero, int fila, int columna){

            return (tablero[fila][columna] == 0 && (fila >= 0) && (fila < tamanio) && (columna >= 0) && (columna < tamanio));

        }


}