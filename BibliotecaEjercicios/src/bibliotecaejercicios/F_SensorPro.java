package bibliotecaejercicios;
import java.util.Scanner;

public class F_SensorPro {
    
    public static void main(String[] args) {
        sensorPro();
    }
    
    public static void sensorPro () {
        Scanner sc = new Scanner (System.in);
        
        double temp, tempMin = 15.0, tempMax = 30.0;
        int piso;
        
        System.out.println("Ingrese la temperatura actual (°C): ");
        temp = sc.nextDouble();
        
        System.out.println("Ingrese el piso deseado: ");
        piso = sc.nextInt();
        
        if (validar(temp, tempMin, tempMax)) {
            System.out.println("El ascensor se mueve al piso " + piso);
        } else {
            System.out.println("La temparatura no es adecuada y no permite el movimiento del ascensor..");
        }
        
    }
    
    public static boolean validar (double temp, double tempMin, double tempMax) {
        return temp >= tempMin && temp <= tempMax;
        
    }
    
}