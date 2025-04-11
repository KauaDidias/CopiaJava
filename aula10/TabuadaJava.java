package aula10;

import java.util.Scanner;

public class TabuadaJava {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n;
	System.out.println("Informe o valor do número que deseja descobrir a tabuada: ");
	n = ler.nextInt();
	
	System.out.println("O valor da tabuada de " + n + " é igual a: ");
	for (int i = 0; i < 10; i++) {
		System.out.println(n + "x" + i + " = " + (n*i));
		ler.close();
								 }
	}
}

