/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectosupermercadocosteno.co.edu.upb.proyectoanalisisdesistemas;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ProcesoCompra {
	
	public static boolean comprarProducto(Producto producto, int cantidad, Carrito carrito) {
	    if (cantidad > producto.getCantidadDisponible()) {
	        System.out.println("Lo siento, no hay suficiente cantidad disponible.");
	        return false;
	    }
	    double total = producto.getPrecio() * cantidad;
	    System.out.println("El total de tu compra es $" + total);
	    producto.setCantidadDisponible(producto.getCantidadDisponible() - cantidad);
	    carrito.agregarProducto(new Producto(producto.getNombre(), producto.getDescripcion(), producto.getPrecio(), cantidad));
	    System.out.println("Producto agregado al carrito.");
	    return true;
	}
	
	public void procesarCompra(Scanner scanner, Cliente cliente, Carrito carrito, Inventario inventario) {
        String respuesta4 = scanner.next().trim();
        if (respuesta4.equalsIgnoreCase("si")) {
            double totalCompra = carrito.calcularTotal();
            double impuesto= 0.19;
            System.out.println("El total de tu compra es $ " + totalCompra);
            System.out.println("Impuestos aplicados 19% "+ totalCompra*impuesto);													            
            System.out.println("Gracias por tu compra. ¡Hasta la próxima!");
            System.out.println("------------------------------------");
            System.out.println("Factura Supermercado COSTAKING");
            System.out.println("Cliente: " + cliente.getNombre());
            System.out.println("Cédula: " + cliente.getCedula());
            System.out.println("Código: " + cliente.getCodigo());
            System.out.println("------------------------------------");
            System.out.println("Impuestos: " + totalCompra*impuesto);
            System.out.println("------------------------------------");
            System.out.println("Total: " + totalCompra);
            guardarFacturaEnArchivo(totalCompra, impuesto, cliente);
            inventario.actualizarInventario(carrito);
            carrito.vaciarCarrito();
            boolean salir = true;
        } else if (respuesta4.equalsIgnoreCase("no")) {
            carrito.vaciarCarrito();
            System.out.println("Carrito vaciado. Volviendo al menú principal...");
   
        } else {
            System.out.println("Opción inválida. Volviendo al menú principal...");

        }
    }
	
	 public void guardarFacturaEnArchivo(double totalCompra, double impuesto, Cliente cliente) {
	        String nombreArchivo = cliente.getCedula() + ".txt";
	        try {
	            FileWriter archivo = new FileWriter(nombreArchivo);
	            archivo.write("El total de tu compra es $" + totalCompra + "\n");
	            archivo.write("Impuestos aplicados 19%: " + totalCompra*impuesto + "\n");
	            archivo.write("Gracias por tu compra. ¡Hasta la próxima!\n");
	            archivo.write("------------------------------------\n");
	            archivo.write("Factura Supermercado COSTAKING\n");
	            archivo.write("Cliente: " + cliente.getNombre() + "\n");
	            archivo.write("Cédula: " + cliente.getCedula() + "\n");
	            archivo.write("Código: " + cliente.getCodigo() + "\n");
	            archivo.write("------------------------------------\n");
	            archivo.write("Impuestos: " + totalCompra*impuesto + "\n");
	            archivo.write("------------------------------------\n");
	            archivo.write("Total: " + totalCompra + "\n");
	            archivo.close();
	            System.out.println("Factura guardada en el archivo " + nombreArchivo);
	        } catch (IOException e) {
	            System.out.println("Error al guardar la factura en el archivo " + nombreArchivo);
	            e.printStackTrace();
	        }
	    }
}
