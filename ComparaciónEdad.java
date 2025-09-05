import java.util.Scanner;

public class ComparaciónEdad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedir la edad al usuario
        System.out.print("Introduce tu edad: ");
        int edad = sc.nextInt();

        // Uso de estructuras if
        if (edad < 18) {
            System.out.println("Menor de edad.");
        } else if (edad < 65) {
            System.out.println("Mayor de edad.");
        } else {
            System.out.println("Adulto mayor.");
        }

        sc.close();
    }
}
