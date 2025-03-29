package bibliotecaejercicios;
import java.util.Scanner;

public class O_ViajeCarro {
    private double distancia;
    private double velocidad;

    public O_ViajeCarro () {
    
    }

    public void inicio(Scanner scanner) {
        System.out.print("Ingrese la distancia total del viaje (km): ");
        distancia = scanner.nextDouble();
        System.out.print("Ingrese la velocidad promedio del coche (km/h): ");
        velocidad = scanner.nextDouble();
    }

    public void resultado() {
        double tiempo = distancia / velocidad;
        System.out.println("El tiempo estimado de viaje es: " + tiempo + " horas.");
    }
}