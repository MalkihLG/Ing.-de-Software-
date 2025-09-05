import java.util.Scanner;

public class CalBasic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1, num2;
        char op;

        System.out.print("Ingresa el primer número: ");
        num1 = sc.nextInt();

        System.out.print("Ingresa el segundo número: ");
        num2 = sc.nextInt();

        System.out.print("Ingresa la operación (+, -, *, /): ");
        op = sc.next().charAt(0);  // lee solo un carácter

        switch (op) {
            case '+':
                System.out.println("Resultado: " + (num1 + num2));
                break;
            case '-':
                System.out.println("Resultado: " + (num1 - num2));
                break;
            case '*':
                System.out.println("Resultado: " + (num1 * num2));
                break;
            case '/':
                if (num2 != 0) {
                    System.out.println("Resultado: " + (num1 / num2));
                } else {
                    System.out.println("Error: no se puede realizar la división por cero");
                }
                break;
            default:
                System.out.println("Operador inválido, intenta con otro diferente");
        }

        sc.close();
    }
}
