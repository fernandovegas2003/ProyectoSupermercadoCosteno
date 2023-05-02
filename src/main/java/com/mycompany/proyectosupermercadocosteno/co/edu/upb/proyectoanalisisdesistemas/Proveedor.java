package com.mycompany.proyectosupermercadocosteno.co.edu.upb.proyectoanalisisdesistemas;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;

public class Proveedor {
	private String codigo;
	private String nombre1;
	private String contraseña;
    private String direccion1;
    private String telefono;
    private String correoElectronico;
    private List<Producto> productos;
    private GestionProductos gestionProductos;

    public Proveedor(String codigo, String nombre1, String contraseña, String direccion1, String telefono, String correoElectronico, List<Producto> productos) {
    	this.codigo= codigo;
    	this.nombre1 = nombre1;
    	this.contraseña= contraseña;
        this.direccion1 = direccion1;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
        this.productos = productos;
        this.gestionProductos = new GestionProductos();
    }
    
    public Proveedor(String codigo1, String nombre11, String contraseña2, String direccion12, String telefono2,String correoElectronico2) {
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

    public String getNombre1() {
        return nombre1;
    }

    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	
    public String getDireccion1() {
        return direccion1;
    }

    public void setDireccion(String direccion1) {
        this.direccion1 = direccion1;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
    
    public void agregarProducto(Producto producto) {
        boolean encontrado = false;
        for (Producto p : productos) {
            if (p.getNombre().equals(producto.getNombre())) {
                encontrado = true;
                p.setCantidadDisponible(p.getCantidadDisponible() + producto.getCantidadDisponible());
                System.out.println("Se ha agregado " + producto.getCantidadDisponible() + " unidades de " + producto.getNombre() + " al inventario.");
                break;
            }
        }if (!encontrado) {
            System.out.println("No se ha encontrado el producto " + producto.getNombre() + ". Por favor, primero agregue el producto antes de aumentar el inventario.");
        }
    }
    
    public GestionProductos getGestionProductos() {
        return gestionProductos;
    }
    
    public String toString() {
        return "Proveedor=" +"codigo:" + codigo +", nombre:" + nombre1 +", contraseña:"+ contraseña +", direccion:" + direccion1 +", telefono:" + telefono +", correo electronico:" + correoElectronico + ", lista de productos:" + productos;
    }
    
    public boolean  guardarDatosProveedorEnArchivoTxt(String codigo,String nombre1,String contraseña,String direccion1,String telefono,String correoElectronico) {
		File archivo;
		FileWriter write;
		BufferedWriter bw;
		PrintWriter wr;
		archivo= new File ("C:\\Users\\julic\\eclipse-workspace\\ProyectoAnalisisdeSistemas\\PROVEEDORES.txt");
		
		if( !archivo.exists()) {
			try {
				archivo.createNewFile();
				write = new FileWriter(archivo,true);
				bw =new BufferedWriter(write);
				wr = new PrintWriter(bw);
				
				wr.println("---------------------------------------------------\n");
				wr.write("\n"+codigo);
				wr.write("\n"+nombre1);
				wr.write("\n"+contraseña);
				wr.write("\n"+direccion1);
				wr.write("\n"+telefono);
				wr.write("\n"+correoElectronico);
				wr.write("\n-----------------------------------------------------\n");
				wr.close();
				bw.close();
			}catch(IOException e) {
				System.out.println("Error");
			}
		}else {
			try {
				archivo.createNewFile();
				write = new FileWriter(archivo,true);
				bw =new BufferedWriter(write);
				wr = new PrintWriter(bw);
				
				wr.println("---------------------------------------------------\n");
				wr.write("\n"+codigo);
				wr.write("\n"+nombre1);
				wr.write("\n"+contraseña);
				wr.write("\n"+direccion1);
				wr.write("\n"+telefono);
				wr.write("\n"+correoElectronico);
				wr.write("\n-----------------------------------------------------\n");
				wr.close();
				bw.close();
			}catch(IOException e) {
				System.out.println("Error");
			}
		}return true;
	}
    
    public void agregarProductoProveedor(Scanner scanner, GestionProveedores gestionProveedores) {
        System.out.println("Ingrese el código del proveedor:");
        String codigo1 = scanner.next();
        Proveedor proveedor11 = gestionProveedores.buscarProveedor(codigo1, nombre1);
        if (proveedor11 != null) {
            System.out.println("Ingrese el nombre del nuevo producto:");
            scanner.nextLine();
            String nombre = scanner.nextLine();
            System.out.println("Ingrese la descripción del nuevo producto:");
            String descripcion= scanner.nextLine();
            System.out.println("Ingrese el precio del nuevo producto:");
            double precio= scanner.nextDouble();
            System.out.println("Ingrese la cantidad de inventario del nuevo producto:");
            int cantidadDisponible= scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer del scanner

            Producto nuevoProducto = new Producto(nombre, descripcion, precio, cantidadDisponible);
            proveedor11.getGestionProductos().agregarProducto(nuevoProducto);
            System.out.println("Producto agregado con éxito.");
        } else {
            System.out.println("No se encontró un proveedor con ese código.");
        }
    }
}
