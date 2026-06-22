package eje2;

public class Producto {

    private String codigo;
    private String nombre;
    private double precio;
    private int stock;

    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public double getPrecio() { return precio; }

    public void setPrecio(double precio) {
        if (precio > 0) this.precio = precio;
        else System.out.println("Precio inválido");
    }

    public int getStock() { return stock; }

    public void setStock(int stock) {
        if (stock >= 0) this.stock = stock;
        else System.out.println("Stock inválido");
    }

    public void vender(int cantidad) {
        if (cantidad <= stock) {
            stock -= cantidad;
            System.out.println("Venta realizada");
        } else {
            System.out.println("Stock insuficiente");
        }
    }
}
