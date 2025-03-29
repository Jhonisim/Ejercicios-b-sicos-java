package bibliotecaejercicios;
import java.util.Scanner;

public class K_Menu {
    private String plato;
    private double precio;
    private double total;
    
    public K_Menu() {
    
    }
    
    public void inicio(Scanner scanner) {
        System.out.print("Seleccione un plato (1 - Pasta, 2 - Pizza, 3 - Ensalada): ");
        plato = scanner.nextLine();
    }
    
    public void proceso() {
        switch (plato) {
            case "1":
                precio = 15000;
                break;
            case "2":
                precio = 20000;
                break;
            case "3":
                precio = 10000;
                break;
            default:
                System.out.println("Plato no válido.");
        }
        total += precio;
    }
    
    public void resultado() {
        System.out.println("El costo total de los pedidos es: " + total);
        System.out.println("¡Gracias por su compra!");
    }
    
}