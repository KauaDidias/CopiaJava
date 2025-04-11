package Desafios02;

import java.util.Scanner;

public class AreaTriangulo {
	public static void main(String[] args) {
		double Base, Altura, Area;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe o valor da base do triângulo:");
		Base = ler.nextDouble();
		System.out.println("Informe o valor da altura do triângulo:");
		Altura = ler.nextDouble();
		ler.close();
		
		Area = ((Base*Altura)/2);
		System.out.println("A área total do triângulo é igual a:" + Area);
	}

}
