import java.util.Scanner;

public class Pares {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedir los tres números
        System.out.print("Ingresa el valor de a: ");
        int a = sc.nextInt();
        System.out.print("Ingresa el valor de b: ");
        int b = sc.nextInt();
        System.out.print("Ingresa el valor de c: ");
        int c = sc.nextInt();

        // Calcular las sumas de los pares
        int ab = a + b;
        int bc = b + c;
        int ac = a + c;

        int resultado;

        // Caso especial: si a+c = 10 → resultado = 1
        if (ac == 10) {
            resultado = 1;
        }
        // Si cualquier otro par da 10 → resultado = 10
        else if (ab == 10 || bc == 10) {
            resultado = 10;
        }
        // Si ab es 10 mayor que bc o ac → resultado = 5
        else if (ab == bc + 10 || ab == ac + 10) {
            resultado = 5;
        }
        // En otro caso → 0
        else {
            resultado = 0;
        }

        // Mostrar el resultado
        System.out.println("El resultado es: " + resultado);
    }
}
