package bibliotecaejercicios;
import java.util.Scanner;

public class X_Parqueadero {
    private Scanner scanner;
    private String registroVehiculos;

    public X_Parqueadero () {
        scanner = new Scanner(System.in);
        registroVehiculos = "";
    }

    public void registrar() {
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

    public void mostrar() {
        System.out.println("\nRegistro de vehículos:");
        System.out.println(registroVehiculos.isEmpty() ? "No se registraron vehículos." : registroVehiculos);
    }
}
