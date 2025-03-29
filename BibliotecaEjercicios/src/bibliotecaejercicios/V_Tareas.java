package bibliotecaejercicios;
import java.util.Scanner;

public class V_Tareas {
    private Scanner scanner;
    private String tareas;

    public V_Tareas () {
        scanner = new Scanner(System.in);
        tareas = "";
    }

    public void inicio() {
        String respuesta;
        do {
            System.out.print("Ingrese la tarea: ");
            String tarea = scanner.nextLine();
            System.out.print("Fecha de vencimiento (dd/mm/yyyy): ");
            String fecha = scanner.nextLine();
            tareas += "Tarea: " + tarea + " - Vence el: " + fecha + "\n";
            System.out.print("¿Agregar otra tarea? (si/no): ");
            respuesta = scanner.nextLine().toLowerCase();
        } while (respuesta.equals("si"));
    }

    public void resultado() {
        System.out.println("Lista de tareas registradas:");
        System.out.println(tareas.isEmpty() ? "No se registraron tareas." : tareas);
    }
}