package Desafios02;

import java.util.Scanner;

public class OperacoesMatematicas {
public static void main(String[] args) {
	double valorSoma1, valorSoma2, soma, valorMenos1, valorMenos2, menos, valorVezes1, valorVezes2, vezes, valorDivisao1, valorDivisao2, divisao;
	
	Scanner ler = new Scanner(System.in);
	
	System.out.println("Digite o primeiro número da soma: ");
	valorSoma1 = ler.nextDouble();
	System.out.println("Digite o segundo número da soma: ");
	valorSoma2 = ler.nextDouble();
	soma = (valorSoma1 + valorSoma2);
	System.out.println("O valor total da soma é:" + soma);
	
	System.out.println("Digite o primeiro número da subtração: ");
	valorMenos1 = ler.nextDouble();
	System.out.println("Digite o segundo número da subtração: ");
	valorMenos2 = ler.nextDouble();
	menos = valorMenos1 - valorMenos2;
	System.out.println("O valor da subtração é igual a:" + menos);
	
	System.out.println("Digite o primeiro número da multiplicação:");
	valorVezes1 = ler.nextDouble();
	System.out.println("Digite o segundo número da multiplicação:");
	valorVezes2 = ler.nextDouble();
	vezes = valorVezes1 * valorVezes2;
	System.out.println("O valor da multiplicação é igual a:" + vezes);
	
	System.out.println("Digite o primeiro número da divisão:");
	valorDivisao1 = ler.nextDouble();
	System.out.println("Digite o segundo número da divisão:");
	valorDivisao2 = ler.nextDouble();
	divisao = valorDivisao1 / valorDivisao2;
	System.out.println("O valor da divisão é igual a:" + divisao);
	ler.close();
	
}
}
