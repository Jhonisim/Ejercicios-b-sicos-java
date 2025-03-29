package bibliotecaejercicios;
import java.util.Scanner;

public class M_CompraOnline {
    private double precio;
    private int cantidad;
    private double total;

    public M_CompraOnline () {
    
    }

    public void inicio(Scanner scanner) {
        System.out.print("Ingrese el precio del producto: ");
        precio = scanner.nextDouble();
        System.out.print("Ingrese la cantidad: ");
        cantidad = scanner.nextInt();
    }

    public void proceso() {
        total += precio * cantidad;
    }

    public void resultado() {
        System.out.println("Costo total de la compra: " + total);
    }
}