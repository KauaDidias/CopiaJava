package Aula08;

import java.util.Scanner;

public class geracaoJava {

	public static void main(String[] args) {

	int ano;
	
	Scanner ler = new Scanner(System.in);
	System.out.println("Indique o ano de nascimento:");
	ano = ler.nextInt();
	ler.close();
	
	if (ano > 2010) {
	    System.out.println("A pessoa é da geração Alpha");
	} else if (ano >= 1997 && ano <= 2010) {
	    System.out.println("A pessoa é da geração Z");
	}
	else if (ano >= 1981 && ano <= 1986) {
		System.out.println("A pessoa é da geração Y");
	}
	else if (ano >= 1965 && ano <= 1980) {
		System.out.println("A pessoa é da geração X");
	}
	else {
		System.out.println("A pessoa é da geração Baby Boomers");
	}
	
	}
}
