package aula09;

import java.util.Scanner;

public class UsoTernario02 {
	public static void main(String[] args) {
		int numero1, numero2;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Informe o primeiro valor: ");
		numero1 = ler.nextInt();
		System.out.println("Informe o segundo valor: ");
		numero2 = ler.nextInt();
		
		String mensagem = numero1 >= numero2 ? "O primeiro número é maior ou igual." : "O primeiro número é menor.";
		System.out.println(mensagem);
		ler.close();
		
	}

}
