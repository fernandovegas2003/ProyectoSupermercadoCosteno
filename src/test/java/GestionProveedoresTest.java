/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.mycompany.proyectosupermercadocosteno.co.edu.upb.proyectoanalisisdesistemas.GestionProveedores;
import com.mycompany.proyectosupermercadocosteno.co.edu.upb.proyectoanalisisdesistemas.Producto;
import com.mycompany.proyectosupermercadocosteno.co.edu.upb.proyectoanalisisdesistemas.Proveedor;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author julic
 */
public class GestionProveedoresTest {
    
   GestionProveedores gestionProveedores = new GestionProveedores();

	@Test
	void testAgregarProveedor() {
            List<Producto> productos2= new ArrayList<>();
        productos2.add(new Producto("Sal Marina","",11.000,560));
        productos2.add(new Producto("Azucar Caña","",10.000,760));
                Proveedor proveedor1= new Proveedor("1080", "DistribuidoraCosta", "345634","Calle 17 #10-22", "3002548821", "distribuidoracosta@gmail.com", productos2);

        gestionProveedores.agregarProveedor(proveedor1);
        Assertions.assertEquals(1, gestionProveedores.getProveedores().size());


	}

	@Test
        void testEliminarProveedor(){
            List<Producto> productos1 = new ArrayList<>();
        productos1.add(new Producto("Bolso Animal", "Bolso de piel, perfecto para lucir con diferentes prendas.",300.000,540));
        productos1.add(new Producto("Cartera Cuero","Cartera de cuero, perfecta para combinarla con diferentes estilos de ropa.",280.000,600));
        productos1.add(new Producto("CorreaAnimal Print","",80.000,780));
        Proveedor proveedor1= new Proveedor("1090", "PaquitaMilk", "paca12", "Calle 15 #24-34", "3017628933", "paquitamilk@hotmail.com",productos1);
        gestionProveedores.agregarProveedor(proveedor1);
        
        gestionProveedores.eliminarProveedor("1090","PaquitaMilk");
        assertEquals(0, gestionProveedores.getProveedores().size());



	}

	@Test
	void testBuscarProveedor() {
            List<Producto> productos2= new ArrayList<>();
        productos2.add(new Producto("Sal Marina","",11.000,560));
        productos2.add(new Producto("Azucar Caña","",10.000,760));
                Proveedor proveedor1= new Proveedor("1080", "DistribuidoraCosta", "345634","Calle 17 #10-22", "3002548821", "distribuidoracosta@gmail.com", productos2);
                List<Producto> productos1= new ArrayList<>();
        productos2.add(new Producto("Ceviche","",45.000,650));
        productos2.add(new Producto("Camas","",10000.000,780));
                Proveedor proveedor2= new Proveedor("2341", "CamaronCosteño", "65213","Calle 17 #34-22", "3254357090", "camaroncosteño@gmail.com", productos1);
        gestionProveedores.agregarProveedor(proveedor1);
        gestionProveedores.agregarProveedor(proveedor2);
        Assertions.assertEquals(proveedor2,  gestionProveedores.buscarProveedor("2341","CamaronCosteño"));
        Assertions.assertNull(gestionProveedores.buscarProveedor("1085","Mariscos S.A") );

	}
}
