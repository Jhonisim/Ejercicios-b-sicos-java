package bibliotecaejercicios;
import java.util.Scanner;

public class Y_CompVirt {
    private Scanner scanner;
    private String registroVehiculos;

    public Y_CompVirt () {
        scanner = new Scanner(System.in);
        registroVehiculos = "";
    }

    public void registrarVehiculos() {
        System.out.print("Ingrese el número de vehículos a registrar: ");
        int cantidad = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingrese la placa del vehículo: ");
            String placa = scanner.nextLine();
            System.out.print("Ingrese la hora de ingreso: ");
            String horaIngreso = scanner.nextLine();

            registroVehiculos += "Vehículo: " + placa + " - Hora de ingreso: " + horaIngreso + "\n";
        }
    }

    public void mostrarVehiculos() {
        System.out.println("\nRegistro de vehículos:");
        System.out.println(registroVehiculos.isEmpty() ? "No se registraron vehículos." : registroVehiculos);
    }
}
