package bibliotecaejercicios;
import java.util.Scanner;

public class H_CalculoIMC {
    public static void main(String[] args) {
        calcularIMC ();
    }
    
    private static void calcularIMC () {
        Scanner scanner = new Scanner(System.in);

        // Solicitar peso y altura al usuario
        System.out.print("Ingrese su peso en kilogramos: ");
        double peso = scanner.nextDouble();

        System.out.print("Ingrese su altura en metros: ");
        double altura = scanner.nextDouble();

        // Calcular el IMC
        double imc = peso / (altura * altura);

        // Determinar la categoría de IMC
        String categoria;
        switch ((int) imc) {
            case 0 -> categoria = "Bajo peso";
            case 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17 -> categoria = "Bajo peso";
            case 18, 19, 20, 21, 22, 23, 24 -> categoria = "Peso normal";
            case 25, 26, 27, 28, 29 -> categoria = "Sobrepeso";
            default -> categoria = "Obesidad";
        }

        // Mostrar el resultado
        System.out.printf("Su IMC es: %.2f\n", imc);
        System.out.println("Categoría: " + categoria);
    }
    
}
