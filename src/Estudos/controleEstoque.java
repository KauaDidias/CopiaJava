package Estudos;

import java.util.Scanner;

public class controleEstoque {
public static void main(String[] args) {
	int pecasRoupa = 974;
	int escolha;
	int escolha1;
	
	Scanner ler = new Scanner(System.in);
	System.out.println("--LOJA KIM--");
	System.out.println("Escolha uma das opções:");
	System.out.println("1. Gerenciar peças");
	System.out.println("2. Gerenciamento de compras");
	System.out.println("3. Peças em falta");
	escolha = ler.nextInt();
	
	if (escolha == 1); {
		System.out.println("GERENCIAMENTO DE PEÇAS");
		System.out.println("1. Ver a quantia de peças disponíveis");
		System.out.println("2. Aumentar número de peças");
		System.out.println("3. Diminuir número de peças");
		escolha1 = ler.nextInt();
	}
	if (escolha1 == 1) {
	System.out.println("A quantidade de roupas disponíveis é igual a " + pecasRoupa); 
	}
	else if (escolha1 == 2) {
		System.out.println("Insira a quantia de peças que deseja aumentar ao estoque: ");
		
	}
	
	
	}
}
