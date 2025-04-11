package Desafios01;

import java.util.Scanner;

public class gasolina {
	public static void main(String[] args) {
		//ENTRADA DE DADOS
		double valLitro, distanciaKm, consumoMedio, totalLitros, totalGasto;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Escreva o valor do litro da gasolina:");
		valLitro = ler.nextDouble();
		
		System.out.println("Escreva o valor da distância percorrida:");
		distanciaKm = ler.nextDouble();
		
		System.out.println("Informe o valor de consumo médio de gasolina do carro (km/l)");
		consumoMedio = ler.nextDouble();
		ler.close();
		//PROCESSAMENTO
		totalLitros = distanciaKm/consumoMedio;
		totalGasto = totalLitros*valLitro;
		
		//SAÍDA
		System.out.println("O total de litros consumidos é:" + totalLitros + "litros");
		
		System.out.println("O total gasto é de R$:" + totalGasto);
		
	}

}
