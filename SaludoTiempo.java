import java.util.Scanner;

public class SaludoTiempo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entrada
        System.out.print("Ingrese la hora del día (0-23): ");
        int hora = sc.nextInt();

        // Proceso y comparación
        if (hora >= 0 && hora <= 23) {
            switch(hora) {
                case 6,7,8,9,10,11,12:
                    System.out.println("Buenos días");
                    System.out.println("Has ingresado una hora dentro del rango de la mañana.");
                    break;
                case 13,14,15,16,17,18,19,20:
                    System.out.println("Buenas tardes");
                    System.out.println("Has ingresado una hora dentro del rango de la tarde.");
                    break;
                case 21,22,23,0,1,2,3,4,5:
                    System.out.println("Buenas noches");
                    System.out.println("Has ingresado una hora dentro del rango de la noche.");
                    break;
            }
        } else {
            System.out.println("Hora no válida, ingresa otra hora.");
        }

        sc.close();
    }
}
