
package javaapplication28;


public class Ventas {
    private int cantidad;
    private double importeTotal;
    private double saldo;
    

    public Ventas(int cantidad, double importeTotal, double saldo) {
        this.cantidad = cantidad;
        this.importeTotal = importeTotal;
        this.saldo = saldo;
        
    }

    public Ventas() {
        this.cantidad = 0;
        this.importeTotal = 0;
        this.saldo = 0;
        
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getImporteTotal() {
        return importeTotal;
    }

    public void setImporteTotal(double importeTotal) {
        this.importeTotal = importeTotal;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Ventas{" + "cantidad=" + cantidad + ", importeTotal=" + importeTotal + ", saldo=" + saldo + '}';
    }
}
