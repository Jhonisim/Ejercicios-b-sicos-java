package bibliotecaejercicios;
import java.util.Scanner;

public class J_ResultadoPartido {
    Scanner sc = new Scanner (System.in);
    String resultado;
    int puntos;
    
    public static void main(String[] args) {
        
    }
    
    public String capturaResultado () {
        System.out.println("Ingrese el resultado (Ganado = G, Empatado = E, Perdido = P)");
        resultado = sc.nextLine();
        return resultado;
    }
    
    public void calculaPuntos () {
        switch (resultado) {
            case "G":
                puntos = 3;
            break;
            
            case "E":
                puntos = 1;
            break;
            
            case "P":
                puntos = 0;
            break;
            
            default:
                System.out.println("Resultado no valido...");
        }
        
    }
    
    public void muestraPuntos () {
        System.out.println("Puntos obtenidos: " + puntos);
    }
    
}