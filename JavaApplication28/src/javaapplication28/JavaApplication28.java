
package javaapplication28;

import java.util.Scanner;


public class JavaApplication28 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del Cliente:");
        String nombre = sc.nextLine();
        System.out.println("Ingrese el telefono del Cliente:");
        int telefono = sc.nextInt();
        System.out.println("Ingrese la cantidad de ventas: ");
        int cantidadVentas = sc.nextInt();
        
        Clientes c = new Clientes(nombre, telefono, cantidadVentas);
        
        for (int i = 0; i < cantidadVentas; i++) {
            System.out.println("Ingrese la cantidad de productos vendidos");
            int cantidad = sc.nextInt();
            System.out.println("Ingrese el importe total:");
            int importeTotal = sc.nextInt();
            System.out.println("Ingrese el saldo adeudado:");
            int saldo = sc.nextInt();
            
            Ventas v = new Ventas(cantidad, importeTotal, saldo);
            c.agregarVenta(v);
        }
        
        System.out.println("El promedio general del importe de todas las ventas: " + c.promedioImporte());
        
        System.out.println("Sumatoria total de la deuda:" + c.sumatoriaTotalDeuda());
        
        System.out.println("Ingrese el importe que desea comparar:");
        double importe = sc.nextDouble();
        int cantidad = c.cantidadVentasImporteSuperior(importe);
        System.out.println("La cantidad de ventas superior a ese importe es: " + cantidad);
        
        
    }
    
}
