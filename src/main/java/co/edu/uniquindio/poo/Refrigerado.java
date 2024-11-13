package co.edu.uniquindio.poo;

public class Refrigerado extends Producto implements IRefrigeracion{

    private int codigoAprobacion;
    private double temperaturaRecomendada;
    
    public Refrigerado(String nombre, String id, double precioCompra, int codigoAprobacion,
            double temperaturaRecomendada) {
        super(nombre, id, precioCompra);
        this.codigoAprobacion = codigoAprobacion;
        this.temperaturaRecomendada = temperaturaRecomendada;
    }

    public int getCodigoAprobacion() {
        return codigoAprobacion;
    }

    public void setCodigoAprobacion(int codigoAprobacion) {
        this.codigoAprobacion = codigoAprobacion;
    }

    public double getTemperaturaRecomendada() {
        return temperaturaRecomendada;
    }

    public void setTemperaturaRecomendada(double temperaturaRecomendada) {
        this.temperaturaRecomendada = temperaturaRecomendada;
    }

    @Override
    public double calcularCostoImpuesto() {
        return getPrecioVenta()*0.05;
    }

    @Override
    public double calcularPrecioVenta() {
        double precioTotal = getPrecioCompra() + (temperaturaRecomendada*500);
        return precioTotal;
    }

    @Override
    public void iniciarProcesoRefrigeracion() {
        System.out.println(IRefrigeracion.MENSAJE_REFRIGERACION);
    }

}
