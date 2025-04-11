package Desafios01;

import java.util.Scanner;

public class conversor 
	{
		public static void main(String[] args) 
		{
			double cotacaoMoeda, valorReal, valorConvertido; 

	//ENTRADA DE DADOS
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Escreva o valor em reais:");
		valorReal = ler.nextDouble();
		
		System.out.println("Escreva a cotação da moeda desejada:");
		cotacaoMoeda = ler.nextDouble();
		ler.close();
		
		//PROCESSAMENTO
		valorConvertido = valorReal*cotacaoMoeda; 
		
		//SAÍDA
		System.out.println("O valor convertido para a moeda desejada é:" + valorConvertido);
		}
	}

