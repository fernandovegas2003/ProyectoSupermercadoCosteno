/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.mycompany.proyectosupermercadocosteno.co.edu.upb.proyectoanalisisdesistemas.Producto;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 *
 * @author julic
 */
public class ProductoTest {
@Test
    public void testCalcularPrecioTotalProducto() {
    Producto producto = new Producto("Sal Marina","",11000,560);        
        double expected = 6160000;
        double actual = producto.calcularPrecioTotalProducto();
       Assertions.assertEquals(expected, actual);
    }
}
