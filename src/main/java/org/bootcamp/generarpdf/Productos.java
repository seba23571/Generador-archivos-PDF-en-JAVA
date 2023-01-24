package org.bootcamp.generarpdf;

public class Productos {
    String codigobarra;
    int cantidad_productos;
    String nombre;
    float precios;
    float preciocosto;

    public Productos() {
    }

    public Productos(String codigobarra, int cantidad_productos, String nombre, float precios, float preciocosto) {
        this.codigobarra = codigobarra;
        this.cantidad_productos = cantidad_productos;
        this.nombre = nombre;
        this.precios = precios;
        this.preciocosto = preciocosto;
    }

    public String getCodigobarra() {
        return codigobarra;
    }

    public void setCodigobarra(String codigobarra) {
        this.codigobarra = codigobarra;
    }

    public int getCantidad_productos() {
        return cantidad_productos;
    }

    public void setCantidad_productos(int cantidad_productos) {
        this.cantidad_productos = cantidad_productos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecios() {
        return precios;
    }

    public void setPrecios(float precios) {
        this.precios = precios;
    }

    public float getPreciocosto() {
        return preciocosto;
    }

    public void setPreciocosto(float preciocosto) {
        this.preciocosto = preciocosto;
    }
    
    
    
}
