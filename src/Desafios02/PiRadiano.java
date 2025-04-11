package Desafios02;

import java.util.Scanner;

public class PiRadiano {
	
	public static void main(String[] args) {
	double Angulo, Radiano;
	
	Scanner ler = new Scanner(System.in);
	System.out.println("Informe o valor do ângulo que deseja converter para radianos:");
	Angulo = ler.nextDouble();
	ler.close();
	
	Radiano = (Math.toRadians(Angulo));
	System.out.println("O valor da conversão do ângulo informado em radianos é igual a:" + Radiano);
		
	}

}
