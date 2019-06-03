package com.br.zup.media.pares;

import java.util.Scanner;

public class AppMedia {

	public static void main(String[] args) {
		
		Scanner scan = entrada();
		System.out.println("Digite um numero para o calculo");
		scan.nextInt();
		

	}
	
	public static Scanner entrada() {
		Scanner scan = new Scanner(System.in);
		return scan;
	}
	
	public static void calculaMedia(int divisor, int total) {
		System.out.println("Media entre os numeros pares -> "+total/ divisor);
	}

}
