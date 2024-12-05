import java.util.Scanner;

public class ExamenFase2 {

    public static void main(String[] args) {

        //Declaraciones
        Scanner sc = new Scanner(System.in);
        long valorMin = 0;
        long valorMax = 0;
        final String color = "C";
        final String blancoYNegro = "B";
        String eleccionColor = "";

        
        //Presentamos el programa
        System.out.println("GRAPHIFY");
        System.out.println("======================");

        //Pedimos el valor mínimo del rango
        try {
            System.out.print("Introduce el valor mínimo del rango: ");
            valorMin = sc.nextInt();
            if (valorMin < 0){                                      //Si el valor es menos a 0, hacemos que pregunte de nuevo.
                System.out.println("ERROR: El valor minimo debe ser mayor a 0.");
                System.out.print("Por favor, introduzca el valor de nuevo: ");
                sc.nextLine();
            }
        } catch (Exception e) {                                                 //Si se diera un error, preguntaremos de nuevo.
            System.out.println("ERROR: Eso no es un valor válido.");
            System.out.print("Por favor, introduzca el valor de nuevo: ");
            sc.nextLine();
        }


        //Pedimos el valor máximo del rango
        try {
            System.out.print("\nIntroduce el valor máximo del rango: ");
            valorMax = sc.nextInt();
            if(valorMax < valorMin){                                                                //Si el valor máximo es menor que el valor mínimo, mostramos un mensaje de error y preguntamos de nuevo.
                System.out.println("ERROR: El valor máximo debe ser mayor que el valor mínimo.");
                System.out.print("Por favor, introduzca de nuevo el valor máximo del rango: ");
                sc.nextLine();
            }
        } catch (Exception e) {                                                                     //En caso de error, mostramos mensaje y pedimos de nuevo.
            System.out.println("ERROR: El valor introducido no es un valor válido.");
            System.out.print("Por favor, introduzca de nuevo el valor máximo del rango: ");
            sc.nextLine();
        }


        //Preguntamos si hacemos la tabla a color o en blanco y negro
        try {                               
            System.out.print("\nDibujo la gráfica en blanco y negro o en color (B/C)");
            eleccionColor = sc.nextLine();
            
            if (eleccionColor == color){
                System.out.println("Ha elegido a color");
                System.out.println("\1m");
            }
        } catch (Exception e) {                                                                     //En caso de error, se aplica automáticamente el blanco y negro
            System.out.print("\nERROR: Se aplicara automáticamente el blanco y negro.");
            eleccionColor = blancoYNegro;
        }

        //Dejamos un espacio en blanco
        System.out.println("");

        //Generamos el número aleatorio entre los valores 'valorMin' y 'valorMax' y lo guardamos.
        double valorAleatorio = (Math.random()* valorMax + valorMin);

        //Convertimos el double a int
        int valorAleatorioInt = (int) valorAleatorio;


        //Convertimos cada dígito en un String.
        String numerosColumna = String.valueOf(valorAleatorioInt);


        //Imprimimos cada digito
        for(int i = 0; i < numerosColumna.length(); i++){
            System.out.println(numerosColumna.charAt(i));
        }


        // Declaraciones sobre la tabla
        final String Borde_H = " ---";
        final String Borde_V = "|";
        int alto = numerosColumna.length();
        int ancho = 10;

        //Imprimimos la tabla
        // Filas
        for (int filas = 0; filas < alto; filas++) {
            String bordesHorizontales = "";
            String bordesVerticales = "";

            // Columnas
            for (int columnas = 0; columnas < ancho; columnas++) {

                //Bordes horizontales
                bordesHorizontales = bordesHorizontales + Borde_H;
                if (columnas == 0){
                    bordesVerticales = bordesVerticales + Borde_V;
                    bordesVerticales = bordesVerticales + "   " + Borde_V;
                }
            }


            //Borde superior
            if (filas == 0){
                System.out.println(bordesHorizontales);
            }
            
            //Borde izquierdo y derecho
            System.out.println(bordesVerticales);

            //Borde inferior
            System.out.println(bordesHorizontales);

       
        }


        

        //Cerramos el Scanner
        sc.close();

    }
    
}
