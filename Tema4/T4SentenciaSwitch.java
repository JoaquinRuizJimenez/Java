import java.util.Scanner;

public class T4SentenciaSwitch {

    public static void main(String[] args){

        System.out.print("Escriba una nota: ");

        Scanner sc = new Scanner(System.in);

        int nota = sc.nextInt();
        String notaTexto;

        switch (nota){

            case 0,1,2,3,4:
                notaTexto = "Has suspendido";
                break;
            case 5:
                notaTexto = "Has aprobado";
                break;
            case 6:
                notaTexto = "Has sacado un bien";
                break;
            case 7, 8:
                notaTexto = "Has sacado un notable";
                break;
            case 9, 10:
                notaTexto = "¡Enhorabuena, tienes un sobresaliente!";
                break;
            default:
                notaTexto = "ERROR";
        }

        System.out.println(notaTexto);
        sc.close();
    }

}
