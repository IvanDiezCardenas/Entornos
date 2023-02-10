package EjerciciosRefuerzo;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero entre el 0-100: ");
		int numero = sc.nextInt();
		while (numero % 5 == 0) {
			System.out.println("Son multiplos");
			break;
		}
		if (numero > 100) {
			System.out.println("Introduce otro numero:");
			int numero1 = sc.nextInt();
		}

	}

}
