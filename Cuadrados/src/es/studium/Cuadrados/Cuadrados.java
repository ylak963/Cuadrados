package es.studium.Cuadrados;

import java.util.Scanner;

public class Cuadrados {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("La suma de los 100 primeros números naturales es:"+" "+funCuadrados());
		teclado.close();
	}

	private static int funCuadrados() {
		
		int resultado = 0, i;
		for(i=0; i<=99; i++) {
			resultado=resultado+(i*i);
		}
		return resultado;
	}

}
