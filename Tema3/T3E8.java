import java.util.Scanner;

public class T3E8 {

    public static void main(String[] args){

        System.out.println("Introduce el numero de horas trabajadas a la semana:");

        Scanner sc = new Scanner(System.in);
        int horasTrabajadas = sc.nextInt();

        int salarioHora = 12;

        int salario = horasTrabajadas * salarioHora;

        System.out.println("Su salario semanal es de "+ salario +" euros.");

        sc.close();

    }
    
}
