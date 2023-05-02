/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.mycompany.proyectosupermercadocosteno.co.edu.upb.proyectoanalisisdesistemas.GestionProductos;
import com.mycompany.proyectosupermercadocosteno.co.edu.upb.proyectoanalisisdesistemas.Producto;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author julic
 */
public class GestionProductosTest {
 @Test
public void testAgregarProducto() {
GestionProductos gestionProductos = new GestionProductos();
Producto producto = new Producto("Bolso Animal", "Bolso de piel, perfecto para lucir con diferentes prendas.",300.000,540);
gestionProductos.agregarProducto(producto);
assertEquals(1, gestionProductos.getProductos().size());
assertTrue(gestionProductos.getProductos().contains(producto));
}

@Test
public void testEliminarProductoExistente() {
GestionProductos gestionProductos = new GestionProductos();
Producto producto = new Producto("Leche", "Alimentos", 2.5, 10);
gestionProductos.agregarProducto(producto);
assertTrue(gestionProductos.eliminarProducto("Leche"));
assertEquals(0, gestionProductos.getProductos().size());
assertFalse(gestionProductos.getProductos().contains(producto));
}

 @Test
public void testEliminarProductoInexistente() {
GestionProductos gestionProductos = new GestionProductos();
assertFalse(gestionProductos.eliminarProducto("Guitarra"));
}


@Test
public void testBuscarProductoExistente() {
GestionProductos gestionProductos = new GestionProductos();
Producto producto = new Producto("Leche", "Alimentos", 2.5, 10);
gestionProductos.agregarProducto(producto);
assertEquals(producto, gestionProductos.buscarProducto("Leche"));
}

@Test
public void testBuscarProductoInexistente() {
GestionProductos gestionProductos = new GestionProductos();
assertNull(gestionProductos.buscarProducto("Guitarra"));
}
}
