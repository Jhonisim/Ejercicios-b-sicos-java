package bibliotecaejercicios;
import java.util.Scanner;


public class G_FacturaAVE {
    public static void main(String[] args) {
        facturarAVE();
    }
    
    public static void facturarAVE () {
    Scanner scanner = new Scanner(System.in);
        
        double precioA = 10.0;
        double precioV = 20.0;
        double precioE = 30.0;
        
        System.out.println("Ingrese el tipo de producto que desea comprar (A, V, E): ");
        char tipoProducto = scanner.next().charAt(0);
        
        System.out.println("Ingrese la cantidad de unidades: ");
        int cantidad = scanner.nextInt();
        
        if (cantidad <= 0) {
            System.out.println("La cantidad de unidades debe ser un número positivo.");
            return;
        }
        
        double precioBase = 0.0;
        double descuento = 0.0;
        
        switch (tipoProducto) {
            case 'A':
                precioBase = precioA;
                descuento = 0.10;
                break;
                
            case 'V':
                precioBase = precioV;
                descuento = 0.05;
                break;
                
            case 'E':
                precioBase = precioE;
                descuento = 0.0;
                break;
                
            default:
                System.out.println("Tipo de producto no válido.");
                return;
        }
        
        double costoSinDescuento = precioBase * cantidad;
        
        double montoDescuento = costoSinDescuento * descuento;
        
        double costoConDescuento = costoSinDescuento - montoDescuento;
        
        System.out.println("Costo total sin descuento: $" + costoSinDescuento);
        System.out.println("Descuento aplicado: $" + montoDescuento);
        System.out.println("Costo total con descuento: $" + costoConDescuento);
        
    }

}