package Aula08;

import java.util.Random;
import java.util.Scanner;

public class cobrancaPenalti {

	public static void main(String[] args) {
		int canto;
		Random random = new Random();
		int cantoGoleiro = random.nextInt(3) + 1;
		Scanner ler = new Scanner(System.in);
		System.out.println("Escolha o canto ao qual irá chutar a bola (1 - Esquerda), (2 - Meio), (3 - Direita): ");
		canto = ler.nextInt();
		
		if (cantoGoleiro != canto) {
			System.out.println("Esse chute foi um golaço!");}
		else if (cantoGoleiro == canto) {
			System.out.println("O goleiro fez uma defesaça!");
		}
			ler.close();
	}
}
