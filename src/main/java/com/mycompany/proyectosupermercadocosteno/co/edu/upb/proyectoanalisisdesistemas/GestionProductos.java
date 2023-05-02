package com.mycompany.proyectosupermercadocosteno.co.edu.upb.proyectoanalisisdesistemas;

import java.util.ArrayList;

public class GestionProductos {
	 private ArrayList<Producto> productos;

	    public GestionProductos() {
	        this.productos = new ArrayList<>();
	    }

	    public void agregarProducto(Producto producto) {
	        productos.add(producto);
	    }

	    public boolean eliminarProducto(String nombre) {
	        for (Producto producto : productos) {
	            if (producto.getNombre().equals(nombre)) {
	                productos.remove(producto);
	                return true;
	            }
	        }
	        return false;
	    }

	    public Producto buscarProducto(String nombre) {
	        for (Producto producto : productos) {
	            if (producto.getNombre().equals(nombre)) {
	                return producto;
	            }
	        }
	        return null;
	    }

	    public ArrayList<Producto> getProductos() {
	        return productos;
	    }
}