package com.br.zup.media.pares;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppMedia {

	public static void main(String[] args) {

		Scanner scan = entrada();

		int total = 0;
		int controle = 1;

		List<Integer> numerosImpares = new ArrayList<Integer>();

		while (controle == 1) {
			System.out.println("Digite um numero para o calculo");
			int numero = scan.nextInt();

			if (numero == 0) {

				controle = 0;

			} else if (numero % 2 == 0) {
				total += numero;
			} else {
				numerosImpares.add(numero);
			}

		}

	}

	public static Scanner entrada() {
		Scanner scan = new Scanner(System.in);
		return scan;
	}

	public static void calculaMedia(int divisor, int total) {
		System.out.println("Media entre os numeros pares -> " + total / divisor);
	}

}
