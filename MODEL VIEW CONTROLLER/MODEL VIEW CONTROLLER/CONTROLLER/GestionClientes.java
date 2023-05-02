package com.mycompany.proyectosupermercadocosteno.co.edu.upb.proyectoanalisisdesistemas;

import java.util.ArrayList;
import java.util.Scanner;

public class GestionClientes {
	 private ArrayList<Cliente> clientes= new ArrayList<Cliente>();
	 
	 public GestionClientes() {
	 }
	    
    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }
    
    public Cliente buscarCliente(String codigo, String cedula) {
        for (Cliente cliente : clientes) {
            if (cliente.getCodigo().equals(codigo) && cliente.getCedula().equals(cedula)) {
                return cliente;
            }
        }return null;
    }
    
    public boolean eliminarCliente(String codigo, String cedula) {
    	for(Cliente cliente: clientes){
    		if(cliente.getCodigo().equals(codigo) && cliente.getCedula().equals(cedula)) {
    			clientes.remove(cliente);
    			return true;
    		}
    	}
    	return false;
    }
    
    public void inicializarCliente() {
    	agregarCliente(new Cliente("001", "123456789", "Juan Perez", "1234", "394782118", "juanperez@gmail.com"));
		agregarCliente(new Cliente("002", "987654321", "Maria Rodriguez", "5678", "3026736228", "mariarodriguez@gmail.com"));
		agregarCliente(new Cliente("003", "109283786", "Omalys King", "9137", "3012785632", "omalysking@hotmail.com"));
    }
    
    public void mostrarPerfilCliente(Cliente cliente) {
    	System.out.println("---------Perfil---------");
 	   System.out.println("Código: "+ cliente.getCodigo());
 	   System.out.println("Cedula: "+ cliente.getCedula());
 	   System.out.println("Nombre: "+ cliente.getNombre());
 	   System.out.println("Contraseña: "+ cliente.getContrasena());
 	   System.out.println("Telefono: "+ cliente.getTelefono());
 	   System.out.println("Correo Electrónico: "+ cliente.getCorreoElectronico());
    }
    
    public void registrarCliente(Scanner scanner, GestionClientes gestionClientes) {
        System.out.println("Ingrese los datos del cliente:");
        System.out.print("Código: ");
        String codigo1 = scanner.next();
        System.out.print("Cédula: ");
        String cedula1 = scanner.next();
        System.out.print("Nombre: ");
        scanner.nextLine();
        String nombre = scanner.nextLine();
        System.out.print("Contraseña: ");
        String contrasena = scanner.next();
        System.out.print("Teléfono: ");
        String telefono = scanner.next();
        System.out.print("Correo electrónico: ");
        String correoElectronico = scanner.next();

        Cliente cliente11 = new Cliente(codigo1, cedula1, nombre, contrasena, telefono, correoElectronico);
        gestionClientes.agregarCliente(cliente11);
        System.out.println("Cliente registrado exitosamente.");
        cliente11.guardarDatosClienteEnArchivoTxt(codigo1, cedula1, nombre, contrasena, telefono, correoElectronico);
    }
}