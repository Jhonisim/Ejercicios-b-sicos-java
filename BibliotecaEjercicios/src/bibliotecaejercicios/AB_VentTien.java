package bibliotecaejercicios;
import java.util.Scanner;

public class AB_VentTien {
    private Scanner scanner;
    private int cantidadProductos;
    private double totalVentas;
    private String listaProductos;

    public AB_VentTien () {
        scanner = new Scanner(System.in);
        totalVentas = 0.0;
        listaProductos = "";
    }

    public void inicio() {
        System.out.print("¿Cuántos productos deseas registrar? ");
        cantidadProductos = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer
    }

    public void proceso() {
        for (int i = 1; i <= cantidadProductos; i++) {
            System.out.println("Producto " + i);
            System.out.print("Nombre del producto: ");
            String nombre = scanner.nextLine();
            System.out.print("Precio del producto: ");
            double precio = scanner.nextDouble();
            System.out.print("Cantidad vendida: ");
            int cantidad = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            double totalProducto = precio * cantidad;
            totalVentas += totalProducto;
            listaProductos += nombre + " - Cantidad: " + cantidad + " - Total: $" + totalProducto + "\n";
        }
    }

    public void resultado() {
        System.out.println("\nProductos vendidos:");
        System.out.println(listaProductos);
        System.out.println("Total de ventas: $" + totalVentas);
    }
}