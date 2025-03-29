package bibliotecaejercicios;
import java.util.Scanner;

public class Z_Agenda {
    private Scanner scanner;
    private String listaContactos;
    private int numContactos;

    public Z_Agenda () {
        scanner = new Scanner(System.in);
        listaContactos = "";
    }

    public void inicio() {
        System.out.println("¿Cuántos contactos deseas agregar a la agenda?");
        numContactos = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer
    }

    public void proceso() {
        for (int contador = 1; contador <= numContactos; contador++) {
            System.out.println("Contacto " + contador);
            System.out.print("Nombre del contacto: ");
            String nombreContacto = scanner.nextLine();
            System.out.print("Número de teléfono: ");
            String numeroTelefono = scanner.nextLine();
            
            listaContactos += "Nombre: " + nombreContacto + " - Teléfono: " + numeroTelefono + "\n";
        }
    }

    public void resultado() {
        System.out.println("\nAgenda de contactos:");
        System.out.println(listaContactos);
    }
}