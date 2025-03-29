package bibliotecaejercicios;
import java.util.Scanner;

public class T_SensorTepera {
    private double temperatura;

    public T_SensorTepera () {
    
    }

    public void inicio(Scanner scanner) {
        System.out.print("Ingrese la temperatura actual (°C): ");
        temperatura = scanner.nextDouble();
    }

    public void proceso() {
        
    }

    public void resultado() {
        while (temperatura < 18 || temperatura > 25) {
            System.out.println("Temperatura fuera del rango aceptable.");
            System.out.print("Ingrese una nueva temperatura (°C): ");
            Scanner sc = new Scanner(System.in); // Aquí también se crea un nuevo scanner
            temperatura = sc.nextDouble();
        }
        System.out.println("Temperatura aceptable: " + temperatura + "°C");
    }
}