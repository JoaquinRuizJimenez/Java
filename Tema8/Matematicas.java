package Tema8;
import java.util.Scanner;

public class Matematicas {
    
    public static void main(String[] args) {

        //Declaraciones
        Scanner sc = new Scanner(System.in);
        int eleccion;

        System.out.println("Este programa puede realizar varios calculos.");
        System.out.println("Ahora veras el menú. Elige una opción (escribe el número de la funcion que quieres usar): ");

        System.out.println("1. 'esCapicua' (Comprueba que un número sea capicúa)");
        System.out.println("2. 'esPrimo' (Comprueba si un número es primo)");
        System.out.println("3. 'siguientePrimo' (Muestra el siguiente primo después de un número)");
        System.out.println("4. 'potencia' (Calcula la potencia de un número con un exponente)");
        System.out.println("5. 'digitos' (Cuenta el número de dígitos de un entero)");
        System.out.println("6. 'voltea' (Da la vuleta a un número)");
        System.out.println("7. 'digitoN' (Devuelve el digito que está en una posición)");
        System.out.println("8. 'posicionDeDigito' (Devuelve la posición de la primera ocurrencia de un dígito)");
        System.out.println("9. 'quitaPorDetras' (Quita un número de dígitos por detras)");
        System.out.println("10. 'quitaPorDelante' (Quita un nñumero de dígitos por delante)");
        System.out.println("11. 'pegaPorDetras' (Añade un dígito a un número por detras)");
        System.out.println("12. 'pegaPorDelante' (Añade un dígito a un número por delante)");
        System.out.println("13. 'trozoDeNumero' (Toma como parámetros las posiciones inicial y final dentro de un número y devuelve el trozo correspondiente.)");
        System.out.println("14. 'juntaNumeros' (Pega dos números dados para formar uno)");

        System.out.println("");
        System.out.print("Por favor, haga su elección: ");

        eleccion = sc.nextInt();

        switch (eleccion) {
            case 1:

                int capicua;
                System.out.print("Introduzca el número para comprobar si es capicúa: ");
                capicua = sc.nextInt();

                esCapicua(invertirEntero(capicua));

                if(){
                    System.out.println("El número introducido ("+ capicua +") es capicúa.");
                }else{
                    System.out.println("El número introducido ("+ capicua +") no es capicúa.");
                }
                
                
                break;
        
            default:
                break;
        }

    }



    //esCapicua
    public static int invertirEntero (int numero) {
        // Declaraciones
        int numeroInvertido = 0;

        while (numero != 0) {
            // Obtener el último dígito del número
            int digito = numero % 10;

            // Añadir el dígito al número invertido
            numeroInvertido = numeroInvertido * 10 + digito;

            // Eliminar el último número del número original
            numero /= 10;
        }

        // Devuelve el número invertido
        return numeroInvertido;
    }


    public static boolean esCapicua (int numero) {
        return (numero == invertirEntero(numero)); 
    }



    //2. esPrimo
    public static boolean esPrimo(int numero){

        //Declaraciones
        boolean primo = true;
        int contador = 2;

        numero = Math.abs(numero);
        while (primo && contador <= (numero / 2)){
            primo = (numero % contador != 0);
            contador++;
        }


        return primo;

    }

    //3. siguientePrimo
    public static int siguientePrimo(int numero){

        //Declaraciones
        int proximoPrimo = numero + 1;

        while (!esPrimo(proximoPrimo)) {
            proximoPrimo++;
        }

        return proximoPrimo;

    }

    //4. Potencia
    public static int potencia(){

        int base = 2;
        int exponente = 5;
        int potensia = 0;

        for(int i = 0; i <= exponente; i++){

            base = base * base;

        }
        
        potensia = base;

        return potensia;

    }

    //5. Digitos
    public String digitos(){

        String cadena ="";
        int cantidadDigitos = cadena.length();

        return "La cantidad de digitos en la cadena "+ cadena +" es "+ cantidadDigitos;


    }


    //6. Voltea

    public static int voltea (int numero) {
        // Declaraciones
        int numeroInvertido = 0;

        while (numero != 0) {
            // Obtener el último dígito del número
            int digito = numero % 10;

            // Añadir el dígito al número invertido
            numeroInvertido = numeroInvertido * 10 + digito;

            // Eliminar el último número del número original
            numero /= 10;
        }

        // Devuelve el número invertido
        return numeroInvertido;
    }


    //7. digitoN
    public static int digitoN(int numero){

        int digitoEnPosicion;
        String numeroString = ""+ numero;
        int posicion = 4;

        digitoEnPosicion = numeroString.charAt(posicion);

        return digitoEnPosicion;

    }


    //8. posicionDeDigito

    public static int posicionDeDigito(){

        int numero = 12345678;
        String cadena = ""+ numero;
        int posicion = 0;
        int numeroABuscar = 5;
        boolean verificar = false;

        while (verificar != true) {
            
            for(int i = 0; i <= cadena.length(); i++){

                if(numeroABuscar != cadena.charAt(i)){
                    posicion++;
                }

            }

        }

        return posicion;


    }


    //9. quitaPorDetras
    public static int quitaPorDetras(int numero){
        //Declaraciones
        String cadena = ""+ numero;
        int numerosQuitar = 3;
        int numerosTotal = cadena.length() - numerosQuitar;
        

        

    }

    //10. quitaPorDelante
    public static int quitaPorDelante(int numero){



    }

    //11. pegaPorDetras
    public static String pegaPorDetras(int numero){

        numero = 340;
        int suma = 10;
        String pegados = numero +""+ suma;

        
        return pegados;

    }

    //12. pegaPorDelante
    public static String pegaPorDelante(int numero){

        numero = 340;
        int suma = 10;
        String pegados = suma + "" + numero ;

        
        return pegados;

    }

    //13. trozoDeNumero
    public String trozoDeNumero(int numero){

        //Declaraciones
        int posicionFinal = 5;
        String numeroString = ""+ numero;
        String resultado = "";

        for(int i = 0; i < posicionFinal; i++){

            resultado = resultado + numeroString.charAt(i);

        }

        return resultado;

    }

    //14. juntaNumeros
    public static String juntaNumeros(){

        //Declaraciones
        int numero1 = 01234;
        int numero2 = 56789;
        String concatenados = numero1 +""+ numero2;

        return concatenados;

    }



}
