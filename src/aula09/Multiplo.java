package aula09;

import java.util.Scanner;

public class Multiplo {
	public static void main(String[] args) {
		double a; 
		Scanner ler = new Scanner(System.in);
		System.out.println("Informe o valor: ");
		a = ler.nextDouble();
		
		String mensagem = a % 5 == 0 ? "O número " + a + " é múltiplo de cinco." : "O número " + a + " não é múltiplo de 5";
		System.out.println(mensagem);
		ler.close();
	}
}
