import java.util.Scanner;

public class VerificarEdad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedir la edad al usuario
        System.out.print("¿Qué edad tienes? ");
        int edad = sc.nextInt();

        // Uso de estructuras if
        if (edad < 18) {
            System.out.println("Eres menor de edad");
        } else if (edad >= 18 && edad < 65) {
            System.out.println("Eres mayor de edad");
        } else if (edad >= 65) {
            System.out.println("Eres adulto mayor");
        }

        sc.close();
    }
}
