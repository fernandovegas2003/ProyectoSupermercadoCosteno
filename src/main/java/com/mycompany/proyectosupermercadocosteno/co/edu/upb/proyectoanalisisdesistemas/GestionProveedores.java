package com.mycompany.proyectosupermercadocosteno.co.edu.upb.proyectoanalisisdesistemas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GestionProveedores {
	private ArrayList<Proveedor> proveedores= new ArrayList<Proveedor>();

    public GestionProveedores() {
    }

    public void agregarProveedor(Proveedor proveedor) {
        proveedores.add(proveedor);
    }

    public boolean eliminarProveedor(String codigo,String nombre1) {
        for (Proveedor proveedor : proveedores) {
            if (proveedor.getCodigo().equals(codigo) && proveedor.getNombre1().equals(nombre1)) {
                proveedores.remove(proveedor);
                return true;
            }
        }
        return false;
    }

    public Proveedor buscarProveedor(String codigo,String nombre1) {
        for (Proveedor proveedor : proveedores) {
            if (proveedor.getCodigo().equals(codigo) && proveedor.getNombre1().equals(nombre1)) {
                return proveedor;
            }
        }
        return null;
    }

    public ArrayList<Proveedor> getProveedores() {
        return proveedores;
    }
    
    public void cargarProveedores() {
        List<Producto> productos1 = new ArrayList<>();
        productos1.add(new Producto("Bolso Animal", "Bolso de piel, perfecto para lucir con diferentes prendas.",300.000,540));
        productos1.add(new Producto("Cartera Cuero","Cartera de cuero, perfecta para combinarla con diferentes estilos de ropa.",280.000,600));
        productos1.add(new Producto("CorreaAnimal Print","",80.000,780));
        agregarProveedor(new Proveedor("1090", "PaquitaMilk", "paca12", "Calle 15 #24-34", "3017628933", "paquitamilk@hotmail.com",productos1));
        
        List<Producto> productos2= new ArrayList<>();
        productos2.add(new Producto("Sal Marina","",11.000,560));
        productos2.add(new Producto("Azucar Caña","",10.000,760));
        productos2.add(new Producto("Galletas Chocolate","",14.500,820));
        agregarProveedor(new Proveedor("1080", "DistribuidoraCosta", "345634","Calle 17 #10-22", "3002548821", "distribuidoracosta@gmail.com", productos2));
        
        List<Producto> productos3= new ArrayList<>();
        productos3.add(new Producto("Abrigo Lanax","",105.000,890));
        productos3.add(new Producto("Traje de Baño","",76.000,540));
        productos3.add(new Producto("Botas Cuero","",200.000,700));
        agregarProveedor(new Proveedor("1070", "Lanax", "lanax2023","Calle 64 #33-13", "3225437890", "lanax@gmail.com",productos3));
    }
    
    public void mostrarPerfilProveedor(Proveedor proveedor) {
        System.out.println("---------Perfil---------");
        System.out.println("Código: " + proveedor.getCodigo());
        System.out.println("Nombre: " + proveedor.getNombre1());
        System.out.println("Contraseña: " + proveedor.getContraseña());
        System.out.println("Dirección: " + proveedor.getDireccion1());
        System.out.println("Telefono: " + proveedor.getTelefono());
        System.out.println("Correo Electrónico: " + proveedor.getCorreoElectronico());
    }
    
    public void registrarProveedor(Scanner scanner, GestionProveedores gestionProveedores) {
    	System.out.println("Ingrese los datos del proveedor:");
        System.out.print("Código: ");
        String codigo1 = scanner.next();
        System.out.print("Nombre: ");
        scanner.nextLine();
        String nombre11 = scanner.nextLine();
        System.out.print("Contraseña: ");
        String contraseña = scanner.next();
        System.out.print("Dirección: ");
        scanner.nextLine();
        String direccion1 = scanner.nextLine();
        System.out.print("Teléfono: ");
        String telefono = scanner.next();
        System.out.print("Correo electrónico: ");
        String correoElectronico = scanner.next();
        
        Proveedor proveedor32 = new Proveedor(codigo1, nombre11, contraseña, direccion1, telefono, correoElectronico);
        gestionProveedores.agregarProveedor(proveedor32);
        System.out.println("Proveedor registrado exitosamente.");
        proveedor32.guardarDatosProveedorEnArchivoTxt(codigo1, nombre11, contraseña, direccion1, telefono, correoElectronico);
    }
}
