package aula09;

import java.util.Scanner;

public class NotaAluno {
	public static void main(String[] args) {
		double nota1, nota2, nota3, nota4, media;
	
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe o valor da nota 1: ");
		nota1 = ler.nextDouble();
				
		System.out.println("Informe o valor da nota 2: ");
		nota2 = ler.nextDouble();
		
		System.out.println("Informe o valor da nota 3: ");
		nota3 = ler.nextDouble();
		
		System.out.println("Informe o valor da nota 4 : ");
		nota4 = ler.nextDouble();
		
		media = (nota1+nota2+nota3+nota4)/4;
		
		String mensagem = media >= 6 ? "Aprovado!" : "Reprovado!";
		System.out.println(mensagem);
		ler.close();
		
		
	}

}
