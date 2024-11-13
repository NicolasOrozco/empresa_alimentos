package co.edu.uniquindio.poo;

import java.util.LinkedList;

public class Empresa {
    private String nombre;
    private LinkedList<Proveedor> proveedores;
    private LinkedList<Producto> productos;
    private LinkedList<Refrigerador> refrigeradores;

    /**
     * Método constructor de la clase Empresa
     * @param nombre
     * @param proveedores
     * @param productos
     * @param refrigeradores
     */
    public Empresa(String nombre, LinkedList<Proveedor> proveedores, LinkedList<Producto> productos,
            LinkedList<Refrigerador> refrigeradores) {
        this.nombre = nombre;
        proveedores = new LinkedList<>();
        productos = new LinkedList<>();
        refrigeradores = new LinkedList<>();
    }

    //----------------GETTERS Y SERTTERS DE LA CLASE----------------//

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LinkedList<Proveedor> getProveedores() {
        return proveedores;
    }

    public void setProveedores(LinkedList<Proveedor> proveedores) {
        this.proveedores = proveedores;
    }

    public LinkedList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(LinkedList<Producto> productos) {
        this.productos = productos;
    }

    public LinkedList<Refrigerador> getRefrigeradores() {
        return refrigeradores;
    }

    public void setRefrigeradores(LinkedList<Refrigerador> refrigeradores) {
        this.refrigeradores = refrigeradores;
    }

    //--------------------------------------------------------------//

    //--------------------------CRUD Proveedor----------------------//
    //--------------------------------------------------------------//

    //--------------------------CRUD Producto-----------------------//
    //--------------------------------------------------------------//
}
