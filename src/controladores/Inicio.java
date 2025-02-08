package controladores;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author jmormez
 * @date 02/02/2025
 * Puerta de entrada a mi aplicación
 */
public class Inicio {
	
	/**
	 * @author jmormez
	 * @date 08/02/2025
	 * Clase controladora de mi aplicación
	 */
	
	public static void main(String[] args) {
		 // Crear una lista de nombres de estudiantes
        List<String> estudiantes = new ArrayList<>();

        // Agregar nombres a la lista
        estudiantes.add("Ana");
        estudiantes.add("Juan");
        estudiantes.add("Pedro");
        estudiantes.add("Laura");
        estudiantes.add("Ana"); 

        // Imprimir la lista completa
        System.out.println("Lista inicial: " + estudiantes + "\n");

        System.out.println("Cambiar el nombre del tercer estudiante a Carlos");
        estudiantes.set(2, "Carlos");
        System.out.println(estudiantes + "\n");
        
        
        System.out.println("Eliminar el nombre \"Laura\" de la lista");
        estudiantes.remove("Laura");
        System.out.println(estudiantes + "\n");

        System.out.println("Comprobar si Ana está presente en la lista");
        if (estudiantes.contains("Ana")) {
            System.out.println("El nombre 'Ana' está presente en la lista." + "\n");
        } else {
            System.out.println("El nombre 'Ana' no está en la lista." + "\n");
        }

        // Ordenar la lista alfabéticamente
        Collections.sort(estudiantes);

        System.out.print("Lista ordenada alfabeticamente: ");
        System.out.println(estudiantes);

	}

}
