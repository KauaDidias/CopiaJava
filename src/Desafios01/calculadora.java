package Desafios01;

import java.util.Scanner;

public class calculadora {
	public static void main(String[] args) {
		//DEFINIÇÃO DAS VARIÁVEIS
		double nota1, nota2, nota3, nota4, media;

	//ENTRADA DE DADOS
		Scanner ler = new Scanner (System.in);
		System.out.println("Informe a nota 1:");
		nota1 = ler.nextDouble();
		
		System.out.println("Informe a nota 2");
		nota2 = ler.nextDouble();
		
		System.out.println("Informe a nota 3:");
		nota3 = ler.nextDouble();
		
		System.out.println("Informe a nota 4");
		nota4 = ler.nextDouble();
		ler.close();

		//PROCESSAMENTO
		media = (nota1 + nota2+ nota3+ nota4)/4;
		
		//SAÍDA
		System.out.println ("O valor da média é:" + media);		
		if (media < 7) {
			System.out.println("APROVADO");
		}
	}
}
