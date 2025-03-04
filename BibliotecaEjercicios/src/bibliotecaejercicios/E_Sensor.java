package bibliotecaejercicios;
import java.util.Scanner;

public class E_Sensor {
    public static void main(String[] args) {
        sensor();
    }
    
    public static void sensor () {
        Scanner sc = new Scanner(System.in);
        
        int tempMin = 18, tempMax = 25;
        
        System.out.println("Ingrese la temperatura actual (°C): ");
        int temp = sc.nextInt();
        
        if (valiTemp(temp, tempMin, tempMax)) {
            System.out.println("La temperatura es adecuada.");
        } else {
            System.out.println("La temperatura está fuera del rango deseado.");
        }
        
        sc.close();
        
    }
    
    private static boolean valiTemp (int temp, int tempMin, int tempMax) {
        return temp >= tempMin && temp <= tempMax;
    }
    
}