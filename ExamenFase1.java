import java.util.Scanner;

public class ExamenFase1 {
    
    public static void main(String[] args) {

        //Declaraciones
        Scanner sc = new Scanner(System.in);
        long valorMin = 0;
        long valorMax = 0;
        final String color = "C";
        final String blancoYNegro = "B";
        String eleccionColor = "";

        
        System.out.println("GRAPHIFY");

        try {
            System.out.print("Introduce el valor mínimo del rango: ");
            valorMin = sc.nextInt();
            if (valorMin < 0){
                System.out.println("ERROR: El valor minimo debe ser mayor a 0.");
                System.out.print("Por favor, introduzca el valor de nuevo: ");
                sc.nextLine();
            }
        } catch (Exception e) {
            System.out.println("ERROR: Eso no es un valor válido.");
            System.out.print("Por favor, introduzca el valor de nuevo: ");
            sc.nextLine();
        }


        try {
            System.out.print("\nIntroduce el valor máximo del rango: ");
            valorMax = sc.nextInt();
            if(valorMax < valorMin){
                System.out.println("ERROR: El valor máximo debe ser mayor que el valor mínimo.");
                System.out.print("Por favor, introduzca de nuevo el valor máximo del rango: ");
                sc.nextLine();
            }
        } catch (Exception e) {
            System.out.println("ERROR: El valor introducido no es un valor válido.");
            System.out.print("Por favor, introduzca de nuevo el valor máximo del rango: ");
            sc.nextLine();
        }


        try {
            System.out.print("\nDibujo la gráfica en blanco y negro o en color (B/C)");
            eleccionColor = sc.nextLine();
            if (eleccionColor == color){
                System.out.println("Ha elegido a color");
                System.out.println("\1m");
            }
        } catch (Exception e) {
            System.out.print("\nERROR: Se aplicara automáticamente el blanco y negro.");
        }

        


    }

}
