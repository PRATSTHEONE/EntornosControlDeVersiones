package practicasVarias;

import utilidades.teclado;

public class manipularCadenas {

	public static void main(String[] args) {
		

		String nombre = utilidades.teclado.leer_cadena2("Puede indicarme su nombre: ");
		
		System.out.println("Mi nombre es: " + nombre);
		
		System.out.println("Mi nombre tiene " + nombre.length() + " caracteres.");
		
		int posicion = teclado.leer_entero_error("Marque la posicion para mostrarle el caracter correspondiente " , 
												"No es un valor valido vuelva a introducir un valor valido", 0, nombre.length()  );
		
		
		System.out.println("La letra que se encuentra en la posicion " + posicion + " es la letra: " + nombre.charAt(posicion));
		
		System.out.println("La primera letra de mi nombre es: " + nombre.charAt(0));
		
		int ultima;
		
		ultima = nombre.length();
		
		System.out.println("La ultima letra de mi nombre es: " + nombre.charAt(ultima - 1));
		
		

	}

}
