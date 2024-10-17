
public class T3Ejemplos {

    public static void main(String[] args) {

        String nombre;
        System.out.print("Dime como te llamas: ");
        nombre = System.console().readLine();
        System.out.println("Hola " + nombre + ", encantado de conocerte");

        //Preguntamos por la edad
        System.out.print("Dime tu edad: ");

        //Leemos la edad
        String edadString = System.console().readLine();

        //Cambiamos la cadena de caracteres que hemos leido por un int
        int edad = Integer.parseInt(edadString);
        
        //Escribimos la edad
        System.out.println("Asi que tienes " + edad + " años");


    }


}