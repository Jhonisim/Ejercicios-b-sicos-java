package bibliotecaejercicios;

import java.util.Scanner;

public class D_AscensorPro {
    public static void main(String[] args) {
        ascensorPro ();
    }

    public static void ascensorPro () {
        Scanner sc = new Scanner(System.in);
        
        int pisoMin = 1, pisoMax = 10;
        double pesoMax = 600;
        
        System.out.println("Ingrese su peso (kg): ");
        double peso = sc.nextDouble();
        
        System.out.println("Ingrese al piso que desea ir: ");
        int piso = sc.nextInt();
        
        if (validarPeso (peso, pesoMax) && validarPiso (piso, pisoMin, pisoMax)) {
            System.out.println("El ascensor se mueve al piso " + piso);
        } else {
            System.out.println("El asecensor esta sobre cargado o el piso no es valido.");
        }
        
        sc.close();
    }
    
    private static boolean validarPeso (double peso, double pesoMax) {
        return peso <= pesoMax;
    }
 
    private static boolean validarPiso (int piso, int pisoMin, int pisoMax) {
        return piso >= pisoMin && piso <= pisoMax;
    }
}