package com.mycompany.proyectosupermercadocosteno.co.edu.upb.proyectoanalisisdesistemas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class GestionEmpleados {
	private ArrayList<Empleado> empleados=new ArrayList<Empleado>();
	
	public GestionEmpleados() {
	}
	
	public void agregarEmpleado(Empleado empleado) {
        empleados.addAll(empleados);
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }
    
    public void inicializarEmpleado() {
    	agregarEmpleado(new Empleado("Juan Perez", "Cra 10 #23-45", "1234567", "juan.perez@example.com", "Gerente", new Date(), "12345678","1014"));
        agregarEmpleado(new Empleado("Maria Gomez", "Cra 20 #34-56", "9876543", "maria.gomez@example.com", "Asistente", new Date(), "87654321","1121"));
        agregarEmpleado(new Empleado("Pedro Rodriguez", "Cra 30 #45-67", "2345678", "pedro.rodriguez@example.com", "Tecnico", new Date(), "56781234","4532"));
    }
    
    public void registrarPEmpleados(Scanner scanner, GestionEmpleados gestionEmpleados) {
    	System.out.println("Ingrese los datos del empleado:");
        System.out.print("Nombre: ");
        scanner.nextLine();
        String nombre1 = scanner.nextLine().trim();
        System.out.print("Código: ");
        scanner.nextLine();
        String codigo1 = scanner.nextLine();
        System.out.print("Dirección: ");
        String direccion = scanner.next();
        System.out.print("Teléfono3: ");
        String telefono3 = scanner.next();
        System.out.print("Correo electrónico: ");
        String correoElectronico = scanner.next();
        System.out.print("Cargo: ");
        scanner.nextLine();
        String cargo = scanner.nextLine();
        System.out.print("Fecha de contratación (dd/mm/aaaa): ");
        String fechaContratacionStr = scanner.next();
	Date fechaContratacion = null;
	
	try {
		fechaContratacion = new SimpleDateFormat("dd/MM/yyyy").parse(fechaContratacionStr);
	} catch (ParseException e) {
		e.printStackTrace();
	}
        System.out.print("Cédula: ");
        String cedula = scanner.next();

        // Obtener el último código utilizado
        String ultimoCodigo = "0";
        if (!gestionEmpleados.getEmpleados().isEmpty()) {
            Empleado ultimoEmpleado = gestionEmpleados.getEmpleados().get(gestionEmpleados.getEmpleados().size() - 1);
            ultimoCodigo = ultimoEmpleado.getCodigo();
        }

        // Asignar un nuevo código secuencial
        String nuevoCodigo = ultimoCodigo + 1;

        // Crear el nuevo empleado con el código asignado
        Empleado empleado = new Empleado(nombre1, direccion, telefono3, correoElectronico, cargo, fechaContratacion, cedula, nuevoCodigo);
        gestionEmpleados.agregarEmpleado(empleado);
        System.out.println("Empleado registrado exitosamente.");
        empleado.guardarDatosEmpleadoEnArchivoTxt();
    }
}
