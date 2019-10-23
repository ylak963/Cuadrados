package es.studium.CuadradosPares;

public class CuadradosPares {

	public static void main(String[] args) {
		int i, resultado;
		
		for(i=1; i<=100; i++) {
			if(i%2==0) {
				resultado=calcularCuadrados(i);
				System.out.println(resultado);
			}
		}

	}

	private static int calcularCuadrados(int i) {
		
		return i*i;
	}

}
