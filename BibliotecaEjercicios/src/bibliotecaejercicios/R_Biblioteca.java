package bibliotecaejercicios;
import java.util.Scanner;

public class R_Biblioteca {
    private String libro;
    private String autor;
    private int paginas;
    private String listaLibros = "";

    public R_Biblioteca () {
    
    }

    public void inicio(Scanner scanner) {
        System.out.print("Ingrese el título del libro: ");
        libro = scanner.nextLine();
        System.out.print("Ingrese el autor del libro: ");
        autor = scanner.nextLine();
        System.out.print("Ingrese el número de páginas: ");
        paginas = scanner.nextInt();
    }

    public void proceso() {
        listaLibros += "Título: " + libro + ", Autor: " + autor + ", Páginas: " + paginas + "\n";
    }

    public void resultado() {
        System.out.println("Libros registrados: ");
        System.out.println(listaLibros);
    }
}