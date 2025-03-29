package bibliotecaejercicios;
import java.util.Scanner;

public class W_Ventas {
    private Scanner scanner;
    private String ventas;
    private double total;

    public W_Ventas () {
        scanner = new Scanner(System.in);
        ventas = "";
        total = 0;
    }

    public void inicio() {
        String respuesta;
        do {
            System.out.print("Ingrese el nombre del producto: ");
            String producto = scanner.nextLine();
            System.out.print("Ingrese el precio del producto: ");
            double precio = scanner.nextDouble();
            scanner.nextLine(); 
            ventas += "Producto: " + producto + " - Precio: $" + precio + "\n";
            total += precio;
            System.out.print("¿Registrar otra venta? (si/no): ");
            respuesta = scanner.nextLine().toLowerCase();
        } while (respuesta.equals("si"));
    }

    public void resultado() {
        System.out.println("Ventas registradas:");
        System.out.println(ventas.isEmpty() ? "No hay ventas registradas." : ventas);
        System.out.println("Total de ventas: $" + total);
    }
}