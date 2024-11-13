package co.edu.uniquindio.poo;

import java.time.LocalDate;

public class Perecedero extends Producto{

    public LocalDate fechaVencimiento;

    public Perecedero(String nombre, String id, double precioCompra, LocalDate fechaVencimiento) {
        super(nombre, id, precioCompra);
        this.fechaVencimiento = fechaVencimiento;
    }

    @Override
    public double calcularCostoImpuesto() {
        return getPrecioVenta()*0.08;
    }

    @Override
    public double calcularPrecioVenta() {
        double precioTotal = getPrecioCompra() + (getPrecioCompra()*0.35);
        return precioTotal;
    }

    

}
