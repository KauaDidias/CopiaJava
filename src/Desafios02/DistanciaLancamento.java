package Desafios02;

import java.util.Scanner;

public class DistanciaLancamento {
	public static void main(String[] args) {
		//ENTRADA DE DADOS
		double AnguloLancamento, VelocidadeInicial, Distancia;
		final double G = 9.8;
		
		//PROCESSAMENTO
		Scanner ler = new Scanner(System.in);
		System.out.println("Informe o valor do ângulo de lançamento (graus):");
		AnguloLancamento = Math.toRadians(ler.nextDouble());
		
		System.out.println("Informe o valor da velocidade inicial (m/s):");
		VelocidadeInicial = ler.nextDouble();
		ler.close();
		
		Distancia = (Math.pow(VelocidadeInicial, 2) * Math.sin(2 * AnguloLancamento)) / G;
		
		//SAÍDA
		System.out.println("O alcance horizontal é igual a:" + Distancia + " metros");
	}
}
