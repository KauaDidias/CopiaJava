package aula09;

import java.util.Scanner;

public class UsoTernario {
	public static void main(String[] args) {
		
		int idade;
	
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe a idade: ");
		idade = ler.nextInt();
		String mensagem = idade >= 18 
				? "Maior de Idade" 
						: "Menor de idade";
		System.out.println(mensagem);
		ler.close();
	}

}
