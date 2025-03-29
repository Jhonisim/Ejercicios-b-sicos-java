package bibliotecaejercicios;
import java.util.Scanner;

public class P_CuentaAtras {
    private int numero;

    public P_CuentaAtras () {
    
    }

    public void inicio(Scanner scanner) {
        System.out.print("Ingrese un número entero positivo: ");
        numero = scanner.nextInt();
    }

    public void resultado() {
        while (numero >= 0) {
            System.out.println(numero);
            numero--;
        }
        System.out.println("¡Tiempo cumplido!");
    }
}