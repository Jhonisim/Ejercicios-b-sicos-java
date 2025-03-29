package bibliotecaejercicios;
import java.util.Scanner;

public class Q_Adivina {
    private int numeroAleatorio;
    private int intento;

    public Q_Adivina () {
        numeroAleatorio = (int) (Math.random() * 100) + 1;
    }

    public void inicio(Scanner scanner) {
    }

    public void proceso(Scanner scanner) {
        System.out.print("Adivina el número (entre 1 y 100): ");
        intento = scanner.nextInt();
    }

    public void resultado() {
        while (intento != numeroAleatorio) {
            if (intento < numeroAleatorio) {
                System.out.println("El número es mayor.");
            } else {
                System.out.println("El número es menor.");
            }
            proceso(new Scanner(System.in)); // Aquí se debe pasar el scanner.
        }
        System.out.println("¡Felicidades! Adivinaste el número.");
    }

}