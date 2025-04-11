package Desafios03;

import java.util.Scanner;

public class DevVida {
	public static void main(String[] args) {
		double media, nota1, nota2, nota3, nota4;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Informe o valor da primeira nota do aluno: ");
		nota1 = ler.nextDouble();
		System.out.println("Informe o valor da segunda nota do aluno: ");
		nota2 = ler.nextDouble();
		System.out.println("Informe o valor da terceira nota do aluno: ");
		nota3 = ler.nextDouble();
		System.out.println("Informe o valor da quarta nota do aluno: ");
		nota4 = ler.nextDouble();
		ler.close();
		
		media = ((nota1+nota2+nota3+nota4)/4);
		
		if (media >= 6) {
		System.out.println("Parabéns, o aluno está aprovado! Nota Final: " + media);
		}
		else {
		System.out.println("O aluno está reprovado! Nota Final" + media);
		}
	}

}
