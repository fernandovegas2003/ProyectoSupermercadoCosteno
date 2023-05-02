package com.mycompany.proyectosupermercadocosteno.co.edu.upb.proyectoanalisisdesistemas;

import java.util.ArrayList;

public class Inventario {
	public ArrayList <Producto> alimentos= new ArrayList<Producto>();;
	public ArrayList <Producto> electrodomesticos= new ArrayList<Producto>();;
	public ArrayList <Producto> limpiezaEHigiene= new ArrayList<Producto>();;
	public ArrayList <Producto> ferreteria= new ArrayList<Producto>();;
	public ArrayList <Producto> decoracionYHogar= new ArrayList<Producto>();;
	public ArrayList <Producto> jugueteria= new ArrayList<Producto>();;
	public ArrayList <Producto> tecnologia= new ArrayList<Producto>();;
	public ArrayList <Producto> ropaYAccesorios= new ArrayList<Producto>();;
	public ArrayList <Producto> librosYPapeleria= new ArrayList<Producto>();;
	public ArrayList <Producto> mascotas= new ArrayList<Producto>();;
	public ArrayList <Producto> saludYMedicamentos= new ArrayList<Producto>();;
	
	public Inventario() {
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
		} for (Producto producto : electrodomesticos) {
	        if (producto.getNombre().equals(nombre) && producto.getCantidadDisponible() > 0) {
	            return producto;
	        }
	    }  for (Producto producto : limpiezaEHigiene) {
	        if (producto.getNombre().equals(nombre) && producto.getCantidadDisponible() > 0) {
	            return producto;
	        }
	    }for (Producto producto : ferreteria) {
	        if (producto.getNombre().equals(nombre) && producto.getCantidadDisponible() > 0) {
	            return producto;
	        }
	    }for (Producto producto : decoracionYHogar) {
	        if (producto.getNombre().equals(nombre) && producto.getCantidadDisponible() > 0) {
	            return producto;
	        }
	    }for (Producto producto : jugueteria) {
	        if (producto.getNombre().equals(nombre) && producto.getCantidadDisponible() > 0) {
	            return producto;
	        }
	    }for (Producto producto : tecnologia) {
	        if (producto.getNombre().equals(nombre) && producto.getCantidadDisponible() > 0) {
	            return producto;
	        }
	    }for (Producto producto : ropaYAccesorios) {
	        if (producto.getNombre().equals(nombre) && producto.getCantidadDisponible() > 0) {
	            return producto;
	        }
	    }for (Producto producto : librosYPapeleria) {
	        if (producto.getNombre().equals(nombre) && producto.getCantidadDisponible() > 0) {
	            return producto;
	        }
	    } for (Producto producto : mascotas) {
	        if (producto.getNombre().equals(nombre) && producto.getCantidadDisponible() > 0) {
	            return producto;
	        }
	    }for (Producto producto : saludYMedicamentos) {
	        if (producto.getNombre().equals(nombre) && producto.getCantidadDisponible() > 0) {
	            return producto;
	        }
	    } return null;
	 }
	
	public void actualizarInventario(Carrito carrito) {
		for (Producto producto : carrito.getProductos()) {
	        Producto productoEnInventario = buscarProducto(producto.getNombre());
	        if (productoEnInventario != null) {
	            productoEnInventario.restarCantidad(producto.getCantidadDisponible());
	        }
	    }System.out.println("El inventario se ha actualizado correctamente.");
	}
        
	public void inicializarInventario() {
	    agregarProductoAlimentos(new Producto("Leche Alqueria", "Aporta una gran cantidad de vitaminas y prebióticos ideales para el cuidado de tu familia.", 7.550, 500));
	    agregarProductoAlimentos(new Producto("Mantequilla Rama", "Deliciosa para untar en el pan o para cocinar. Envase de 500 gramos.", 5.390, 500));
	    agregarProductoAlimentos(new Producto("Yuca Costeña", "Alimento típico de la costa colombiana y es perfecta para acompañar cualquier comida. Presentación de 300 gramos.", 12.350, 300));
	    agregarProductoAlimentos(new Producto("Mango Costeño", "Fruta deliciosa y jugosa que se puede comer como postre o para refrescarse en un día caluroso. Presentación de 1 kg.", 6.140, 1000));
	    agregarProductoAlimentos(new Producto("Mojarra", "Pescado ideal para preparar en la parrilla o frito. Presentación de 1 kg.", 10.200, 1000));
	    agregarProductoAlimentos(new Producto("Camarones", "Se puede utilizar en diferentes platos, como ensaladas, arroces o cócteles. Presentación de 1 kg.", 15.500, 1000));
	    agregarProductoAlimentos(new Producto("Guineo Verde", "Fruta rica en potasio y fibra, ideal para preparar platos salados. Presentación de 1 kg.", 1.590, 1000));
	    agregarProductoAlimentos(new Producto("Arroz Diana", "Marca reconocida por su calidad. Presentación de 250 gramos.", 3.000, 250));
	    agregarProductoAlimentos(new Producto("Harina Robinson", "Harina de trigo para preparar diferentes tipos de panes, tortas o galletas. Presentación de 350 gramos.", 2.590, 350));
	    agregarProductoAlimentos(new Producto("Cafe Juan Valdez", "Marca reconocida por su sabor y aroma. Presentación de 255 gramos.", 4.790, 255));
	    agregarProductoAlimentos(new Producto("Queso Costeño", "Queso típico de la región caribeña de Colombia, ideal para preparar platos como arepas, empanadas o simplemente para untar en el pan. Presentación de 250 gramos.", 10.000, 250));
	    
	    agregarProductoElectrodomesticos(new Producto("Televisor LG", "Modelo de alta calidad y tecnología, ideal para disfrutar de películas, series o deportes en la comodidad del hogar. Presentación de 200 pulgadas.", 2000.000, 200));
        agregarProductoElectrodomesticos(new Producto("Refrigeradora Samsung", "Refrigeradora de alta calidad fabricada por la marca Samsung. Capacidad de 220 litros.", 2500.000, 220));
        agregarProductoElectrodomesticos(new Producto("Horno Oster", "Horno de la marca Oster con capacidad de 290 litros y cuenta con múltiples funciones de cocción, como hornear, asar, tostar y gratinar.", 1650.000, 290));
        agregarProductoElectrodomesticos(new Producto("Cafetera Oster", "Perfecta para preparar café en casa de manera fácil y rápida. Cuenta con una capacidad de 400 ml y una potencia de 800 W.", 342.000, 400));
        agregarProductoElectrodomesticos(new Producto("Licuadora Oster", "Perfecta para preparar batidos y smoothies. Cuenta con una potencia de 340 W y una capacidad de 1.25 litros.", 43.000, 340));
        agregarProductoElectrodomesticos(new Producto("Aspiradora Electroluz", "Ideal para mantener la casa limpia y libre de polvo y suciedad. Tiene una potencia de 2200 W y una capacidad de 2 litros.", 285.000, 220));
        agregarProductoElectrodomesticos(new Producto("Estufa Romero", "Perfecta para cocinar deliciosos platillos. Presenta cuatro quemadores y un horno. Además, su diseño moderno y elegante la hace perfecta para cualquier cocina.", 780.000, 300));
        agregarProductoElectrodomesticos(new Producto("Nevera Samsung", "Perfecta para familias grandes y cuenta con características avanzadas como una pantalla táctil y una excelente eficiencia energética. Capacidad de 490 litros.", 3160.000, 490));
        agregarProductoElectrodomesticos(new Producto("Lavadora LG", "Perfecta para lavar la ropa en casa. Cuenta con una capacidad de 400 litros y una gran cantidad de funciones y programas de lavado.", 1500.000, 400));
        agregarProductoElectrodomesticos(new Producto("Planchas Remington", "Perfectas para dejar la ropa impecable. Cuentan con múltiples características, como una base de cerámica y una función de vapor.", 260.000, 570));
        
        agregarProductoLimpieza(new Producto("Detergente Ariel", "Perfecto para lavar la ropa en casa. Muy eficaz para eliminar manchas y suciedad.", 23.000, 300));
        agregarProductoLimpieza(new Producto("Jabon Johnson", "Perfecto para el cuidado personal y cuenta con una fragancia suave y agradable.", 2.000, 500));
        agregarProductoLimpieza(new Producto("Esponja", "Perfecta para limpiar la casa y eliminar la suciedad. Es muy duradera y resistente.", 1.600, 600));
        agregarProductoLimpieza(new Producto("Blancox", "Perfecto para mantener la casa libre de gérmenes y bacterias.", 18.500, 340));
        agregarProductoLimpieza(new Producto("Rexona", "Producto de cuidado personal que ayuda a controlar el olor corporal durante todo el día. Su fórmula está diseñada para ser suave con la piel y proporcionar una fragancia fresca y agradable.", 9.000, 450));
        agregarProductoLimpieza(new Producto("Toallas", "Toallas de alta calidad, suaves y absorbentes, ideales para su uso en el hogar o en la industria hotelera.", 12.000, 320));
        agregarProductoLimpieza(new Producto("Colgate", "Pasta de dientes de uso diario que ayuda a proteger los dientes contra las caries y el sarro. Su fórmula contiene flúor para fortalecer los dientes y dejar una sensación de limpieza y frescura en la boca.", 3.500, 500));
        agregarProductoLimpieza(new Producto("Guantes Latex", "Guantes de látex resistentes y cómodos que ofrecen protección contra el contacto con sustancias peligrosas, tales como productos químicos y ácidos.", 6.300, 720));
        agregarProductoLimpieza(new Producto("Trapeador Clarita", "Trapeador de alta calidad, fabricado con materiales duraderos y resistentes. Su diseño está pensado para hacer más fácil la tarea de limpieza en el hogar o en la industria.", 13.500, 320));
        agregarProductoLimpieza(new Producto("Escoba Clarita", "Escoba resistente y duradera que ofrece una limpieza eficiente en cualquier superficie. Su diseño ergonómico la hace cómoda de usar y su construcción en materiales de alta calidad garantiza su durabilidad.", 13.300, 220));
        
        agregarProductoFerreteria(new Producto("Atornillador Universal","Herramienta eléctrica para atornillar y desatornillar con facilidad. Su diseño ergonómico lo hace cómodo de usar y su motor potente garantiza la eficiencia en el trabajo.", 10.000, 400));
        agregarProductoFerreteria(new Producto("Martillo MaderaMax","Martillo de acero resistente con mango de madera de nogal para ofrecer una larga durabilidad y un agarre cómodo.", 34.000, 430));
        agregarProductoFerreteria(new Producto("Alicate Universal","Tienen la boca cuadrada, ligeramente estriada en su interior y con los brazos algo encorvados que sirven para doblar alambre, sujetar pequeñas piezas, etc.", 23.500, 230));
        agregarProductoFerreteria(new Producto("Llave Inglesa","Herramienta manual utilizada para apretar y aflojar tuercas y tornillos con cabeza hexagonal. Diseñada para ajustarse a diferentes tamaños de cabeza hexagonal.", 11.000, 320));
        agregarProductoFerreteria(new Producto("Serrucho Costeño","Herramienta de corte manual que se utiliza para cortar madera. Tiene una hoja larga y delgada con dientes afilados que cortan la madera con facilidad.", 25.500, 450));
        agregarProductoFerreteria(new Producto("Broca Max","Herramienta rotativa que se utiliza para hacer agujeros en diferentes materiales como madera, metal o plástico. Esta broca tiene un diseño especial que permite perforar materiales duros con facilidad.", 54.000, 320));
        agregarProductoFerreteria(new Producto("Tornillo","Tornillo funcional de 10 mm", 8.500, 280));
        agregarProductoFerreteria(new Producto("Demoledores Broken10","Herramienta eléctrica utilizada para romper y demoler diferentes materiales como concreto, ladrillo y piedra. Esta herramienta es ideal para trabajos de construcción y demolición.", 43.000, 620));
        agregarProductoFerreteria(new Producto("Bombillo Fulligth","Bombilla LED de alta eficiencia energética que se utiliza como fuente de luz en hogares y oficinas. Tiene una larga vida útil y un bajo consumo de energía.", 7.300, 290));
        agregarProductoFerreteria(new Producto("Taladro Xmax","Herramienta eléctrica rotativa que se utiliza para hacer agujeros en diferentes materiales como madera, metal o plástico. Este taladro tiene una alta potencia y está diseñado para trabajos exigentes.", 66.000, 645));
		
        agregarProductoFerreteria(new Producto("Atornillador Universal","Herramienta eléctrica para atornillar y desatornillar con facilidad. Su diseño ergonómico lo hace cómodo de usar y su motor potente garantiza la eficiencia en el trabajo.", 10.000, 400));
        agregarProductoHogar(new Producto("Escritorio Plus","Escritorio es de tamaño estándar y está hecho de materiales de alta calidad para garantizar su durabilidad y resistencia.",240.000,320));
        agregarProductoHogar(new Producto("Silla Plus","Silla de plástico resistente y cómoda, ideal para cualquier ocasión, desde reuniones familiares hasta eventos empresariales.",70.500,132));
        agregarProductoHogar(new Producto("Comedor Plus","Conjunto de mesa y sillas de madera resistente, ideal para comidas en familia y cenas elegantes.",340.000,528));
        agregarProductoHogar(new Producto("Armario Plus"," Armario de almacenamiento espacioso y resistente, perfecto para guardar ropa y objetos personales.",700.000,863));
        agregarProductoHogar(new Producto("Sofas Plus","Juego de sofás cómodos y elegantes, ideales para salas de estar y espacios de entretenimiento en el hogar.",300.000,290));
        agregarProductoHogar(new Producto("Repisas Plus","Repisas de madera resistentes y decorativas, ideales para mostrar libros, fotos y otros objetos personales.",205.000,650));
        agregarProductoHogar(new Producto("Organizadores Plus","Juego de organizadores de plástico resistentes y duraderos, ideales para guardar y organizar artículos de limpieza y otros productos del hogar.",170.000,450));
        agregarProductoHogar(new Producto("Muebles Plus","Conjunto de muebles resistentes y elegantes, que incluye sofás, sillas, mesas y otros elementos decorativos para el hogar.",900.000,234));
        agregarProductoHogar(new Producto("Alfombras Plus","Alfombras suaves y cómodas, ideales para añadir un toque de estilo y calidez a cualquier habitación.",200.000,600));
        agregarProductoHogar(new Producto("Pinturas Plus","Pinturas de alta calidad en una amplia gama de colores y acabados, ideales para proyectos de decoración y renovación del hogar.",30.000,1000));
		
        agregarProductoJugueteria(new Producto("Hot Wheels","Un juguete de carreras en miniatura con un diseño único y detallado, perfecto para los amantes de los coches.",7.300,830));
        agregarProductoJugueteria(new Producto("Pelota Molten","Una pelota de alta calidad diseñada para deportes como el baloncesto o el voleibol, con un acabado suave y resistente.",56.000,920));
        agregarProductoJugueteria(new Producto("Patines Rollerblade","Unos patines en línea de alta gama diseñados para patinadores experimentados, con características como ruedas de alto rendimiento y un sistema de cierre seguro.",270.000,1000));
        agregarProductoJugueteria(new Producto("Barbie","Una muñeca icónica que ha sido un juguete favorito durante décadas, con una amplia variedad de atuendos y accesorios para elegir.",78.000,780));
        agregarProductoJugueteria(new Producto("Peluche Jellycat","Un suave y adorable peluche con una amplia variedad de animales y personajes para elegir, perfecto para los más pequeños.",25.000,400));
        agregarProductoJugueteria(new Producto("Uno Mattel","Un juego de cartas clásico y divertido que ha sido un éxito entre amigos y familiares durante décadas.",5.000,1500));
        agregarProductoJugueteria(new Producto("Ajedrez The House of Staunton","Un juego de ajedrez de alta calidad con un diseño elegante y sofisticado, perfecto para los amantes del ajedrez.",75.000,600));
        agregarProductoJugueteria(new Producto("Rompecabezas BuffaloGames","Un rompecabezas desafiante y gratificante con una amplia variedad de imágenes y niveles de dificultad.",105.000,540));
        agregarProductoJugueteria(new Producto("Domino Cardinal","Un juego clásico de dominó que es fácil de aprender y jugar para todas las edades.",18.000,340));
        agregarProductoJugueteria(new Producto("Bloques ConstrucciónX","Un conjunto de bloques de construcción duraderos y versátiles que permiten a los niños construir una amplia variedad de estructuras y formas.",13.500,660));
		
        agregarProductoTecnologia(new Producto("Xiaomi RedmiNote", "Un teléfono inteligente de alta calidad y gran rendimiento de la marca Xiaomi.", 980.000, 700));
        agregarProductoTecnologia(new Producto("Ipad Apple", "Una tableta de la marca Apple con gran capacidad de almacenamiento y excelente calidad de pantalla.", 2560.000, 450));
        agregarProductoTecnologia(new Producto("Portatil ASUS", "Un computador portátil de la marca ASUS, de alta gama y gran rendimiento.", 4900.000, 890));
        agregarProductoTecnologia(new Producto("Nintendo Switch", "Una consola de videojuegos portátil y versátil, de la marca Nintendo.", 5200.000, 780));
        agregarProductoTecnologia(new Producto("Audifonos Sennheiser", "Unos audífonos de alta calidad de la marca Sennheiser, con gran sonido y comodidad.", 35.000, 760));
        agregarProductoTecnologia(new Producto("Proyector Optoma", "Un proyector de alta definición de la marca Optoma, ideal para presentaciones o ver películas en casa.", 455.000, 450));
        agregarProductoTecnologia(new Producto("Impresora Lexmark", "Una impresora de alta calidad de la marca Lexmark, ideal para uso doméstico o en pequeñas empresas.", 650.000, 660));
        agregarProductoTecnologia(new Producto("Cargador Anker", "Un cargador portátil de la marca Anker, ideal para cargar dispositivos móviles en cualquier lugar.", 200.000, 540));
        agregarProductoTecnologia(new Producto("Mouse Logitech", "Un ratón de la marca Logitech, de alta precisión y comodidad.", 78.000, 300));
        agregarProductoTecnologia(new Producto("Computador de Escritorio Dell", "Un computador de escritorio de alta calidad de la marca Dell, con gran capacidad de procesamiento y almacenamiento.", 3000.000, 500));
		
        agregarProductoRopaYAccesorios(new Producto("Pijamas Totto","Unas pijamas de la marca Totto, cómodas y suaves al tacto.",45.000,320));
        agregarProductoRopaYAccesorios(new Producto("Camisa Adiddas","Una camisa deportiva de la marca Adidas, ideal para hacer ejercicio o para uso diario.",200.000,330));
        agregarProductoRopaYAccesorios(new Producto("Pantalon ClassicJeans","Un pantalón clásico de la marca Jeans, ideal para uso diario o para ocasiones formales.",109.000,440));
        agregarProductoRopaYAccesorios(new Producto("Chaqueta Yoyo","Una chaqueta de la marca Yoyo, elegante y de alta calidad.",200.000,660));
        agregarProductoRopaYAccesorios(new Producto("Collar Yanbal","Un collar elegante de la marca Yanbal, ideal para ocasiones especiales.",180.000,770));
        agregarProductoRopaYAccesorios(new Producto("Aretes Yanbal","Unos aretes elegantes de la marca Yanbal, ideales para ocasiones especiales.",155.000,800));
        agregarProductoRopaYAccesorios(new Producto("Zapatos Sketchers","Unos zapatos cómodos y de alta calidad de la marca Sketchers, ideales para hacer deporte o para uso diario.",340.000,900));
        agregarProductoRopaYAccesorios(new Producto("Gafas Gucci","Unas gafas de sol elegantes y de alta calidad de la marca Gucci.",500.000,660));
        agregarProductoRopaYAccesorios(new Producto("Calcetines Norma","Unos calcetines de alta calidad de la marca Norma, cómodos y suaves al tacto.",10.000,550));
        agregarProductoRopaYAccesorios(new Producto("Sandalias Puma","Unas sandalias deportivas y cómodas de la marca Puma, ideales para hacer deporte o para uso diario.",90.000,550));
		
        agregarProductoLibrosYPapeleria(new Producto("Revista El Mes", "Una revista mensual con temas de actualidad, noticias y entretenimiento.", 12.500, 600));
        agregarProductoLibrosYPapeleria(new Producto("Boligrafo PaperMate", "Un bolígrafo de alta calidad de la marca Paper Mate, con tinta duradera y suave al escribir.", 3.000, 700));
        agregarProductoLibrosYPapeleria(new Producto("Cuaderno Staple", "Un cuaderno de alta calidad de la marca Staples, ideal para tomar apuntes o escribir.", 16.000, 800));
        agregarProductoLibrosYPapeleria(new Producto("Sharpie", "Unos marcadores de alta calidad de la marca Sharpie, ideales para escribir o dibujar con precisión.", 7.800, 900));
        agregarProductoLibrosYPapeleria(new Producto("Blocks Postit", "Unos blocks de notas adhesivas de la marca Post-it, ideales para tomar notas y recordatorios.", 8.000, 500));
        agregarProductoLibrosYPapeleria(new Producto("Pinturas Liquitex", "Unas pinturas de alta calidad de la marca Liquitex, ideales para crear arte y dibujos.", 2.300, 560));
        agregarProductoLibrosYPapeleria(new Producto("Marvel Comics", "Una colección de cómics de la famosa editorial Marvel, que incluye historias de superhéroes como Spider-Man, Iron Man, Capitán América y muchos más.", 12.000, 760));
        agregarProductoLibrosYPapeleria(new Producto("Carpetas Avery", "Un conjunto de carpetas de alta calidad para archivar documentos y organizar el espacio de trabajo.", 3.400, 870));
        agregarProductoLibrosYPapeleria(new Producto("Reglas Staedtler", "Reglas de medición de precisión hechas por la marca Staedtler, ideales para uso en dibujo técnico o diseño gráfico.", 2.000, 340));
        agregarProductoLibrosYPapeleria(new Producto("Colores Prismacolor", "Juego de lápices de colores Prismacolor de alta calidad, ideales para ilustración y dibujo artístico.", 56.000, 660));
		
        agregarProductoMascotas(new Producto("Antipulgas Frontline", "Un tratamiento para la eliminación de pulgas y garrapatas en perros y gatos.", 70.000, 240));
        agregarProductoMascotas(new Producto("Arenas TidyCats", "Arena para gatos de la marca Tidy Cats, con excelente capacidad de absorción de olores y fácil de limpiar.", 80.000, 450));
        agregarProductoMascotas(new Producto("Collares Adams", "Collares para perros hechos por la marca Adams, disponibles en varios tamaños y estilos.", 36.000, 560));
        agregarProductoMascotas(new Producto("Correas Mendota", "Correas para perros fabricadas por la marca Mendota, hechas de materiales duraderos y resistentes.", 35.000, 570));
        agregarProductoMascotas(new Producto("Shampoo Adams", "Shampoo para perros hecho por la marca Adams, con fórmulas especiales para diferentes tipos de pelaje y necesidades.", 40.000, 670));
        agregarProductoMascotas(new Producto("Juguetes KONG", "Juguetes para perros hechos de goma resistente, diseñados para estimular la masticación y el juego.", 23.000, 780));
        agregarProductoMascotas(new Producto("Comida de Perros Purina", "Comida para perros de la marca Purina, con diferentes variedades y fórmulas para cubrir las necesidades nutricionales de los perros.", 54.000, 900));
        agregarProductoMascotas(new Producto("Comida de Gatos BlueBuffalo", "Comida para gatos de la marca Blue Buffalo, con ingredientes de alta calidad y sin aditivos artificiales.", 58.000, 980));
        agregarProductoMascotas(new Producto("Bebederos PetSafe", "Bebederos automáticos para mascotas de la marca PetSafe, con diferentes capacidades y tamaños para cubrir las necesidades de cada animal.", 31.000, 430));
        agregarProductoMascotas(new Producto("Camas BarksBar", "Camas para perros de la marca BarksBar, con diseños cómodos y duraderos para ofrecer una buena noche de sueño a las mascotas.", 61.000, 500));
		
        agregarProductoSaludYMedicamentos(new Producto("Centrum Women", "un suplemento vitamínico diseñado específicamente para mujeres que ayuda a satisfacer las necesidades nutricionales diarias.", 70.000, 1000));
        agregarProductoSaludYMedicamentos(new Producto("Paracetamol", "Un analgésico y antipirético comúnmente utilizado para aliviar el dolor y reducir la fiebre.", 15.000, 1400));
        agregarProductoSaludYMedicamentos(new Producto("Dolex Forte", "Un medicamento analgésico que contiene acetaminofén y cafeína, utilizado para aliviar el dolor moderado a intenso.", 12.000, 990));
        agregarProductoSaludYMedicamentos(new Producto("Atorvastatina", "Un medicamento que se utiliza para reducir el colesterol y prevenir enfermedades cardiovasculares.", 17.000, 890));
        agregarProductoSaludYMedicamentos(new Producto("Desloratadina", "Un antihistamínico utilizado para aliviar los síntomas de alergias, como estornudos, picazón en los ojos y la nariz, y erupciones cutáneas.", 20.000, 980));
        agregarProductoSaludYMedicamentos(new Producto("Bicarbonato Sodio", "Un polvo blanco soluble en agua que se utiliza en muchas aplicaciones, como la limpieza, el horneado y como antiácido para tratar la acidez estomacal.", 7.000, 780));
        agregarProductoSaludYMedicamentos(new Producto("Clotrimazol", "Un medicamento antifúngico utilizado para tratar infecciones fúngicas en la piel, como la tiña inguinal y la candidiasis.", 35.000, 100));
        agregarProductoSaludYMedicamentos(new Producto("Oceira", "un medicamento utilizado para tratar la hipertensión arterial y la insuficiencia cardíaca.", 34.000, 450));
        agregarProductoSaludYMedicamentos(new Producto("Salbutamol", "Un broncodilatador utilizado para tratar el asma y otras enfermedades respiratorias.", 44.000, 780));
        agregarProductoSaludYMedicamentos(new Producto("Ramipril", "Un medicamento utilizado para tratar la hipertensión arterial y prevenir enfermedades cardiovasculares.", 11.000, 600));
	}

    public void restarCantidad(Carrito carrito) {

    }
}
