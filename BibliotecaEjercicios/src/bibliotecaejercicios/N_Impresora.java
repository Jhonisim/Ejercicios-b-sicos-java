package bibliotecaejercicios;
import java.util.Scanner;

public class N_Impresora {
    private int cantidadPapel;
    private int paginas;

    public N_Impresora () {
    
    }

    public void inicio(Scanner scanner) {
        System.out.print("Ingrese la cantidad de páginas a imprimir: ");
        paginas = scanner.nextInt();
    }

    public void proceso() {
        if (paginas > cantidadPapel) {
            System.out.println("No hay suficiente papel.");
        } else {
            cantidadPapel -= paginas;
        }
    }

    public void resultado() {
        System.out.println("Papel restante: " + cantidadPapel);
    }
}