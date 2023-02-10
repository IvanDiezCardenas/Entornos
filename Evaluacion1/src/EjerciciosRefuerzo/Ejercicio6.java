package EjerciciosRefuerzo;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero entre el 0-100: ");
		int numero = sc.nextInt();
	if (numero<100 && numero%5==0) {
		System.out.println("Es multiplo");
	}
	else if (numero>100) {
		System.out.println("Introduce un numero: ");
		int numero2 = sc.nextInt();
		System.out.println("Es multiplo");
	}
	else {
		System.out.println("No son multiplos");
	}

	}

}
