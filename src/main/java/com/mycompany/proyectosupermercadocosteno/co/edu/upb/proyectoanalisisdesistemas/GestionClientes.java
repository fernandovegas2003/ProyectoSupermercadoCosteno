package com.mycompany.proyectosupermercadocosteno.co.edu.upb.proyectoanalisisdesistemas;

import java.util.ArrayList;
import java.util.Scanner;

public class GestionClientes {
	private ArrayList<Cliente> clientes;
	 
	 public GestionClientes() {
	        clientes = new ArrayList<Cliente>();
	    }
	    
	     public ArrayList<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}

		public void agregarCliente(Cliente cliente) {
	        clientes.add(cliente);
	    }
	    
	    public Cliente buscarCliente(String codigo, String cedula) {
	        for (Cliente cliente : clientes) {
	            if (cliente.getCodigo().equals(codigo) && cliente.getCedula().equals(cedula)) {
	                return cliente;
	            }
	        }
	        return null;
	    }
}