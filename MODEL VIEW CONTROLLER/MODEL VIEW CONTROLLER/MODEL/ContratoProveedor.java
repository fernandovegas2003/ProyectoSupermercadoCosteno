package com.mycompany.proyectosupermercadocosteno.co.edu.upb.proyectoanalisisdesistemas;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ContratoProveedor {

	 public static void crearContratoProveedor(String codigo, String nombre1, String direccion1, String telefono, String correoElectronico, String contrasena2) throws IOException {
        // Crear una instancia de la clase Date para obtener la fecha actual
        Date fechaActual = new Date();

        // Crear una instancia de la clase DateFormat para darle formato a la fecha
        DateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");

        // Crear una instancia de la clase StringBuilder para construir el contrato
        StringBuilder contrato = new StringBuilder();

        // Agregar información del proveedor al contrato
        contrato.append("CONTRATO DE PROVEEDOR\n\n");
        contrato.append("Entre " + nombre1.toUpperCase() + " identificado con NIT " + codigo + " y el Supermercado COSTAKING, representado por Juliana Chavez King con cedula 1084450416, se ha acordado lo siguiente:\n\n");

        // Agregar información del contrato al contrato
        contrato.append("1. Objeto: El objeto del presente contrato es establecer las condiciones de suministro de los productos.\n");

        contrato.append("\n2. Condiciones: Las condiciones para la entrega de los productos serán establecidas por ambas partes de manera conjunta y se incluirán en un Anexo al presente contrato.\n\n");

        // Agregar información del proveedor al contrato
        contrato.append("3. Obligaciones del Proveedor:\n");
        contrato.append("- Entregar los productos solicitados en las fechas y cantidades acordadas.\n");
        contrato.append("- Mantener informado al Supermercado COSTAKING de cualquier eventualidad que pueda afectar el cumplimiento del contrato.\n");
        contrato.append("- Garantizar la calidad y estado de los productos entregados.\n");
        contrato.append("- Cumplir con las normas de seguridad e higiene en el manejo, almacenamiento y transporte de los productos.\n\n");

        // Agregar información del Supermercado al contrato
        contrato.append("4. Obligaciones del Supermercado COSTAKING:\n");
        contrato.append("- Realizar los pedidos en las fechas y cantidades acordadas.\n");
        contrato.append("- Pagar el valor acordado por los productos entregados.\n");
        contrato.append("- Informar al Proveedor de cualquier eventualidad que pueda afectar el cumplimiento del contrato.\n\n");

        // Agregar información de las condiciones del contrato al contrato
        contrato.append("5. Duración y terminación: El presente contrato tendrá una duración de un año a partir del " + formatoFecha.format(fechaActual) + " y se renovará automáticamente por períodos iguales, salvo que alguna de las partes lo notifique por escrito con al menos un mes de antelación a su vencimiento.\n\n");

        contrato.append("El presente contrato se firma en dos ejemplares, uno para cada una de las partes, en la ciudad de Bogotá D.C. a los " + formatoFecha.format(fechaActual) + ".\n\n");

        contrato.append("Firma del Proveedor:\n\n");
        contrato.append("Nombre de la empresa: " + nombre1.toUpperCase() + "\n");
        contrato.append("NIT: " + codigo + "\n");
        contrato.append(direccion1 + "\n");
        contrato.append("Teléfono: " + telefono + "\n");
        contrato.append("Correo electrónico: " + correoElectronico + "\n\n");

        contrato.append("Firma del Administrador:\n\n");
        contrato.append("Juliana Chavez King\n");
        contrato.append("Cédula: 1084450416\n");
        contrato.append("Representante Legal del Supermercado COSTAKING\n\n");

        // Crear una instancia de la clase FileWriter para escribir el archivo
        FileWriter archivo = new FileWriter("C:\\Users\\julic\\Documents\\NetBeansProjects\\ProyectoSupermercadoCosteno\\ProveedoresCosteños.txt");
        BufferedWriter escribir = new BufferedWriter(archivo);

        // Escribir el contrato en el archivo
        escribir.write(contrato.toString());
        escribir.close();
        
        // Imprimir el contrato
        System.out.println(contrato.toString());
  
    }
}
