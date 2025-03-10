package bibliotecaejercicios;
import java.util.Scanner;

public class I_AsistenteCine {
    Scanner sc = new Scanner(System.in);
    int edad;
    
    public int capturar () {
        System.out.println("Indica tu edad: ");
        edad = sc.nextInt();
        
        return edad;
    }
    
    public void recomendar () {
        if (edad < 7) {
            System.out.println("Películas animadas y educativas.");
        } else if (edad < 18) {
            System.out.println("Películas de animación, aventuras y comedias familiares.");
        } else if (edad < 30) {
            System.out.println("Películas de acción, drama, comedia y ciencia ficción.");
        } else {
            System.out.println("Películas clásicas y dramas.");
        }
    }
}
