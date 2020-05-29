
package javaapplication28;


public class Clientes {
    private String nombre;
    private int telefono;
    private Ventas [] ventas;

    public Clientes(String nombre, int telefono,int cantidadVentas) {
        this.nombre = nombre;
        this.telefono = telefono;
        ventas = new Ventas[cantidadVentas];
    }

    public Clientes() {
        this.nombre = "";
        this.telefono = 0;
        this.ventas = null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public Ventas[] getVentas() {
        return ventas;
    }

    public void setVentas(Ventas[] ventas) {
        this.ventas = ventas;
    }
    
    public void agregarVenta(Ventas v)
    {
        for (int i = 0; i < ventas.length; i++) {
            if(ventas[i] == null)
            {
                ventas[i] = v;
                break;
            }
        }
    }
    
    public double promedioImporte()
    {
        float sumatoria = 0;
        int contador = 0;
        for (int i = 0; i < ventas.length; i++) {
            if(ventas[i] != null)
            {
                sumatoria += ventas[i].getImporteTotal();
                contador++;
            }
        }
        return sumatoria / contador;
    }
    
    public int sumatoriaTotalDeuda()
    {
        int sumatoria = 0;
        for (int i = 0; i < ventas.length; i++) {
            if(ventas[i] != null)
            {
                sumatoria += ventas[i].getSaldo();
            }
        }
        return sumatoria;
        
    }
    
    public int cantidadVentasImporteSuperior(double importe)
    {
        int cantidad = 0;
        for (int i = 0; i < ventas.length; i++) {
            if(ventas[i] != null && ventas[i].getImporteTotal() > importe)
            {
                cantidad += 1;
            }   
        }
        return cantidad;
    }
}
