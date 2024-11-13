package co.edu.uniquindio.poo;

public abstract class Producto {
    private String nombre;
    private String id;
    private double precioCompra;
    private double precioVenta;
    private double costoImpuesto;
    private Proveedor proveedor;

    public Producto(String nombre, String id, double precioCompra){
        this.nombre = nombre;
        this.id = id;
        this.precioCompra = precioCompra;
        proveedor = null;
        precioVenta = calcularPrecioVenta();
        costoImpuesto = calcularCostoImpuesto();
        setPrecioVenta(precioVenta);
        setCostoImpuesto(costoImpuesto);
    }

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public double getCostoImpuesto() {
        return costoImpuesto;
    }

    public void setCostoImpuesto(double costoImpuesto) {
        this.costoImpuesto = costoImpuesto;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public abstract double calcularPrecioVenta();

    public abstract double calcularCostoImpuesto();

}
