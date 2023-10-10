package ejercicios1ed;

import java.util.Scanner;

public class punto3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1, n2, n3;
		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduce el primer numero");
		n1 = teclado.nextInt();
		System.out.println("Introduce el segundo numero");
		n2 = teclado.nextInt();
		System.out.println("Introduce el tercer numero");
		n3 = teclado.nextInt();

		if (n1 > n2) {
			// true
			if (n1 > n3) {
				// true
				System.out.println("El mayor es el numero " + n1);
			} else {
				// false
				System.out.println("El mayor es el numero " + n3);
			}

		} else {
				
			if (n2>n3)
			// false
			System.out.println("El mayor es el numero " + n2);
			
			else {
				// false
				System.out.println("El mayor es el numero " + n3);
			}
			
		}
	}

}
