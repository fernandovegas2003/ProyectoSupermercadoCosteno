package com.mycompany.proyectosupermercadocosteno.co.edu.upb.proyectoanalisisdesistemas;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Empleado {
	private String nombre;
    private String direccion;
    private String telefono3;
    private String correoElectronico;
    private String cargo;
    private Date fechaContratacion;
    private String cedula;
    private String codigo;

    public Empleado(String nombre, String direccion, String telefono3, String correoElectronico, String cargo, Date fechaContratacion, String cedula, String codigo) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono3 = telefono3;
        this.correoElectronico = correoElectronico;
        this.cargo = cargo;
        this.fechaContratacion = fechaContratacion;
        this.cedula = cedula;
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono3() {
        return telefono3;
    }

    public void setTelefono3(String telefono3) {
        this.telefono3 = telefono3;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Date getFechaContratacion() {
        return fechaContratacion;
    }

    public void setFechaContratacion(Date fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }
    
    public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	public void guardarDatosEmpleadoEnArchivoTxt() {
	    String nombreArchivo = "datos-empleado-" + this.getCedula() + ".txt";

	    try {
	        PrintWriter writer = new PrintWriter(nombreArchivo, "UTF-8");
	        writer.println("Nombre: " + this.getNombre());
	        writer.println("Código: " + this.getCodigo());
	        writer.println("Dirección: " + this.getDireccion());
	        writer.println("Teléfono: " + this.getTelefono3());
	        writer.println("Correo electrónico: " + this.getCorreoElectronico());
	        writer.println("Cargo: " + this.getCargo());
	        writer.println("Fecha de contratación: " + new SimpleDateFormat("dd/MM/yyyy").format(this.getFechaContratacion()));
	        writer.println("Cédula: " + this.getCedula());
	        writer.close();
	        System.out.println("Los datos del empleado han sido guardados en el archivo " + nombreArchivo);
	    } catch (FileNotFoundException | UnsupportedEncodingException e) {
	        System.err.println("Error al guardar los datos del empleado en el archivo " + nombreArchivo + ": " + e.getMessage());
	    }
	}
	
	public String toString() {
        return "Empleado=" +"nombre:" + nombre +", cédula:"+ cedula +", direccion:" + direccion +", telefono:"+ telefono3 +", correoElectronico:" + correoElectronico +", cargo:" + cargo +", fecha de contratacion:" + fechaContratacion + ", código:" + codigo;
    }
}
