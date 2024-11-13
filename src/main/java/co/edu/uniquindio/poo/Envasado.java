package co.edu.uniquindio.poo;

import java.time.LocalDate;

public class Envasado extends Producto {
    private LocalDate fecha;
    private double peso;
    private Pais pais;
    
    public Envasado(String nombre, String id, double precioCompra, LocalDate fecha, double peso, Pais pais) {
        super(nombre, id, precioCompra);
        this.fecha = fecha;
        this.peso = peso;
        this.pais = pais;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    @Override
    public double calcularCostoImpuesto() {
        return getPrecioVenta()*0.1;
    }

    @Override
    public double calcularPrecioVenta() {
        double costoTotal = getPrecioCompra() + (getPeso()*300);
        return costoTotal;
    }

    

    
}


