/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.mycompany.proyectosupermercadocosteno.co.edu.upb.proyectoanalisisdesistemas.Carrito;
import com.mycompany.proyectosupermercadocosteno.co.edu.upb.proyectoanalisisdesistemas.Inventario;
import com.mycompany.proyectosupermercadocosteno.co.edu.upb.proyectoanalisisdesistemas.Producto;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author julic
 */
public class CarritoTest {
Carrito carrito = new Carrito();
	Producto vitaminas= new Producto("Centrum Women","un suplemento vitamínico diseñado específicamente para mujeres que ayuda a satisfacer las necesidades nutricionales diarias.",70.000,1000);
	Producto paracetamol= new Producto("Paracetamol","Un analgésico y antipirético comúnmente utilizado para aliviar el dolor y reducir la fiebre.",15.000,1400);
	Producto dolex= new Producto("Dolex Forte","Un medicamento analgésico que contiene acetaminofén y cafeína, utilizado para aliviar el dolor moderado a intenso.",12.000,990);
	Producto atorvastatina= new Producto("Atorvastatina","Un medicamento que se utiliza para reducir el colesterol y prevenir enfermedades cardiovasculares.",17.000,890);
	Producto desloratadina= new Producto("Desloratadina","Un antihistamínico utilizado para aliviar los síntomas de alergias, como estornudos, picazón en los ojos y la nariz, y erupciones cutáneas.",20.000,980);
    private Iterable<Producto> productos;
    private Object productoCarrito;
			
	
	
	@Test
void agregarProductoTest() {
    carrito.agregarProducto(paracetamol);
    List<Producto> listaProductos = carrito.getProductos();
    assertEquals(1, listaProductos.size());
    assertEquals(paracetamol, listaProductos.get(0));
}

	@Test
	void testMostrarContenido() {
		carrito.agregarProducto(vitaminas);
        List<Producto> listaProductos = carrito.getProductos();
        Assertions.assertEquals(vitaminas, listaProductos.get(0));

	}

	@Test
	void testCalcularTotal() {
		carrito.agregarProducto(dolex);
        carrito.agregarProducto(atorvastatina);
        double totalEsperado = dolex.calcularPrecioTotalProducto() + atorvastatina.calcularPrecioTotalProducto();
        Assertions.assertEquals(totalEsperado, carrito.calcularTotal());
	}

	@Test
	void testVaciarCarrito() {
		carrito.agregarProducto(vitaminas);
        carrito.agregarProducto(paracetamol);
        carrito.vaciarCarrito();
        Assertions.assertTrue(carrito.getProductos().isEmpty());
	}
}
