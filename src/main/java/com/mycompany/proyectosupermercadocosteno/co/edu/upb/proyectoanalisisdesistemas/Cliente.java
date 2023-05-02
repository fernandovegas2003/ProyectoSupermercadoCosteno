package com.mycompany.proyectosupermercadocosteno.co.edu.upb.proyectoanalisisdesistemas;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Cliente {
	private String codigo;
    private String cedula;
    private String nombre;
    private String contrasena;
    private String telefono;
    private String correoElectronico;
    
    public Cliente(String codigo, String cedula, String nombre, String contrasena, String telefono, String correoElectronico){
        this.codigo = codigo;
        this.cedula = cedula;
        this.nombre = nombre;
        this.contrasena = contrasena;
        this.telefono= telefono;
        this.correoElectronico= correoElectronico;
    }
    
    public String getCodigo() {
        return codigo;
    }
    
    public String getCedula() {
        return cedula;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public String getContrasena() {
        return contrasena;
    }
    
    public String getTelefono(){
    	return telefono;
    }
    
    public String getCorreoElectronico(){
    	return correoElectronico;
    }
	 public boolean guardarDatosClienteEnArchivoTxt( String codigo,String cedula,String nombre,String contrasena,String telefono, String correoElectronico) {
		File archivo;
		FileWriter write;
		BufferedWriter bw;
		PrintWriter wr;
		archivo= new File ("D:\\Documents\\ArchivosTxt\\Clientes.txt");
		
		
		if( !archivo.exists()) {
			try {
				archivo.createNewFile();
				write = new FileWriter(archivo,true);
				bw =new BufferedWriter(write);
				wr = new PrintWriter(bw);
				
				wr.println("---------------------------------------------------\n");
				wr.write("\n"+codigo);
				wr.write("\n"+cedula);
				wr.write("\n"+nombre);
				wr.write("\n"+contrasena);
				wr.write("\n"+telefono);
				wr.write("\n"+correoElectronico);
				wr.write("\n-----------------------------------------------------\n");
				wr.close();
				bw.close();
			}
			catch(IOException e) {
				System.out.println("Error");
			}
		}
		else {
			try {
				archivo.createNewFile();
				write = new FileWriter(archivo,true);
				bw =new BufferedWriter(write);
				wr = new PrintWriter(bw);
				
				wr.println("---------------------------------------------------\n");
				wr.write("\n"+codigo);
				wr.write("\n"+cedula);
				wr.write("\n"+nombre);
				wr.write("\n"+contrasena);
				wr.write("\n"+telefono);
				wr.write("\n"+correoElectronico);
				wr.write("\n-----------------------------------------------------\n");
				wr.close();
				bw.close();
			}
			catch(IOException e) {
				System.out.println("Error");
			}
		}
		
		return true;
		
	}
}
