package com.mycompany.proyectosupermercadocosteno.co.edu.upb.proyectoanalisisdesistemas;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) throws IOException{
		
		GestionEmpleados gestionEmpleados = new GestionEmpleados();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		GestionClientes gestionClientes = new GestionClientes();
        GestionProveedores gestionProveedores= new GestionProveedores();    
        ProcesoCompra procesoCompra= new ProcesoCompra();
        Carrito carrito = new Carrito();
        Inventario inventario= new Inventario();
        HashMap<String, String> adminInfo = new HashMap<>();
        adminInfo.put("Admin/JulianaChavezKing29", "29/06COSTAKING2004");
        
        gestionEmpleados.inicializarEmpleado();
        gestionClientes.inicializarCliente();
        gestionProveedores.cargarProveedores();
        inventario.inicializarInventario();
		
		int general=0;
		int opcionCliente=0;
		int opcionC1=0;
		int opcionMenu=0;
		int opcionProveedor=0;
		int opcionP1=0;
		int opcionE=0;
		
		do{
				Scanner scanner= new Scanner(System.in);
				Comentarios.bienvenidaTiendaEnLinea();
				
				System.out.println("¿Qué tipo de usuario eres?");
				System.out.println("1.Cliente");
				System.out.println("2.Proveedor");
				System.out.println("3.Empleado");
				System.out.println("4.Administrador");
				System.out.println("5.Informacion");
				System.out.println("6.Salir");
				System.out.println("Ingrese su opción:");
				general=scanner.nextInt();
				
				switch(general){
				case 1: //Cliente
					System.out.println("Has seleccionado la opción de cliente:");
					System.out.println("¿Ya tienes cuenta o deseas registrarte?");
					System.out.println("Queremos informarte que, según la ley colombiana, los menores de 15 años no pueden realizar compras en línea. Nos tomamos muy en serio el cumplimiento de las regulaciones locales y queremos asegurarnos de que nuestros clientes estén al tanto de esta restricción. Si tienes menos de 15 años, por favor, no intentes hacer compras en nuestra tienda virtual. Si tienes alguna pregunta o inquietud, por favor contáctanos y estaremos encantados de ayudarte. Gracias por tu comprensión.");
					System.out.println("1.Iniciar sesión");
					System.out.println("2.Registrase");
					System.out.println("Ingrese su opción:");
					opcionCliente=scanner.nextInt();
					
					switch(opcionCliente){
						case 1: //Iniciar sesion cliente
							System.out.println("Ingrese el código:");
							String codigo= scanner.next();
							System.out.println("Ingrese la cedula:");
							String cedula = scanner.next();

							Cliente cliente = gestionClientes.buscarCliente(codigo,cedula);
							if (cliente== null) {
								System.out.println("No se ha registrado alguien con ese código y cédula.");
							}else{
								System.out.println("Ingrese su contraseña: ");
					            String contrasena = scanner.next();
					            if(cliente.getContrasena().equals(contrasena)) {
					               System.out.println("¡Bienvenido " + cliente.getNombre()+"!");
					               
					               do {
						               System.out.println("¿Qué deseas hacer?");
						               System.out.println("1.Mostrar información de mi perfil");
						               System.out.println("2.Mostrar menu");
						               System.out.println("3.Anterior");
						               System.out.println("Ingrese su opción:");
						               opcionC1=scanner.nextInt();
						               
						               switch(opcionC1){
							               case 1: //Información del perfil del cliente
							            	   gestionClientes.mostrarPerfilCliente(cliente);
							            	   break; //Romper información del perfil cliente
							            	      
							               case 2: //Mostrar menu
							            	   	System.out.println("Bienvenido al Supermercado");
												System.out.println("Selecciona una categoria:");
												System.out.println("1.Alimentos");
												System.out.println("2.Electrodomesticos");
												System.out.println("3.Limpieza e higiene");
												System.out.println("4.Ferreteria");
												System.out.println("5.Decoracion y Hogar");
												System.out.println("6.Jugueteria");
												System.out.println("7.Tecnología");
												System.out.println("8.Ropa y Accesorios");
												System.out.println("9.Libros y Papelería");
												System.out.println("10.Mascotas");
												System.out.println("11.Salud y Medicamentos");
												System.out.println("12.Salir");
												System.out.println("Ingrese su opción:");
												opcionMenu=scanner.nextInt();
												
												switch(opcionMenu) {
													case 1: //Alimentos
														System.out.println("Seleccionaste 'Alimentos'.");
														System.out.println("Productos disponibles:");
														ArrayList<Producto> alimentos= inventario.getAlimentos();
														for (Producto producto : alimentos) {
															System.out.println("- " + producto.getNombre() + " - Descripción: " + producto.getDescripcion() + " - Precio: $" + producto.getPrecio() + " - Cantidad disponible: " + producto.getCantidadDisponible());
														}
													    System.out.println("Ingresa el nombre del producto que deseas comprar:");
													    scanner.nextLine();
													    String nombreProductoAlimentos = scanner.nextLine().trim();
													    int indexProducto1 = -1;
													    for (int i = 0; i < alimentos.size(); i++) {
													        if (alimentos.get(i).getNombre().equalsIgnoreCase(nombreProductoAlimentos)) {
													            indexProducto1 = i;
													            break;
													        }
													    }
													    if (indexProducto1 == -1) {
													        System.out.println("Producto no encontrado.");
													        break;
													    }
													    Producto productoAlimentos = alimentos.get(indexProducto1);
													    System.out.println("Ingresa la cantidad que deseas comprar:");
													    int cantidadAlimentos = scanner.nextInt();
													    scanner.nextLine();
													    if (ProcesoCompra.comprarProducto(productoAlimentos, cantidadAlimentos, carrito)) {
													        System.out.println("¿Deseas seguir comprando o ir al carrito? (comprar/carrito)");
													        String respuesta31 = scanner.next().trim();
													        if (respuesta31.equalsIgnoreCase("comprar")) {
													            continue;
													        } else if (respuesta31.equalsIgnoreCase("carrito")) {
													            carrito.mostrarContenido();
													            System.out.println("¿Deseas confirmar tu compra? (si/no)");
													            procesoCompra.procesarCompra(scanner, cliente, carrito, inventario);
													      }
													    }break;	
													
													case 2: //Electrodomesticos
														System.out.println("Seleccionaste 'Electrodomesticos'.");
														System.out.println("Productos disponibles:");
														ArrayList<Producto> electrodomesticos= inventario.getElectrodomesticos();
														for (Producto producto : electrodomesticos) {
															System.out.println("- " + producto.getNombre() + " - Descripción: " + producto.getDescripcion() + " - Precio: $" + producto.getPrecio() + " - Cantidad disponible: " + producto.getCantidadDisponible());
														}
													    System.out.println("Ingresa el nombre del producto que deseas comprar:");
													    scanner.nextLine();
													    String nombreProductoElectrodomesticos = scanner.nextLine().trim();
													    int indexProducto2 = -1;
													    for (int i = 0; i < electrodomesticos.size(); i++) {
													        if (electrodomesticos.get(i).getNombre().equalsIgnoreCase(nombreProductoElectrodomesticos)) {
													            indexProducto2 = i;
													            break;
													        }
													    }
													    if (indexProducto2 == -1) {
													        System.out.println("Producto no encontrado.");
													        break;
													    }
													    Producto productoElectrodomesticos = electrodomesticos.get(indexProducto2);
													    System.out.println("Ingresa la cantidad que deseas comprar:");
													    int cantidadElectrodomesticos = scanner.nextInt();
													    scanner.nextLine();
													    if (ProcesoCompra.comprarProducto(productoElectrodomesticos, cantidadElectrodomesticos, carrito)) {
													        System.out.println("¿Deseas seguir comprando o ir al carrito? (comprar/carrito)");
													        String respuesta31 = scanner.next().trim();
													        if (respuesta31.equalsIgnoreCase("comprar")) {
													            continue;
													        } else if (respuesta31.equalsIgnoreCase("carrito")) {
													            carrito.mostrarContenido();
													            System.out.println("¿Deseas confirmar tu compra? (si/no)");
													            procesoCompra.procesarCompra(scanner, cliente, carrito, inventario);
													      }
													    }break;	
													
													case 3: //Limpieza e higiene
														System.out.println("Seleccionaste 'LimpiezaEHigiene'.");
														System.out.println("Productos disponibles:");
														ArrayList<Producto> limpiezaEHigiene= inventario.getLimpiezaEHigiene();
														for (Producto producto : limpiezaEHigiene) {
															System.out.println("- " + producto.getNombre() + " - Descripción: " + producto.getDescripcion() + " - Precio: $" + producto.getPrecio() + " - Cantidad disponible: " + producto.getCantidadDisponible());
														}
													    System.out.println("Ingresa el nombre del producto que deseas comprar:");
													    scanner.nextLine();
													    String nombreProductoLimpiezaEHigiene = scanner.nextLine().trim();
													    int indexProducto3 = -1;
													    for (int i = 0; i < limpiezaEHigiene.size(); i++) {
													        if (limpiezaEHigiene.get(i).getNombre().equalsIgnoreCase(nombreProductoLimpiezaEHigiene)) {
													            indexProducto3 = i;
													            break;
													        }
													    }
													    if (indexProducto3 == -1) {
													        System.out.println("Producto no encontrado.");
													        break;
													    }
													    Producto productoLimpiezaEHigiene = limpiezaEHigiene.get(indexProducto3);
													    System.out.println("Ingresa la cantidad que deseas comprar:");
													    int cantidadLimpiezaEHigiene = scanner.nextInt();
													    scanner.nextLine();
													    if (ProcesoCompra.comprarProducto(productoLimpiezaEHigiene, cantidadLimpiezaEHigiene, carrito)) {
													        System.out.println("¿Deseas seguir comprando o ir al carrito? (comprar/carrito)");
													        String respuesta31 = scanner.next().trim();
													        if (respuesta31.equalsIgnoreCase("comprar")) {
													            continue;
													        } else if (respuesta31.equalsIgnoreCase("carrito")) {
													            carrito.mostrarContenido();
													            System.out.println("¿Deseas confirmar tu compra? (si/no)");
													            procesoCompra.procesarCompra(scanner, cliente, carrito, inventario);
													      }
													    }break;
													
													case 4: //Ferreteria
														System.out.println("Seleccionaste 'Ferreteria'.");
														System.out.println("Productos disponibles:");
														ArrayList<Producto> ferreteria= inventario.getFerreteria();
														for (Producto producto : ferreteria) {
															System.out.println("- " + producto.getNombre() + " - Descripción: " + producto.getDescripcion() + " - Precio: $" + producto.getPrecio() + " - Cantidad disponible: " + producto.getCantidadDisponible());
														}
													    System.out.println("Ingresa el nombre del producto que deseas comprar:");
													    scanner.nextLine();
													    String nombreProductoFerreteria = scanner.nextLine().trim();
													    int indexProducto4 = -1;
													    for (int i = 0; i < ferreteria.size(); i++) {
													        if (ferreteria.get(i).getNombre().equalsIgnoreCase(nombreProductoFerreteria)) {
													            indexProducto4 = i;
													            break;
													        }
													    }
													    if (indexProducto4 == -1) {
													        System.out.println("Producto no encontrado.");
													        break;
													    }
													    Producto productoFerreteria = ferreteria.get(indexProducto4);
													    System.out.println("Ingresa la cantidad que deseas comprar:");
													    int cantidadFerreteria = scanner.nextInt();
													    scanner.nextLine();
													    if (ProcesoCompra.comprarProducto(productoFerreteria, cantidadFerreteria, carrito)) {
													        System.out.println("¿Deseas seguir comprando o ir al carrito? (comprar/carrito)");
													        String respuesta31 = scanner.next().trim();
													        if (respuesta31.equalsIgnoreCase("comprar")) {
													            continue;
													        } else if (respuesta31.equalsIgnoreCase("carrito")) {
													            carrito.mostrarContenido();
													            System.out.println("¿Deseas confirmar tu compra? (si/no)");
													            procesoCompra.procesarCompra(scanner, cliente, carrito, inventario);
													      }
													    }break;	
													
													case 5: //Decoracion y hogar
														System.out.println("Seleccionaste 'DecoracionYHogar'.");
														System.out.println("Productos disponibles:");
														ArrayList<Producto> decoracionYHogar= inventario.getDecoracionYHogar();
														for (Producto producto : decoracionYHogar) {
															System.out.println("- " + producto.getNombre() + " - Descripción: " + producto.getDescripcion() + " - Precio: $" + producto.getPrecio() + " - Cantidad disponible: " + producto.getCantidadDisponible());
														}
													    System.out.println("Ingresa el nombre del producto que deseas comprar:");
													    scanner.nextLine();
													    String nombreProductoDecoracionYHogar= scanner.nextLine().trim();
													    int indexProducto5 = -1;
													    for (int i = 0; i < decoracionYHogar.size(); i++) {
													        if (decoracionYHogar.get(i).getNombre().equalsIgnoreCase(nombreProductoDecoracionYHogar)) {
													            indexProducto5 = i;
													            break;
													        }
													    }
													    if (indexProducto5 == -1) {
													        System.out.println("Producto no encontrado.");
													        break;
													    }
													    Producto productoDecoracionYHogar = decoracionYHogar.get(indexProducto5);
													    System.out.println("Ingresa la cantidad que deseas comprar:");
													    int cantidadDecoracionYHogar = scanner.nextInt();
													    scanner.nextLine();
													    if (ProcesoCompra.comprarProducto(productoDecoracionYHogar, cantidadDecoracionYHogar, carrito)) {
													        System.out.println("¿Deseas seguir comprando o ir al carrito? (comprar/carrito)");
													        String respuesta31 = scanner.next().trim();
													        if (respuesta31.equalsIgnoreCase("comprar")) {
													            continue;
													        } else if (respuesta31.equalsIgnoreCase("carrito")) {
													            carrito.mostrarContenido();
													            System.out.println("¿Deseas confirmar tu compra? (si/no)");
													            procesoCompra.procesarCompra(scanner, cliente, carrito, inventario);
													      }
													    }break;	
													    
													case 6: //Jugueteria
														System.out.println("Seleccionaste 'Jugueteria'.");
														System.out.println("Productos disponibles:");
														ArrayList<Producto> jugueteria= inventario.getJugueteria();
														for (Producto producto : jugueteria) {
															System.out.println("- " + producto.getNombre() + " - Descripción: " + producto.getDescripcion() + " - Precio: $" + producto.getPrecio() + " - Cantidad disponible: " + producto.getCantidadDisponible());
														}
													    System.out.println("Ingresa el nombre del producto que deseas comprar:");
													    scanner.nextLine();
													    String nombreProductoJugueteria= scanner.nextLine().trim();
													    int indexProducto6 = -1;
													    for (int i = 0; i < jugueteria.size(); i++) {
													        if (jugueteria.get(i).getNombre().equalsIgnoreCase(nombreProductoJugueteria)) {
													            indexProducto6 = i;
													            break;
													        }
													    }
													    if (indexProducto6 == -1) {
													        System.out.println("Producto no encontrado.");
													        break;
													    }
													    Producto productoJugueteria = jugueteria.get(indexProducto6);
													    System.out.println("Ingresa la cantidad que deseas comprar:");
													    int cantidadJugueteria = scanner.nextInt();
													    scanner.nextLine();
													    if (ProcesoCompra.comprarProducto(productoJugueteria, cantidadJugueteria, carrito)) {
													        System.out.println("¿Deseas seguir comprando o ir al carrito? (comprar/carrito)");
													        String respuesta31 = scanner.next().trim();
													        if (respuesta31.equalsIgnoreCase("comprar")) {
													            continue;
													        } else if (respuesta31.equalsIgnoreCase("carrito")) {
													            carrito.mostrarContenido();
													            System.out.println("¿Deseas confirmar tu compra? (si/no)");
													            procesoCompra.procesarCompra(scanner, cliente, carrito, inventario);
													      }
													    }break;
													
													case 7: //Tecnologia
														System.out.println("Seleccionaste 'Tecnologia'.");
														System.out.println("Productos disponibles:");
														ArrayList<Producto> tecnologia= inventario.getTecnologia();
														for (Producto producto : tecnologia) {
															System.out.println("- " + producto.getNombre() + " - Descripción: " + producto.getDescripcion() + " - Precio: $" + producto.getPrecio() + " - Cantidad disponible: " + producto.getCantidadDisponible());
														}
													    System.out.println("Ingresa el nombre del producto que deseas comprar:");
													    scanner.nextLine();
													    String nombreProductoTecnologia= scanner.nextLine().trim();
													    int indexProducto7 = -1;
													    for (int i = 0; i < tecnologia.size(); i++) {
													        if (tecnologia.get(i).getNombre().equalsIgnoreCase(nombreProductoTecnologia)) {
													            indexProducto7 = i;
													            break;
													        }
													    }
													    if (indexProducto7 == -1) {
													        System.out.println("Producto no encontrado.");
													        break;
													    }
													    Producto productoTecnologia = tecnologia.get(indexProducto7);
													    System.out.println("Ingresa la cantidad que deseas comprar:");
													    int cantidadTecnologia = scanner.nextInt();
													    scanner.nextLine();
													    if (ProcesoCompra.comprarProducto(productoTecnologia, cantidadTecnologia, carrito)) {
													        System.out.println("¿Deseas seguir comprando o ir al carrito? (comprar/carrito)");
													        String respuesta31 = scanner.next().trim();
													        if (respuesta31.equalsIgnoreCase("comprar")) {
													            continue;
													        } else if (respuesta31.equalsIgnoreCase("carrito")) {
													            carrito.mostrarContenido();
													            System.out.println("¿Deseas confirmar tu compra? (si/no)");
													            procesoCompra.procesarCompra(scanner, cliente, carrito, inventario);
													      }
													    }break;
													
													case 8: //Ropa y accesorios
														System.out.println("Seleccionaste 'RopaYAccesorios'.");
														System.out.println("Productos disponibles:");
														ArrayList<Producto> ropaYAccesorios= inventario.getRopaYAccesorios();
														for (Producto producto : ropaYAccesorios) {
															System.out.println("- " + producto.getNombre() + " - Descripción: " + producto.getDescripcion() + " - Precio: $" + producto.getPrecio() + " - Cantidad disponible: " + producto.getCantidadDisponible());
														}
													    System.out.println("Ingresa el nombre del producto que deseas comprar:");
													    scanner.nextLine();
													    String nombreProductoRopaYAccesorios= scanner.nextLine().trim();
													    int indexProducto8 = -1;
													    for (int i = 0; i < ropaYAccesorios.size(); i++) {
													        if (ropaYAccesorios.get(i).getNombre().equalsIgnoreCase(nombreProductoRopaYAccesorios)) {
													            indexProducto8 = i;
													            break;
													        }
													    }
													    if (indexProducto8 == -1) {
													        System.out.println("Producto no encontrado.");
													        break;
													    }
													    Producto productoRopaYAccesorios = ropaYAccesorios.get(indexProducto8);
													    System.out.println("Ingresa la cantidad que deseas comprar:");
													    int cantidadRopaYAccesorios = scanner.nextInt();
													    scanner.nextLine();
													    if (ProcesoCompra.comprarProducto(productoRopaYAccesorios, cantidadRopaYAccesorios, carrito)) {
													        System.out.println("¿Deseas seguir comprando o ir al carrito? (comprar/carrito)");
													        String respuesta31 = scanner.next().trim();
													        if (respuesta31.equalsIgnoreCase("comprar")) {
													            continue;
													        } else if (respuesta31.equalsIgnoreCase("carrito")) {
													            carrito.mostrarContenido();
													            System.out.println("¿Deseas confirmar tu compra? (si/no)");
													            procesoCompra.procesarCompra(scanner, cliente, carrito, inventario);
													      }
													    }break;
													
													case 9: //Libros y papeleria
														System.out.println("Seleccionaste 'LibrosYPapeleria'.");
														System.out.println("Productos disponibles:");
														ArrayList<Producto> librosYPapeleria= inventario.getLibrosYPapeleria();
														for (Producto producto : librosYPapeleria) {
															System.out.println("- " + producto.getNombre() + " - Descripción: " + producto.getDescripcion() + " - Precio: $" + producto.getPrecio() + " - Cantidad disponible: " + producto.getCantidadDisponible());
														}
													    System.out.println("Ingresa el nombre del producto que deseas comprar:");
													    scanner.nextLine();
													    String nombreProductoLibrosYPapeleria= scanner.nextLine().trim();
													    int indexProducto9 = -1;
													    for (int i = 0; i < librosYPapeleria.size(); i++) {
													        if (librosYPapeleria.get(i).getNombre().equalsIgnoreCase(nombreProductoLibrosYPapeleria)) {
													            indexProducto9 = i;
													            break;
													        }
													    }
													    if (indexProducto9 == -1) {
													        System.out.println("Producto no encontrado.");
													        break;
													    }
													    Producto productoLibrosYPapeleria = librosYPapeleria.get(indexProducto9);
													    System.out.println("Ingresa la cantidad que deseas comprar:");
													    int cantidadLibrosYPapeleria = scanner.nextInt();
													    scanner.nextLine();
													    if (ProcesoCompra.comprarProducto(productoLibrosYPapeleria, cantidadLibrosYPapeleria, carrito)) {
													        System.out.println("¿Deseas seguir comprando o ir al carrito? (comprar/carrito)");
													        String respuesta31 = scanner.next().trim();
													        if (respuesta31.equalsIgnoreCase("comprar")) {
													            continue;
													        } else if (respuesta31.equalsIgnoreCase("carrito")) {
													            carrito.mostrarContenido();
													            System.out.println("¿Deseas confirmar tu compra? (si/no)");
													            procesoCompra.procesarCompra(scanner, cliente, carrito, inventario);
													      }
													    }break;
													
													case 10: //Mascotas
														System.out.println("Seleccionaste 'Mascotas'.");
														System.out.println("Productos disponibles:");
														ArrayList<Producto> mascotas= inventario.getMascotas();
														for (Producto producto : mascotas) {
															System.out.println("- " + producto.getNombre() + " - Descripción: " + producto.getDescripcion() + " - Precio: $" + producto.getPrecio() + " - Cantidad disponible: " + producto.getCantidadDisponible());
														}
													    System.out.println("Ingresa el nombre del producto que deseas comprar:");
													    scanner.nextLine();
													    String nombreProductoMascotas= scanner.nextLine().trim();
													    int indexProducto10 = -1;
													    for (int i = 0; i < mascotas.size(); i++) {
													        if (mascotas.get(i).getNombre().equalsIgnoreCase(nombreProductoMascotas)) {
													            indexProducto10 = i;
													            break;
													        }
													    }
													    if (indexProducto10 == -1) {
													        System.out.println("Producto no encontrado.");
													        break;
													    }
													    Producto productoMascotas= mascotas.get(indexProducto10);
													    System.out.println("Ingresa la cantidad que deseas comprar:");
													    int cantidadMascotas = scanner.nextInt();
													    scanner.nextLine();
													    if (ProcesoCompra.comprarProducto(productoMascotas, cantidadMascotas, carrito)) {
													        System.out.println("¿Deseas seguir comprando o ir al carrito? (comprar/carrito)");
													        String respuesta31 = scanner.next().trim();
													        if (respuesta31.equalsIgnoreCase("comprar")) {
													            continue;
													        } else if (respuesta31.equalsIgnoreCase("carrito")) {
													            carrito.mostrarContenido();
													            System.out.println("¿Deseas confirmar tu compra? (si/no)");
													            procesoCompra.procesarCompra(scanner, cliente, carrito, inventario);
													      }
													    }break;
													
													case 11: //Salud y medicamentos
														System.out.println("Seleccionaste 'SaludYMedicamentos'.");
														System.out.println("Productos disponibles:");
														ArrayList<Producto> saludYMedicamentos= inventario.getSaludYMedicamentos();
														for (Producto producto : saludYMedicamentos) {
															System.out.println("- " + producto.getNombre() + " - Descripción: " + producto.getDescripcion() + " - Precio: $" + producto.getPrecio() + " - Cantidad disponible: " + producto.getCantidadDisponible());
														}
													    System.out.println("Ingresa el nombre del producto que deseas comprar:");
													    scanner.nextLine();
													    String nombreProductoSaludYMedicamentos= scanner.nextLine().trim();
													    int indexProducto11 = -1;
													    for (int i = 0; i < saludYMedicamentos.size(); i++) {
													        if (saludYMedicamentos.get(i).getNombre().equalsIgnoreCase(nombreProductoSaludYMedicamentos)) {
													            indexProducto11 = i;
													            break;
													        }
													    }
													    if (indexProducto11 == -1) {
													        System.out.println("Producto no encontrado.");
													        break;
													    }
													    Producto productoSaludYMedicamentos= saludYMedicamentos.get(indexProducto11);
													    System.out.println("Ingresa la cantidad que deseas comprar:");
													    int cantidadSaludYMedicamentos = scanner.nextInt();
													    scanner.nextLine();
													    if (ProcesoCompra.comprarProducto(productoSaludYMedicamentos, cantidadSaludYMedicamentos, carrito)) {
													        System.out.println("¿Deseas seguir comprando o ir al carrito? (comprar/carrito)");
													        String respuesta31 = scanner.next().trim();
													        if (respuesta31.equalsIgnoreCase("comprar")) {
													            continue;
													        } else if (respuesta31.equalsIgnoreCase("carrito")) {
													            carrito.mostrarContenido();
													            System.out.println("¿Deseas confirmar tu compra? (si/no)");
													            procesoCompra.procesarCompra(scanner, cliente, carrito, inventario);
													      }
													    }break;
						               	}
							               case 3: //Anterior
							            	   break; //Romper Mostrar menu
							            
							               default: //Opcion invalida
							            	   break; //Romper opcion invalida
					               }  
					            }while(opcionC1!=3);
					               //scanner.close();
					            }else{
					               System.out.println("Contraseña incorrecta.");
					            }
							}
							break; //Romper iniciar seccion cliente.
						
						case 2: //Registrarse cliente
							gestionClientes.registrarCliente(scanner, gestionClientes);
							break; //Romper registrarse cliente
						
						case 3: 
							break;
						
						default: //Opcion invalida
							break; //Romper opcion invalida
					}
					break; //Romper cliente
				
				case 2: //Proveedor
					System.out.println("Has seleccionado la opción de proveedor:");
					System.out.println("¿Ya tienes cuenta o deseas registrarte?");
					System.out.println("1.Iniciar sesión");
					System.out.println("2.Registrase");
					System.out.println("Ingrese su opción:");
					opcionProveedor=scanner.nextInt();
					
					switch(opcionProveedor){
						case 1: //Iniciar sesion proveedor
							System.out.println("Ingrese el código:");
							String codigo= scanner.next();
							System.out.println("Ingrese el nombre:");
							scanner.nextLine();
							String nombre1= scanner.nextLine();
							
							Proveedor proveedor= gestionProveedores.buscarProveedor(codigo, nombre1);
							if (proveedor== null) {
								System.out.println("No se ha registrado algún proveedor con ese código y nombre.");
							}else{
								System.out.println("Ingrese su contraseña: ");
					            String contrasena = scanner.next();
					        if(proveedor.getContraseña().equals(contrasena)) {
					        	System.out.println("¡Bienvenido " + proveedor.getNombre1()+"!");
					        	
					        	do {
					        		 System.out.println("¿Qué deseas hacer?");
					        		 System.out.println("1.Mostrar información de mi perfil");
					        		 System.out.println("2.Agregar productos");
					        		 System.out.println("3.Mirar contrato");
					        		 System.out.println("4.Anterior");
					        		 System.out.println("Ingrese su opción:");
					        		 opcionP1=scanner.nextInt();
					        		 
					        		 switch(opcionP1){
						        		 case 1: //Información del perfil del proveedor
						        			 	gestionProveedores.mostrarPerfilProveedor(proveedor);
							            	   break; //Romper información del perfil proveedor
							            	   
						        		 case 2: //Agregar productos
						        			 	proveedor.agregarProductoProveedor(scanner, gestionProveedores);
						        			 break; //Romper agregar productos
						        			 
						        		 case 3: //Mirar contrato
										String codigo9 = proveedor.getCodigo();
                                                                                String nombre7 = proveedor.getNombre1();
                                                                                String direccion1 = proveedor.getDireccion1();
                                                                                String telefono = proveedor.getTelefono();
                                                                                String correoElectronico = proveedor.getCorreoElectronico();
                                                                                String contrasena2 = proveedor.getContraseña();
                                                                     {
                                                                         ContratoProveedor.crearContratoProveedor(codigo9, nombre7, direccion1, telefono, correoElectronico, contrasena2);
                                                                     }
						        			 break; //Romper contrato

						        		 
						        		 case 4: //salir
						        			 break; //Romper salir
						        			 
						        	     default: //Opción invalida
						        	    	 break; //Romper opción invalida	 
					        		 }
					        	}while(opcionP1!=4);
					        }
							}
						case 2: //Registro Proveedor
							gestionProveedores.registrarProveedor(scanner, gestionProveedores);
		                    break; //Romper registro proveedor	        
							
						default: //Opcion invalida
							break; //Opcion invalida
					}
					break; //Romper proveedor;
					
				case 3: //Empleado 
					do {
			            System.out.println("¿Qué deseas hacer?");
			            System.out.println("1.Registrar Empleado");
			            System.out.println("2.Salir");
			            System.out.print("Ingrese una opción: ");
			            opcionE = scanner.nextInt();

			            switch (opcionE) {
			                case 1: //Registrarse empleado
			                	gestionEmpleados.registrarPEmpleados(scanner, gestionEmpleados);
			                    break; //Romper registro empleado
			                    
			                case 2: //Salir
			                    break; //Romper salir
			                    
			                default: //opcion invalida
			                    System.out.println("Opción inválida.");
			                    break; //Romper opcion invalida
			            }
			        } while (opcionE != 2);
					
					break; //Romper empleado
				
				case 4: //Administrador
					System.out.println("ADMINISTRADOR: ");
					String nombreUsuario = scanner.next();
					System.out.println("CONTRASEÑA: ");
					String contraseña = scanner.next();
					if (adminInfo.containsKey(nombreUsuario) && adminInfo.get(nombreUsuario).equals(contraseña)) {
					    int opcion;
					    do {
					        System.out.println("1.Mi información");
					        System.out.println("2.Buscar usuarios");
					        System.out.println("3.Eliminar usuarios");
					        System.out.println("4.Buscar productos");
					        System.out.println("5.Salir");
					        
					        opcion = scanner.nextInt();
					        switch (opcion) {
					        	case 1:   
					        		Administrador administrador=new Administrador();
					        		Administrador.mostrarPerfilAdministrador(administrador);
					                break;
					                
					            case 2: //Buscar usuarios
					            	 	System.out.println("¿Qué tipo de usuario desea buscar?");
					            	    System.out.println("1.Clientes");
					            	    System.out.println("2.Proveedores");
					            	    System.out.println("3.Salir");
					            	    int opcionBusqueda = scanner.nextInt();

					            	    switch(opcionBusqueda) {
					            	        case 1:
					            	        	System.out.println("Ingrese el codigo del cliente: ");
					            	            String codigoCliente = scanner.next();
					            	            System.out.println("Ingrese la cedula del cliente: ");
					            	            String cedulaCliente = scanner.next();
					            	            Cliente clienteEncontrado = gestionClientes.buscarCliente(codigoCliente, cedulaCliente);
					            	            if (clienteEncontrado != null) {
					            	                System.out.println("Cliente encontrado: " + clienteEncontrado.toString());
					            	            } else {
					            	                System.out.println("No se ha encontrado un cliente con esos datos");
					            	            }
					            	            break;
					            	            
					            	        case 2:
					            	        	System.out.println("Ingrese el código del proveedor: ");
					            	            String codigoProveedor = scanner.next();
					            	            System.out.println("Ingrese el nombre del proveedor: ");
					            	            String nombreUsuario11 = scanner.next().trim();
					            	            Proveedor proveedorEncontrado = gestionProveedores.buscarProveedor(codigoProveedor, nombreUsuario11);
					            	            if (proveedorEncontrado != null) {
					            	                System.out.println("Proveedor encontrado: " + proveedorEncontrado.toString());
					            	            } else {
					            	                System.out.println("No se ha encontrado un proveedor con ese código");
					            	            }
					            	            break;
					            	            
					            	        case 3:
					            	            // Volver al menú principal
					            	            break;
					            	            
					            	        default:
					            	            System.out.println("Opción inválida");
					            	            break;
					            	    }
					                break;//Romper usuarios
					                
					            case 3:
					            	System.out.println("¿Qué tipo de usuario quiere eliminar");
					            	System.out.println("1.Clientes");
					            	System.out.println("2.Proveedores");
					            	System.out.println("3.Salir");
					            	int opcionEliminar = scanner.nextInt();
					            	
					            	switch(opcionEliminar) {
						            	case 1: //Eliminar cliente
						            		System.out.println("Ingrese el codigo del cliente: ");
				            	            String codigoCliente = scanner.next();
				            	            System.out.println("Ingrese la cedula del cliente: ");
				            	            scanner.nextLine();
				            	            String cedulaCliente = scanner.next();
				            	            boolean clienteEncontrado = gestionClientes.eliminarCliente(codigoCliente, cedulaCliente);
				            	            if (clienteEncontrado != false) {
				            	                System.out.println("Cliente eliminado");
				            	            } else {
				            	                System.out.println("No se pudo eliminar al cliente");
				            	            }
						            		break; //romper eliminar cliente
						            		
						            	case 2: //Eliminar proveedor
						            		System.out.println("Ingrese el código del proveedor: ");
				            	            String codigoProveedor = scanner.next();
				            	            System.out.println("Ingrese el nombre del proveedor: ");
				            	            String nombreUsuario1 = scanner.next().trim();
				            	            boolean proveedorEncontrado = gestionProveedores.eliminarProveedor(codigoProveedor, nombreUsuario1);
				            	            if (proveedorEncontrado != false) {
				            	                System.out.println("Proveedor eliminado");
				            	            } else {
				            	                System.out.println("No se ha encontrado un proveedor con ese código");
				            	            }
						            		break; //romper eliminar proveedor
						            	
						            	case 3: //salir
						            		break; //romper salir
						            	
						            	default: 
						            		System.out.println("Opción inválida");
						            		break;
					            	}

					                break;
					                
					            case 4:
					            	System.out.println("Ingrese el nombre del producto a buscar:");
					            	scanner.nextLine();
					                String nombreProducto = scanner.nextLine().trim();
					                Producto productoEncontrado = inventario.buscarProducto(nombreProducto);
					                if (productoEncontrado != null) {
					                    System.out.println("Producto encontrado: " + productoEncontrado.toString());
					                } else {
					                    System.out.println("No se ha encontrado un producto con ese nombre");
					                }
					                break;
					                
					            case 5:System.out.println("Hasta la próxima!");
					                
					                break;
					                
					            default:
					                System.out.println("Opción inválida");
					                break;
					        }
					    } while (opcion != 6);
					} else {
					    System.out.println("Nombre de usuario o contraseña incorrectos.");
					}
					
					break; //Romper administrador
					
				case 5:
                                    
					int numero;
					System.out.println("digite un numero");
					System.out.println("1-Leer la politica de la empresa");
					System.out.println("2-Leer sobre los creadores del software");
					System.out.println("3-Informacion sobre Atencion al cliente");
                                        System.out.println("4-Si estas interesado en saber la ubicación de nuestras tiendas");
                                        System.out.println("5-Saber sobre nuestras promociones");
                                        System.out.println("6-Salir");
                                        
					numero=scanner.nextInt();
	              
					switch (numero) {
                                                case 1: Comentarios.terminosYCondiciones(); break;
                                                case 2: Comentarios.equipoDeTrabajo(); break;
                                                case 3: Comentarios.servicioAlCliente(); break;
                                                case 4: Comentarios.mostrarUbicaciones(); break;
                                                case 5: Comentarios. mostrarinfoPromociones(); break;
                                                case 6: break;
                                                default:  break; //Romper opcion invalida
                                        }
                                              break; //Romper salir

                                      default: //Opcion invalida
                                              break; //Romper opcion invalida
				}
		}while(general!=5);
                Comentarios.despedida();
	}
}