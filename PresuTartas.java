import java.util.Scanner;

public class PresuTartas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String sabor, tipoChocolate, respuestaSnack, respuestaNombre, seguirSnack;
        int total = 0, precioBase = 0, precioSnack = 0, precioNombre = 0;

        // Entrada: sabor de la tarta
        System.out.print("Ingresa el sabor de la tarta (manzana, fresa, chocolate): ");
        sabor = sc.nextLine().toLowerCase();

        // Selección del sabor
        switch (sabor) {
            case "manzana":
                precioBase = 200;
                break;
            case "fresa":
                precioBase = 250;
                break;
            case "chocolate":
                System.out.print("¿Qué chocolate prefieres? (negro o blanco): ");
                tipoChocolate = sc.nextLine().toLowerCase();

                switch (tipoChocolate) {
                    case "negro":
                        precioBase = 280;
                        break;
                    case "blanco":
                        precioBase = 300;
                        break;
                    default:
                        System.out.println("Tipo de chocolate no válido, ingresa otro tipo");
                        total = 0;
                        break;
                }
                break;
            default:
                System.out.println("Sabor no válido, ingresa un sabor válido");
                total = 0;
                break;
        }

        // Agregar snacks uno por uno
        System.out.print("¿Quieres añadir snacks? (si/no): ");
        respuestaSnack = sc.nextLine().toLowerCase();
        while (respuestaSnack.equals("si")) {
            precioSnack += 25;
            System.out.print("¿Quieres agregar otro snack? (si/no): ");
            seguirSnack = sc.nextLine().toLowerCase();
            respuestaSnack = seguirSnack;
        }

        // Preguntar si desea personalizar con nombre
        System.out.print("¿Quieres personalizar la tarta con un nombre? (si/no): ");
        respuestaNombre = sc.nextLine().toLowerCase();
        if (respuestaNombre.equals("si")) {
            precioNombre = 30;
        }

        // Calcular total
        total = precioBase + precioSnack + precioNombre;

        // Salida
        System.out.println("El precio total de la tarta es $" + total + " pesos");

        sc.close();
    }
}
