import java.util.Scanner;

public class T4Ejemplo2{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int contador = 0;
        int suma = 0;
        int numero;

        do{

            numero = sc.nextInt();
            if (numero !=0) contador++;
            suma = suma + numero;
            

        } while (numero != 0);

        System.out.println("Se han introducido "+ contador +" numeros en totla y "+
        "la suma de todos ellos es "+ suma +".");

        sc.close();

    }

}