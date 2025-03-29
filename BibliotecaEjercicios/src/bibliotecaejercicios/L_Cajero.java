package bibliotecaejercicios;
import java.util.Scanner;

public class L_Cajero {
    private double saldo;
    private double monto;

    public L_Cajero() {
        
    }

    public void inicio(Scanner scanner) {
        System.out.print("Ingrese el monto que desea retirar: ");
        monto = scanner.nextDouble();
    }

    public void proceso() {
        if (monto > saldo) {
            System.out.println("Error: Monto superior al saldo disponible.");
        } else {
            saldo -= monto;
        }
    }

    public void resultado() {
        System.out.println("Saldo restante: " + saldo);
    }
}