package com.mycompany.proyectosupermercadocosteno.co.edu.upb.proyectoanalisisdesistemas;

import java.util.ArrayList;
import java.util.List;

public class Carrito {
	private List<Producto> productos;

    public Carrito() {
        productos = new ArrayList<Producto>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void mostrarContenido() {
        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }

    public double calcularTotal() {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.calcularPrecioTotalProducto();
        }
        return total;
    }
    
    
    public void vaciarCarrito() {
        productos.clear();
    }

    public List<Producto> getProductos() {
        return productos;
    }
    
    public void restarCantidad(Carrito carrito) {
        for (Producto productoCarrito : carrito.getProductos()) {
            for (Producto productoInventario : productos) {
                if (productoCarrito.getNombre().equals(productoInventario.getNombre())) {
                    productoInventario.setCantidadDisponible(productoInventario.getCantidadDisponible() - productoCarrito.getCantidadDisponible());
}
