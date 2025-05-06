package Pruebas;

public class fibonacci {
        
        public static void main(String[] args) {
            
            int n = 10; // Número de términos de la serie Fibonacci que deseas imprimir
            int a = 0, b = 1, c;
            
            System.out.print("Serie Fibonacci: " + a + ", " + b);
            
            for (int i = 2; i < n; i++) {
                c = a + b;
                System.out.print(", " + c);
                a = b;
                b = c;
            }
            
        }
}
