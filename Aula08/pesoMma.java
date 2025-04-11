package Aula08;

import java.util.Scanner;

public class pesoMma {

	public static void main(String[] args) {
		
		String sexo;
		double peso;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Identifique o seu sexo (Masculino/Feminino)");
		sexo = ler.next();
		
		if (sexo.equals(sexo)); {
			System.out.println("Informe o seu peso: ");
			peso = ler.nextDouble();
			
			if (peso <= 57.7) {
				System.out.println("Você está na categoria peso mosca!");
			}
			else if (peso >= 56.8 & peso < 65.8) {
				System.out.println("Você está na categoria peso galo!");
			}
			else if (peso >= 65.9 & peso < 70.3) {
				System.out.println("Você está na categoria peso pena!");
			}
			else if (peso >= 70.4 & peso < 77.1) {
				System.out.println("Você está na categoria peso meio-médio!");
			}
			else if (peso >= 77.2 & peso < 84) {
				System.out.println("Você está na categoria peso médio!");
			}
			else if (peso >= 84.0 & peso < 93) {
				System.out.println("Você está na categoria peso meio-pesado!");
			}
			else if (peso > 93) {
				System.out.println("Você está na categoria peso pesado!");
			}
		
		}
		if (sexo.equals(sexo)) {
			System.out.println("Informe o seu peso");
			peso = ler.nextDouble();
			
			if (peso < 52.2) {
				System.out.println("Você está na categoria peso palha!");
			}
			else if (peso >= 52.3 & peso <= 56.7) {
				System.out.println("Você está na categoria peso mosca!");
			}
			else if (peso >= 56.8 & peso <= 61.2) {
				System.out.println("Você está na categoria peso galo!");
			}
			else if (peso > 61.2) {
				System.out.println("Você está na categoria peso pena!");
			}
			ler.close();
		}
		
	}

}
