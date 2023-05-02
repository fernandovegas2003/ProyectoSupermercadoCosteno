package com.mycompany.proyectosupermercadocosteno.co.edu.upb.proyectoanalisisdesistemas;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Empleado {
	private String nombre;
    private String direccion;
    private String telefono;
    private String correoElectronico;
    private String cargo;
    private Date fechaContratacion;
    private String cedula;
    private int codigo;

    public Empleado(String nombre, String direccion, String telefono, String correoElectronico, String cargo, String string, String cedula, int codigo) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
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

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	 public boolean guardarDatosEmpleadoEnArchivoTxt( String nombre,String direccion,String correoElectronico,String cargo,Date fechaContratacion , String cedula, int codigo) {
			File archivo;
			FileWriter write;
			BufferedWriter bw;
			PrintWriter wr;
			archivo= new File ("D:\\Documents\\ArchivosTxt\\Empleado.txt");
			
			
			if( !archivo.exists()) {
				try {
					archivo.createNewFile();
					write = new FileWriter(archivo,true);
					bw =new BufferedWriter(write);
					wr = new PrintWriter(bw);
					
					wr.println("---------------------------------------------------\n");
					wr.write("\n"+nombre);
					wr.write("\n"+direccion);
					wr.write("\n"+correoElectronico);
					wr.write("\n"+cargo);
					wr.write("\n"+fechaContratacion);
					wr.write("\n"+cedula);
					wr.write("\n"+codigo);
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
					wr.write("\n"+nombre);
					wr.write("\n"+direccion);
					wr.write("\n"+correoElectronico);
					wr.write("\n"+cargo);
					wr.write("\n"+fechaContratacion);
					wr.write("\n"+cedula);
					wr.write("\n"+codigo);
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
