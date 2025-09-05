import java.util.Scanner;

public class EnterosOrdenados {

    // Función que revisa si están en orden
    static boolean enOrden(int a, int b, int c, boolean equalOk) {
        if (equalOk) {
            return (a <= b && b <= c); // permite igualdad
        } else {
            return (a < b && b < c);   // estrictamente crecientes
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entrada
        System.out.print("Ingrese a: ");
        int a = sc.nextInt();
        System.out.print("Ingrese b: ");
        int b = sc.nextInt();
        System.out.print("Ingrese c: ");
        int c = sc.nextInt();

        // Aquí decides si quieres permitir igualdad o no:
        boolean equalOk = true;   // <-- cámbialo a false si no quieres permitir igualdad

        // Salida
        System.out.println(enOrden(a, b, c, equalOk));

        sc.close();
    }
}
