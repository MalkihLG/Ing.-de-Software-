import java.util.Scanner;

public class MultaVelocidad {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedir la velocidad
        System.out.print("Ingresa tu velocidad: ");
        int velocidad = sc.nextInt();

        // Preguntar si es tu cumpleaños
        System.out.print("¿Es tu cumpleaños?");
        String respuesta = sc.next();

        // Definir límites base
        int limite1 = 60;
        int limite2 = 80;

        // Si es cumpleaños, subir límites en 5
        if (respuesta.equalsIgnoreCase("si")) {
            limite1 = 65;
            limite2 = 85;
        }

        int resultado = 0; // por defecto sin multa

        // Revisar los rangos
        if (velocidad <= limite1) {
            resultado = 0; // sin multa
        } else if (velocidad <= limite2) {
            resultado = 1; // multa pequeña
        } else {
            resultado = 2; // multa grande
        }

        // Mostrar el resultado
        System.out.println("El resultado es: " + resultado);

        sc.close();
    }
}
