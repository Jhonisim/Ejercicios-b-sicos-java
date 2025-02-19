package bibliotecaejercicios;
import java.util.Scanner;

//1. Crear la clase
public class B_Factura {
    public static void main(String[] args) {
        facturar();
    //2. Crear los atributos
    
    }
    
    //3. Crear el constructor
    
    //4. Crear los metodos
    public static String Teclado(String mensaje) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(mensaje);
        return scanner.nextLine();
    }
    
    public static void facturar (){
        String nombClie = Teclado("Ingrese su nombre:");
        String prod = Teclado("Nombre del producto:");
        int cant = Integer.parseInt(Teclado("Cuantos productos quiere llevar:"));
        double precUnit = Double.parseDouble(Teclado("Ingrese el valor unitario:"));
        boolean estudiante = Teclado("Eres estudiante? (Si/No):").equalsIgnoreCase("si");
        
        double subTot = calcSubt(cant, precUnit);
        
        double impu = calcImpu (subTot, estudiante);
        
        double total = subTot + impu;
        
        mostFact (nombClie, prod, cant, precUnit, subTot, impu, total);
    }
    
    public static double calcSubt(int cant, double precUnit) {
        return cant * precUnit;
    }
    
    public static double calcImpu(double subTot, boolean estudiante) {
        double tasaImpu = estudiante ? 0.05 : 0.13;
        return subTot * tasaImpu;
    }
    
    public static void mostFact(String nombClie, String prod, int cant, double precUnit, double subTot, double impu, double total) {
        System.out.println("\n--- Factura ---");
        System.out.println("Nombre del cliente: " + nombClie);
        System.out.println("Producto: " + prod);
        System.out.println("Cantidad: " + cant);
        System.out.println("Precio unitario: " + precUnit);
        System.out.println("Subtotal: " + subTot);
        System.out.println("Impuesto: " + impu);
        System.out.println("Total: " + total);
    }
    
}