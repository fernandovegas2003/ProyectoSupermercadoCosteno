package com.mycompany.proyectosupermercadocosteno.co.edu.upb.proyectoanalisisdesistemas;

import java.util.ArrayList;

public class Inventario {
	public ArrayList <Producto> alimentos;
	public ArrayList <Producto> electrodomesticos;
	public ArrayList <Producto> limpiezaEHigiene;
	public ArrayList <Producto> ferreteria;
	public ArrayList <Producto> decoracionYHogar;
	public ArrayList <Producto> jugueteria;
	public ArrayList <Producto> tecnologia;
	public ArrayList <Producto> ropaYAccesorios;
	public ArrayList <Producto> librosYPapeleria;
	public ArrayList <Producto> mascotas;
	public ArrayList <Producto> saludYMedicamentos;
	
	public Inventario() {
		alimentos= new ArrayList<Producto>();
		electrodomesticos= new ArrayList<Producto>();
		limpiezaEHigiene= new ArrayList<Producto>();
		ferreteria = new ArrayList<Producto>();
		decoracionYHogar = new ArrayList<Producto>();
		jugueteria = new ArrayList<Producto>();
		tecnologia= new ArrayList<Producto>();
		ropaYAccesorios= new ArrayList<Producto>();
		librosYPapeleria= new ArrayList<Producto>();
		mascotas= new ArrayList<Producto>();
		saludYMedicamentos= new ArrayList<Producto>();
	}
	public ArrayList<Producto> getAlimentos(){
		return alimentos;
	}
	
	public ArrayList<Producto> getElectrodomesticos() {
		return electrodomesticos;
	}

	public ArrayList<Producto> getLimpiezaEHigiene() {
		return limpiezaEHigiene;
	}

	public ArrayList<Producto> getFerreteria() {
		return ferreteria;
	}

	public ArrayList<Producto> getDecoracionYHogar() {
		return decoracionYHogar;
	}

	public ArrayList<Producto> getJugueteria() {
		return jugueteria;
	}
	
	public ArrayList<Producto> getTecnologia() {
		return tecnologia;
	}
	
	public ArrayList<Producto> getRopaYAccesorios() {
		return ropaYAccesorios;
	}
	
	public ArrayList<Producto> getLibrosYPapeleria() {
		return librosYPapeleria;
	}
	
	public ArrayList<Producto> getMascotas() {
		return mascotas;
	}
	
	public ArrayList<Producto> getSaludYMedicamentos() {
		return saludYMedicamentos;
	}
	
	public void agregarProductoAlimentos(Producto producto) {
		alimentos.add(producto);
	}
	
	public void removerProductoAlimentos(Producto producto) {
		alimentos.remove(producto);
	}

	public void agregarProductoElectrodomesticos(Producto producto) {
        electrodomesticos.add(producto);
    }
	public void removerProductoElectrodomesticos(Producto producto) {
	    electrodomesticos.remove(producto);
	}
	
	public void agregarProductoLimpieza(Producto producto) {
		limpiezaEHigiene.add(producto);
    }
	public void removerProductoLimpieza(Producto producto) {
		limpiezaEHigiene.remove(producto);
    }
	
	public void agregarProductoFerreteria(Producto producto) {
        ferreteria.add(producto);
    }
	public void removerProductoFerreteria(Producto producto) {
        ferreteria.remove(producto);
    }
	
	public void agregarProductoHogar(Producto producto) {
		decoracionYHogar.add(producto);
    }
	public void removerProductoDecoracion(Producto producto) {
		decoracionYHogar.remove(producto);
    }
	
	public void agregarProductoJugueteria(Producto producto) {
        jugueteria.add(producto);
    }
	public void removerProductoJugueteria(Producto producto) {
        jugueteria.remove(producto);
    }
	
	public void agregarProductoLibrosYPapeleria(Producto producto) {
		librosYPapeleria.add(producto);
	}
	
	public void removerProductoLibrosYPapeleria(Producto producto) {
		librosYPapeleria.remove(producto);
	}
	
	public void agregarProductoRopaYAccesorios(Producto producto) {
		ropaYAccesorios.add(producto);
	}
	
	public void removerProductoRopaYAccesorios(Producto producto) {
		ropaYAccesorios.remove(producto);
	}
	
	public void agregarProductoMascotas(Producto producto) {
		mascotas.add(producto);
	}
	
	public void removerProductoMascotas(Producto producto) {
		mascotas.remove(producto);
	}
	
	public void agregarProductoTecnologia(Producto producto) {
		tecnologia.add(producto);
	}
	
	public void removerProductoTecnologia(Producto producto) {
		tecnologia.remove(producto);
	}
	
	public void agregarProductoSaludYMedicamentos(Producto producto) {
		saludYMedicamentos.add(producto);
	}
	
	public void removerProductoSaludYMedicamentos(Producto producto) {
		saludYMedicamentos.remove(producto);
	}
	
	public Producto buscarProducto(String nombre) {
		for (Producto producto : alimentos) {
		       if (producto.getNombre().equals(nombre) && producto.getCantidadDisponible() > 0) {
		           return producto;
		       }
	    }
	    for (Producto producto : electrodomesticos) {
	        if (producto.getNombre().equals(nombre) && producto.getCantidadDisponible() > 0) {
	            return producto;
	        }
	    }
	    for (Producto producto : limpiezaEHigiene) {
	        if (producto.getNombre().equals(nombre) && producto.getCantidadDisponible() > 0) {
	            return producto;
	        }
	    }
	    for (Producto producto : ferreteria) {
	        if (producto.getNombre().equals(nombre) && producto.getCantidadDisponible() > 0) {
	            return producto;
	        }
	    }
	    for (Producto producto : decoracionYHogar) {
	        if (producto.getNombre().equals(nombre) && producto.getCantidadDisponible() > 0) {
	            return producto;
	        }
	    }
	    for (Producto producto : jugueteria) {
	        if (producto.getNombre().equals(nombre) && producto.getCantidadDisponible() > 0) {
	            return producto;
	        }
	    }
	    for (Producto producto : tecnologia) {
	        if (producto.getNombre().equals(nombre) && producto.getCantidadDisponible() > 0) {
	            return producto;
	        }
	    }
	    for (Producto producto : ropaYAccesorios) {
	        if (producto.getNombre().equals(nombre) && producto.getCantidadDisponible() > 0) {
	            return producto;
	        }
	    }
	    for (Producto producto : librosYPapeleria) {
	        if (producto.getNombre().equals(nombre) && producto.getCantidadDisponible() > 0) {
	            return producto;
	        }
	    }
	    for (Producto producto : mascotas) {
	        if (producto.getNombre().equals(nombre) && producto.getCantidadDisponible() > 0) {
	            return producto;
	        }
	    }
	    for (Producto producto : saludYMedicamentos) {
	        if (producto.getNombre().equals(nombre) && producto.getCantidadDisponible() > 0) {
	            return producto;
	        }
	    }
     return null;
	 }
	
	public void actualizarInventario(Carrito carrito) {
		for (Producto producto : carrito.getProductos()) {
	        Producto productoEnInventario = buscarProducto(producto.getNombre());
	        if (productoEnInventario != null) {
	            productoEnInventario.restarCantidad(producto.getCantidadDisponible());
	        }
	    }
	    System.out.println("El inventario se ha actualizado correctamente.");
	}
}