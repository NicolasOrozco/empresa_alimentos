package co.edu.uniquindio.poo;

public class Refrigerador implements IRefrigeracion{
    private int id;

    public Refrigerador(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public void iniciarProcesoRefrigeracion() {
        System.out.println(IRefrigeracion.MENSAJE_REFRIGERACION);
    }

}
