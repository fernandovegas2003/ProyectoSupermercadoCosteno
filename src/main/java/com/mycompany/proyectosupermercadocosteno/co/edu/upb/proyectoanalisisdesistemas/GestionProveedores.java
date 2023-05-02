package com.mycompany.proyectosupermercadocosteno.co.edu.upb.proyectoanalisisdesistemas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GestionProveedores {
	private ArrayList<Proveedor> proveedores;

    public GestionProveedores() {
        this.proveedores = new ArrayList<>();
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
}
