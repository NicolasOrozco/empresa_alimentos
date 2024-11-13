package co.edu.uniquindio.poo;

import java.util.LinkedList;

public class Proveedor {

    private String nombre;
    private int id;
    private LinkedList<Producto> productos;

    public Proveedor(String nombre, int id, LinkedList<Producto> productos) {
        this.nombre = nombre;
        this.id = id;
        productos = new LinkedList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LinkedList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(LinkedList<Producto> productos) {
        this.productos = productos;
    }

    public boolean verificarProducto(String id){
        boolean centinela = false;
        for (Producto producto : productos){
            if(producto.getId().equals(id)){
                centinela = true;
            }
        }
        return centinela;
    }

    public void agregarProducto(Producto producto){
        if(!verificarProducto(producto.getId())){
            productos.add(producto);
            producto.setProveedor(this);
        }
    }
    
}
