import java.util.Random;
import java.util.Scanner;

//Joaquín Ruiz Jiménez 1ºDAW Tarde Examen Programación


    
public class ExamenFase3 {

    //Hacemos las declaraciones de todos los coloes
    public static final String RESET = "\033[0m";
    public static final String RED_BACKGROUND = "\033[41m";
    public static final String GREEN_BACKGROUND = "\033[42m";
    public static final String BLUE_BACKGROUND = "\033[44m";
    public static final String PURPLE_BACKGROUND = "\033[45m";


    public static String getColorBackground(int digit) {
        if (digit <= 4) return BLUE_BACKGROUND;
        if (digit <= 6) return RED_BACKGROUND;
        if (digit <= 8) return GREEN_BACKGROUND;
        return PURPLE_BACKGROUND;
    }
    public static void main(String[] args) {
       
        //Declaraciones iniciales
            Scanner sc = new Scanner(System.in);
            Random random = new Random();
            int valorMin = 0;
            int valorMax = 0;

           
            //Pedimos por teclado el valor mínimo
            try {
                System.out.print("Introduce valor mínimo del rango: ");
                valorMin = sc.nextInt();
                if (valorMin < 0) {
                    System.out.println("ERROR: El valor del numero pequeño debe ser mayor a 0");
                }
            } catch (Exception e) {
                System.out.println("ERROR: El valor introducido no es un valor válido");
                System.out.print("Por favor, introduzca de nuevo un valor: ");
                sc.nextLine();
            }

            //Pedimos por teclado el valor máximo
            try {
                System.out.print("Introduce el valor máximo del rango: ");
                valorMax = sc.nextInt();
                if (valorMax < valorMin) {                                                                      //Si el valor máixmo es menor al valor mínimo mostramos mensaje de error y pedimos el valor máximo de nuevo.
                    System.out.println("ERROR: El valor máximo no puede ser más pequeño que el mínimo.");
                    System.out.println("Por favor, introduzca de nuevo un valor: ");
                    sc.nextLine();
                }
            } catch (Exception e) {                                                             //Si el valor introducido no es válido mostramos mensaje de error y pedimos de nuevo
                System.out.println("ERROR: El valor introducido no es un valor válido");
                System.out.println("Por favor, introduzca un nuevo valor: ");
                sc.nextLine();
            }

            //Pedimos si quiere a color o en blanco y negro

            String color = "";

            //Pedimos por teclado si queremos el cuadrado a color o en blanco y negro
            try{
            System.out.print("¿Quieres que sea a color(C) o en blanco y negro(B)? (B/C): ");
            color = sc.next().toLowerCase();                //Transformamos el valor introducido en minúscula para evitar errores
                if (color.length() > 1) {
                    System.out.println("ERROR: El valor introducido ha de tener 1 digito únicamente.");     //En caso de que se intente introducir algún valor que tenga más 
                    System.out.println("Se aplicará automáticamente la opción 'blanco y negro' ");          //de un dígito, se selecciona automáticamente el blanco y negro. 
                    color = "b";
                }

            } catch (Exception e){
                System.out.println("ERROR: No se ha introducido un valor válido.");                 //En caso de que el valor introducido no sea válido, automáticamente aplicamos el blanco y negro
                System.out.println("Se eligirá automáticamente la opción 'blanco y negro' ");
                color = "b";
            }

            //PA  QUE NO TE PETE TIENES QUE, DESPUES DEL CATCH, DARLE AUTOMATICO EL VALOR DEL BLANCO Y NEGRO


            //Calculamos los numeros para sacar el random
            int numAleatorio = random.nextInt(valorMax - 1) + valorMin;


            //Le decimos al usuario cuál es el número elegido al azar y su longitud
            System.out.println("El número aleatorio es: "+ numAleatorio);


            //Dejamos un espacio en blanco
            System.out.println("");
            String prueba = Long.toString(numAleatorio);

            //Sacamos el cubo
            for(int digito : prueba.toCharArray()){
                int digito2 = Character.getNumericValue(digito);
               
   
                if (color.equals("c")) {
                    //Dibujamos la fila superior del cubo
                    for (int i = 0; i < 8 + 2; i++) {
                        System.out.print("+---");
                    }
                    System.out.println("+");
   
                    //Dibujamos la fila del contenido
                    System.out.print("| " + digito2 + " |");
                    for (int i = 0; i < 8+1; i++) {
                        if (i < digito2) {
                            System.out.print(getColorBackground(digito2) + "   " + RESET + "|");
                        } else {
                            System.out.print("   |");
                        }
                    }
                    System.out.println();
   
                   
                   
                }
                if (color.equals("b")) {
                    //Dibujamos la fila superior del cubo
                    for (int i = 0; i < 8 + 2; i++) {
                        System.out.print("+---");
                    }
                    System.out.println("+");
   
                    //Dibujamos la fila del contenido
                    System.out.print("| " + digito2 + " |");
                    for (int i = 0; i < 8+1; i++) {
                        if (i < digito2) {
                            System.out.print(" * |");
                        } else {
                            System.out.print("   |");
                        }
                    }

                    //Saltamos de línea
                    System.out.println();
   
                }
               
            }
            //Dibujamos la fila inferior del cubo
            System.out.print("+");
                for (int i = 0; i < 8+2; i++){
                    System.out.print("---+");
                }



            //Cerramos el Scanner
            sc.close();
    }
}


