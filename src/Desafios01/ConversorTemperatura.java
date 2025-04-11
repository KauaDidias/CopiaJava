package Desafios01;

import java.util.Scanner;

public class ConversorTemperatura {
	public static void main(String[] args) {
		
	//DECLARAÇAO DE VARIÁVEIS
	double Fahrenheit;
	final double CELSIUS;
	
	Scanner ler = new Scanner(System.in);
	
	System.out.println("Digite a temperatura em Fehrenheit:");
	Fahrenheit = ler.nextDouble();
	ler.close();
	
	//PROCESSAMENTO 
	CELSIUS = (((Fahrenheit - 32)*5)/9); 
	
	//SAÍDA
	System.out.println("O valor em Celsius é:" + CELSIUS);
	}

}
