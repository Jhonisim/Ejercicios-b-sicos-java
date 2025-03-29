package bibliotecaejercicios;
import java.util.Scanner;

public class S_ComidaRapida {
    private String opcion;
    private double precio;
    private double total;

    public S_ComidaRapida () {
        
    }

    public void inicio(Scanner scanner) {
        System.out.print("Seleccione una opción de menú (1 - Hamburguesa, 2 - Pizza, 3 - Hot Dog): ");
        opcion = scanner.nextLine();
    }

    public void proceso() {
        switch (opcion) {
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
                System.out.println("Opción no válida.");
                return;
        }
        total += precio;
    }

    public void resultado() {
        System.out.println("El costo total de los pedidos es: " + total);
        System.out.println("¡Gracias por su compra!");
    }

}