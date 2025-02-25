package bibliotecaejercicios;
import java.util.Scanner;

public class D_AscensorPisoPeso {
    public static void main(String[] args) {
        operar();
}
        
    public static void operar () {
        Scanner sc = new Scanner (System.in);
        int pisoActual = 1, pisoMin = 1, pisoMax = 15, pesoMax = 100;
        
        System.out.println("Ingrese el piso de destino: ");
        int pisoIr = sc.nextInt();
        
        System.out.println("Ingrese el peso total: ");
        int pesoTot = sc.nextInt();
        
        if (validarPiso(pisoIr, pisoMin, pisoMax)) {
            System.out.println("Moviendo el ascensor del piso " + pisoActual + " al piso " + pisoIr);
            pisoActual = pisoIr;
            System.out.println("El ascensor a llegado al piso " + pisoActual);
        } if (validarPeso(pesoMax, pesoTot)) {
            System.out.println("El peso esta dentro de lo permitodo.");
        } else {
            System.out.println("Error: piso invalido, Porfavor ingrese un piso entre el " + pisoMin + " y el piso "+ pisoMax);
        }
        
    }
    
    private static boolean validarPiso (int pisoIr, int pisoMin, int pisoMax) {
        return pisoIr >= pisoMin && pisoIr <= pisoMax;
    }
    
    private static boolean validarPeso (int pesoMax, int pesoTot) {
        return pesoTot >= pesoMax;
    }
}