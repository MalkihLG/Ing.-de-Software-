import java.util.Scanner;

public class MultaVelocidad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedir la velocidad a la que va
        System.out.print("Ingresa tu velocidad: ");
        int velocidad = sc.nextInt();
        sc.nextLine(); 

        // Preguntar si es cumpleaños
        System.out.print("¿Es tu cumpleaños? (si/no): ");
        String cumple = sc.nextLine();

        // Comparación y desición de la multa
        if (cumple.equalsIgnoreCase("si")) {
            System.out.println("No tienes una multa por que es tu cumpleaños");
        } else {
            if (velocidad < 60) {
                System.out.println("No tienes multa.");
            } else if (velocidad <= 80) {
                System.out.println("Tienes una multa pequeña.");
            } else {
                System.out.println("Tienes una multa grande.");
            }
        }

        sc.close();
    }
}
