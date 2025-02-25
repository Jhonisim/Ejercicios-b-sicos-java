package bibliotecaejercicios;
import java.util.Scanner;

public class A_Principal {
    public static void main(String[] args) {
        System.out.println("Que ejercicio deseas ejecutar?");
        Scanner sc = new Scanner (System.in);
        int Elec = sc.nextInt();
        
        switch (Elec) {
            case 1:
                B_Factura factura1 = new B_Factura();
                factura1.facturar();
                break;
            
            case 2:
                C_AscensorPiso Ascensor1 = new C_AscensorPiso();
                Ascensor1.operar();
                break;
            
            default:
                throw new AssertionError();
        }
    }
}