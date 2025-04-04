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
                C_Ascensor ascensor1 = new C_Ascensor();
                ascensor1.ascensor();
                break;
                
            case 3:
                D_AscensorPro ascensorPro1 = new D_AscensorPro();
                ascensorPro1.ascensorPro();
                break;
            
            case 4:
                E_Sensor sensor1 = new E_Sensor();
                sensor1.sensor();
                break;
                
            case 5:
                F_SensorPro sensorPro1 = new F_SensorPro();
                sensorPro1.sensorPro();
                break;
            
            case 6:
                G_FacturaAVE facturaAVE = new G_FacturaAVE();
                facturaAVE.facturarAVE();
                break;
            
            case 7:
                H_CalculoIMC calculoIMC = new H_CalculoIMC();
                calculoIMC.calcularIMC();
                break;
                
            case 8:
                I_AsistenteCine asistenteCine = new I_AsistenteCine();
                asistenteCine.capturar();
                asistenteCine.recomendar();
                break;
                
            case 9:
                J_ResultadoPartido resultadoPartido = new J_ResultadoPartido();
                resultadoPartido.capturaResultado();
                resultadoPartido.calculaPuntos();
                resultadoPartido.muestraPuntos();
                break;
                
            case 10:
                K_Menu Kmenu = new K_Menu();
                Kmenu.inicio(sc);
                Kmenu.proceso();
                Kmenu.resultado();
                break;
                        
            default:
                throw new AssertionError();
        }
    }
}