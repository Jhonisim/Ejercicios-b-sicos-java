package bibliotecaejercicios;
import java.util.Scanner;

public class U_Calificacion {
    private Scanner scanner;
    private double totalNotas;
    private int cantidadNotas;

    public U_Calificacion () {
        scanner = new Scanner(System.in);
        totalNotas = 0;
        cantidadNotas = 0;
    }

    public void gestionarNotas() {
        ingresarNotas();
        calcularPromedio();
    }

    private void ingresarNotas() {
        String respuesta;
        do {
            System.out.print("Ingresa la nota del examen: ");
            double nota = scanner.nextDouble();
            scanner.nextLine(); 
            totalNotas += nota;
            cantidadNotas++;
            System.out.print("¿Deseas ingresar otra nota? (si/no): ");
            respuesta = scanner.nextLine().toLowerCase();
        } while (respuesta.equals("si"));
    }

    private void calcularPromedio() {
        if (cantidadNotas == 0) {
            System.out.println("No se ingresaron notas.");
            return;
        }
        double promedio = totalNotas / cantidadNotas;
        System.out.println("Promedio de notas: " + promedio);
        if (promedio >= 3.0) {
            System.out.println("¡Aprobado!");
        } else {
            System.out.println("Reprobado.");
        }
    }

}