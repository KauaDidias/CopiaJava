package Aula08;

import java.util.Scanner;

public class poderPersonagem {
public static void main(String[] args) {
	
	int level;
	String nomePersonagem;
	
	Scanner ler = new Scanner(System.in);
	System.out.println("Informe o nome do personagem: ");
	nomePersonagem = ler.next();
	System.out.println("Informe o nível de força do(a) personagem " + nomePersonagem + " (1-100): ");
	level = ler.nextInt();
	
	if (level >= 1 && level <= 20) {
		System.out.println("A classificação de poder do jogador(a) " + nomePersonagem + " é Iniciante!");
	}
	else if (level >= 21 && level <= 50) {
		System.out.println("A classificação de poder do jogador(a) " + nomePersonagem + " é Guerreiro!");
	}
	else if (level >= 51 && level <= 80) {
		System.out.println("A classificação de poder do jogador(a) " + nomePersonagem + " é Elite!");
	}
	else if (level >= 81 && level <= 100) {
		System.out.println("A classificação de poder do jogador(a) " + nomePersonagem + " é Lendário!");
	}
	else {
		System.out.println("O nível de força indicado é inválido! O nível varia APENAS de (1-100)!");
	}
	ler.close();
	}
}
