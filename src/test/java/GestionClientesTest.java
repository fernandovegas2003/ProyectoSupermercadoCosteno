/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.mycompany.proyectosupermercadocosteno.co.edu.upb.proyectoanalisisdesistemas.Cliente;
import com.mycompany.proyectosupermercadocosteno.co.edu.upb.proyectoanalisisdesistemas.GestionClientes;
import java.util.ArrayList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 *
 * @author julic
 */
public class GestionClientesTest {
    
        Cliente cliente1= new Cliente("001", "1104204033", "Angie Villarreal","Angie123","315257338","angie@hotmail.com");
	Cliente cliente2= new Cliente("002", "1104204034", "Juliana Chavez","Juliana123","3128119417","juliana@hotmail.com");

	GestionClientes gestionClientes = new GestionClientes();

	@Test
	void testAgregarCliente() {
		gestionClientes.agregarCliente(cliente1);
        ArrayList<Cliente> listaClientes = gestionClientes.getClientes();
        Assertions.assertEquals(1, listaClientes.size());
        Assertions.assertEquals(cliente1, listaClientes.get(0));

	}

	@Test
	void testBuscarCliente() {
		gestionClientes.agregarCliente(cliente1);
        gestionClientes.agregarCliente(cliente2);
        Cliente resultadoBusqueda = gestionClientes.buscarCliente("001", "1104204033");
        Assertions.assertEquals(cliente1, resultadoBusqueda);
	}
}
