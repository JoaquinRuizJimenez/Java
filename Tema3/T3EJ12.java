import java.util.Scanner;

public class T3EJ12 {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca la nota del primer exámen:");
        double nota1 = sc.nextDouble();

        System.out.println("¿Que nota desea tener en el trimestre?:");
        double notaTrimestre = sc.nextDouble();

        double nota2 = (nota1*(4d/10d) + notaTrimestre*(6d/10d)) ;

        System.out.println("Para tener un "+ notaTrimestre +" en el trimestre necesitas un "+ nota2 +" en el segundo exámen.");

        sc.close();
    }

}
