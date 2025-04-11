package Desafios03;

import java.util.Scanner;

public class DiasSemana {
	public static void main(String[] args) {
		
		int NumeroDia;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o número da semana (1-7): ");
		NumeroDia = ler.nextInt();
		ler.close();
		
		if (NumeroDia == 1) {
			System.out.println("O dia da semana é domingo");
		}
		else if (NumeroDia == 2) {
			System.out.println("O dia da semana é segunda-feira");
		}
		else if (NumeroDia == 3) {
			System.out.println("O dia da semana é terça-feira");
		}
		else if (NumeroDia == 4) {
			System.out.println("O dia da semana é quarta-feira");
		}
		else if (NumeroDia == 5) {
			System.out.println("O dia da semana é quinta-feira");
		}
		else if (NumeroDia == 6) {
			System.out.println("O dia da semana é sexta-feira");
		}
		else if (NumeroDia == 7) {
			System.out.println("O dia da semana é sábado");
		}
		else {
			System.out.println("Esse número de dia da semana é inválido!");
		}
		
		
		
	}

}
