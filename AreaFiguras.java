import java.util.Scanner;

public class AreaFiguras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcion;
        double radio, lado, base, altura, area;

        System.out.println("Menú de Figuras");
        System.out.println("1. Círculo");
        System.out.println("2. Cuadrado");
        System.out.println("3. Rectángulo");
        System.out.println("4. Triángulo");
        System.out.print("Elige una figura: ");
        opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                System.out.print("Ingresa la medida del radio: ");
                radio = sc.nextDouble();
                area = Math.PI * radio * radio;
                System.out.println("El área del círculo es: " + area);
                break;
            case 2:
                System.out.print("Ingresa la medida de un lado: ");
                lado = sc.nextDouble();
                area = lado * lado;
                System.out.println("El área del cuadrado es: " + area);
                break;
            case 3:
                System.out.print("Ingresa la medida de la base: ");
                base = sc.nextDouble();
                System.out.print("Ingresa la medida de la altura: ");
                altura = sc.nextDouble();
                area = base * altura;
                System.out.println("El área del rectángulo es: " + area);
                break;
            case 4:
                System.out.print("Ingresa la medida de la base: ");
                base = sc.nextDouble();
                System.out.print("Ingresa la medida de la altura: ");
                altura = sc.nextDouble();
                area = (base * altura) / 2;
                System.out.println("El área del triángulo es: " + area);
                break;
            default:
                System.out.println("Opción inválida, intenta de nuevo");
        }

        sc.close();
    }
}
