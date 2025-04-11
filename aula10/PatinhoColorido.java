package aula10;

import java.util.Scanner;

public class PatinhoColorido {
	public static void main(String[] args) {
		int par = 0, impar = 0;
		Scanner ler = new Scanner(System.in);
		for (int i = 1; i < 10; i++) {
			System.out.println("Informe um número para descobrir se é par ou ímpar: ");
			int numero;
			numero = ler.nextInt();
			if (numero % 2 == 0) {
				par++;
			} else {
				impar++;
			}
		}
		System.out.println("Ímpares: " + impar + " Número pares: " + par);
		if (impar > par) {
			System.out.println("Os números ímpares ganharam!");
		} else if (impar == par) {
			System.out.println("Deu empate!");
		} else {
			System.out.println("Os números pares ganharam!");
		}
		ler.close();
	}
}
