package bibliotecaejercicios;
import java.util.Scanner;

public class AA_Suma {
    private Scanner scanner;
    private int cantidadNumeros;
    private double suma;

    public AA_Suma () {
        scanner = new Scanner(System.in);
        suma = 0.0;
    }

    public void inicio() {
        System.out.print("¿Cuántos números deseas sumar? ");
        cantidadNumeros = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer
    }

    public void proceso() {
        for (int i = 1; i <= cantidadNumeros; i++) {
            System.out.print("Ingresa el número " + i + ": ");
            if (scanner.hasNextDouble()) {
                double numero = scanner.nextDouble();
                suma += numero;
            } else {
                System.out.println("¡Entrada inválida! Debes ingresar un número.");
                scanner.next(); // Limpiar la entrada incorrecta
                i--; // Repetir la iteración actual
            }
            scanner.nextLine(); // Limpiar el buffer
        }
    }

    public void resultado() {
        System.out.println("\nLa suma total de los números es: " + suma);
    }
}