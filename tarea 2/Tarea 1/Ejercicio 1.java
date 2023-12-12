package ejercicios1ed;

import java.util.Scanner;

public class punto1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		float d,v,t;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce una distancia a recorrer");
		d = teclado.nextInt();
		
		System.out.println("Introduce una valocidad para el recorrido");
		v = teclado.nextInt();
		
		t = d/v;
		
		System.out.println("Tardaremos " + t + " horas  en recorrerla");
		
	}

}
